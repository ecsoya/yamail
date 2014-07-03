package org.ecsoya.yamail.runnable;

import java.io.File;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.ecsoya.yamail.YamailCore;
import org.ecsoya.yamail.model.FolderType;
import org.ecsoya.yamail.model.YamailAccount;
import org.ecsoya.yamail.model.YamailFactory;
import org.ecsoya.yamail.model.YamailFolder;
import org.ecsoya.yamail.model.YamailLibrary;
import org.ecsoya.yamail.preferences.YamailPreferences;

public class AddAccountRunnable implements IRunnableWithProgress {

	private YamailAccount account;

	public AddAccountRunnable(YamailAccount account) {
		this.account = account;
	}

	@Override
	public void run(IProgressMonitor monitor) throws InvocationTargetException,
			InterruptedException {
		monitor.beginTask("Add and Initialize Account", 2);
		try {
			monitor.setTaskName("Add account to resource");
			YamailLibrary library = YamailCore.getLibrary();
			if (library != null) {
				library.getAccounts().add(account);
			}
			monitor.worked(1);

			// init directories.
			monitor.setTaskName("Initialize directories");
			if (!account.isCustomDataPath()) {
				IEclipsePreferences preferences = YamailCore.getPreferences();
				String dataRoot = preferences.get(
						YamailPreferences.YAMIL_GOLBALE_DATA_PATH,
						YamailCore.getYamailRoot());
				String dataPath = dataRoot + File.separator
						+ account.getAddress();
				account.setDataPath(dataPath);
				new File(dataRoot).mkdirs();
			}
			monitor.worked(1);
			// create system folders
			monitor.setTaskName("Create system folders");
			createSystemFolders();
			monitor.worked(1);
		} catch (Exception e) {
			throw new InvocationTargetException(e, "Add Account Error");
		} finally {
			monitor.done();
		}
	}

	private void createSystemFolders() {
		YamailFolder folder = YamailFactory.eINSTANCE.createYamailFolder();
		folder.setName("Inbox");
		folder.setType(FolderType.INBOX);
		folder.setSystem(true);
		account.getFolders().add(folder);

		folder = YamailFactory.eINSTANCE.createYamailFolder();
		folder.setName("Draft");
		folder.setType(FolderType.DRAFT);
		folder.setSystem(true);
		account.getFolders().add(folder);

		folder = YamailFactory.eINSTANCE.createYamailFolder();
		folder.setName("Sent");
		folder.setType(FolderType.SENT);
		folder.setSystem(true);
		account.getFolders().add(folder);

		folder = YamailFactory.eINSTANCE.createYamailFolder();
		folder.setName("Trash");
		folder.setType(FolderType.TRASH);
		folder.setSystem(true);
		account.getFolders().add(folder);

		folder = YamailFactory.eINSTANCE.createYamailFolder();
		folder.setName("Spam");
		folder.setType(FolderType.SPAM);
		folder.setSystem(true);
		account.getFolders().add(folder);
	}
}
