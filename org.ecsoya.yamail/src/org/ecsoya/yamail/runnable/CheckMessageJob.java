package org.ecsoya.yamail.runnable;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Properties;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.internet.MimeMessage;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.ecsoya.yamail.YamailCore;
import org.ecsoya.yamail.model.IncomingServer;
import org.ecsoya.yamail.model.MailProtocol;
import org.ecsoya.yamail.model.Yamail;
import org.ecsoya.yamail.model.YamailAccount;
import org.ecsoya.yamail.model.YamailFactory;
import org.ecsoya.yamail.model.YamailFolder;
import org.ecsoya.yamail.utils.MailUtils;

public class CheckMessageJob extends Job {

	private YamailAccount[] accounts;

	public CheckMessageJob(YamailAccount... accounts) {
		super("Check Messages...");
		this.accounts = accounts;
	}

	@Override
	public IStatus run(IProgressMonitor monitor) {
		monitor.beginTask("Check mails", accounts.length * 5);

		for (YamailAccount account : accounts) {
			monitor.subTask("Get messages from " + account.getAddress());
			try {
				retrieveMails(account, monitor);
				monitor.worked(1);
			} catch (Exception e) {
				return new Status(IStatus.ERROR, YamailCore.PLUGIN_ID,
						e.getMessage(), e);
			}
		}
		monitor.done();
		return Status.OK_STATUS;
	}

	private void retrieveMails(YamailAccount account, IProgressMonitor monitor)
			throws Exception {
		if (monitor.isCanceled()) {
			throw new InterruptedException();
		}
		IncomingServer server = account.getIncomingServer();
		Store store = null;
		try {
			MailProtocol mailProtocol = server.getProtocol();
			if (mailProtocol == null) {
				throw new Exception(
						"Protocol can not found, please check your configuration.");
			}
			Properties props = MailUtils.buildProps(server);
			Session session = Session.getInstance(props);
			store = session.getStore(mailProtocol.getLiteral());
			store.connect(server.getHostName(), server.getUserName(),
					server.getPassword());

			File root = new File(account.getDataPath());
			if (!root.exists()) {
				root.mkdirs();
			}

			Folder[] list = store.getDefaultFolder().list();
			for (Folder folder : list) {
				monitor.setTaskName("Sync " + folder.getFullName() + " Folder");
				SubProgressMonitor m = new SubProgressMonitor(monitor, 5);
				syncFolder(folder, account, m);
				monitor.worked(1);
			}

		} catch (MessagingException e) {
			throw e;
		} finally {
			if (store != null) {
				store.close();
			}
		}
	}

	private void syncFolder(Folder remoteFolder, YamailAccount account,
			IProgressMonitor monitor) throws MessagingException {
		File dataPath = new File(account.getDataPath());
		if (!dataPath.exists()) {
			dataPath.mkdirs();
		}

		if (!remoteFolder.isOpen()) {
			remoteFolder.open(Folder.READ_WRITE);
		}

		int messageCount = remoteFolder.getMessageCount();
		String name = remoteFolder.getName();
		File root = new File(dataPath, name);
		if (!root.exists()) {
			root.mkdir();
		}
		monitor.beginTask("Sync messages from " + name, messageCount);
		YamailFolder yamailFolder = account.getFolder(name);
		if (yamailFolder == null) {
			yamailFolder = YamailFactory.eINSTANCE.createYamailFolder();
			yamailFolder.setName(name);
			account.getFolders().add(yamailFolder);
		}

		Message[] messages = remoteFolder.getMessages();
		int length = messages.length;
		monitor.setTaskName("Found " + length + " new messages.");
		for (Message message : messages) {
			if (monitor.isCanceled() || monitor.isCanceled()) {
				break;
			}
			Yamail yamail = YamailFactory.eINSTANCE.createYamail();
			if (message instanceof MimeMessage) {
				yamail.setMessage(new MimeMessage((MimeMessage) message));
			}
			String fileName = root.list().length + 1 + ".eml";
			yamail.setLocalFile(fileName);

			try {
				File file = new File(root, fileName);
				FileOutputStream out = new FileOutputStream(file);
				message.writeTo(out);
				out.close();
			} catch (Exception e) {
				continue;
			}
			yamailFolder.getMails().add(yamail);
			monitor.setTaskName("Remain " + (length--) + " messages");
			monitor.worked(1);
		}

		monitor.done();
	}

}
