package org.ecsoya.yamail.runnable;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Store;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.ecsoya.yamail.model.FolderType;
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

			File root = new File(account.getDataPath());
			if (!root.exists()) {
				root.mkdirs();
			}

			YamailFolder inbox = account.getFolder(FolderType.INBOX);
			YamailFolder spams = account.getFolder(FolderType.SPAM);
			Folder remoteInbox = store.getFolder(FolderType.INBOX.getName());
			if (monitor.isCanceled()) {
				return;
			}
			if (remoteInbox == null || !remoteInbox.exists()) {
				return;
			}
			if (!remoteInbox.isOpen()) {
				remoteInbox.open(Folder.READ_WRITE);
			}

			SpamFilter spamer = new SpamFilter(account);

			Message[] messages = remoteInbox.getMessages();
			int length = messages.length;
			SubProgressMonitor subMonitor = new SubProgressMonitor(monitor, 5);
			subMonitor.beginTask("Found " + length + " new messages.", length);
			for (Message message : messages) {
				if (monitor.isCanceled() || subMonitor.isCanceled()) {
					break;
				}
				Yamail yamail = YamailFactory.eINSTANCE.createYamail();
				yamail.setMessage(message);
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
				if (spamer.isSpam(message)) {
					spams.getMails().add(yamail);
				} else {
					inbox.getMails().add(yamail);
				}
				subMonitor.setTaskName("Remain " + (length--) + " messages");
				subMonitor.worked(1);
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
