package org.ecsoya.yamail.runnable;

import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Store;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.ecsoya.yamail.model.IncomingServer;
import org.ecsoya.yamail.model.MailProtocol;
import org.ecsoya.yamail.model.Yamail;
import org.ecsoya.yamail.model.YamailAccount;
import org.ecsoya.yamail.model.YamailFactory;
import org.ecsoya.yamail.model.YamailFolder;
import org.ecsoya.yamail.utils.MailUtils;

public class CheckMailRunnable implements IRunnableWithProgress {

	private YamailAccount[] accounts;

	public CheckMailRunnable(YamailAccount... accounts) {
		this.accounts = accounts;
	}

	@Override
	public void run(IProgressMonitor monitor) throws InvocationTargetException,
			InterruptedException {
		monitor.beginTask("Check mails", accounts.length * 5);

		for (YamailAccount account : accounts) {
			monitor.subTask("Get mails from " + account.getAddress());
			try {
				retrieveMails(account, monitor);
				monitor.worked(1);
			} catch (Exception e) {
				throw new InvocationTargetException(e);
			}
		}
		monitor.done();
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
			Folder[] list = store.getDefaultFolder().list();

			EList<YamailFolder> folders = account.getFolders();
			for (YamailFolder yamailFolder : folders) {
				if (monitor.isCanceled()) {
					break;
				}
				Folder folder = store.getFolder(yamailFolder.getName());
				if (folder == null || !folder.exists()) {
					continue;
				}
				if (!folder.isOpen()) {
					folder.open(Folder.READ_ONLY);
				}
				Message[] messages = folder.getMessages();
				int length = messages.length;
				SubProgressMonitor subMonitor = new SubProgressMonitor(monitor,
						5);
				subMonitor.beginTask("Found " + length + " new messages.",
						length);
				for (Message message : messages) {
					if (monitor.isCanceled() || subMonitor.isCanceled()) {
						break;
					}
					Yamail yamail = YamailFactory.eINSTANCE.createYamail();
					yamail.setMessage(message);
					yamailFolder.getMails().add(yamail);
					subMonitor
							.setTaskName("Remain " + (length--) + " messages");
					subMonitor.worked(1);
				}
			}

		} catch (MessagingException e) {
			// e.printStackTrace();
			throw e;
		} finally {
			if (store != null) {
				store.close();
			}
		}
	}

}
