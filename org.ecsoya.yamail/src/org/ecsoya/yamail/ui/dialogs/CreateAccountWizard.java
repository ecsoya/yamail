package org.ecsoya.yamail.ui.dialogs;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.dialogs.IPageChangedListener;
import org.eclipse.jface.dialogs.PageChangedEvent;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.wizard.IWizardContainer;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Composite;
import org.ecsoya.yamail.YamailCore;
import org.ecsoya.yamail.model.IncomingServer;
import org.ecsoya.yamail.model.MailProtocol;
import org.ecsoya.yamail.model.OutgoingServer;
import org.ecsoya.yamail.model.YamailAccount;
import org.ecsoya.yamail.model.YamailFactory;
import org.ecsoya.yamail.preferences.YamailPreferences;
import org.ecsoya.yamail.runnable.AddAccountRunnable;
import org.ecsoya.yamail.utils.MailUtils;
import org.ecsoya.yamail.utils.StringUtils;

public class CreateAccountWizard extends Wizard implements IPageChangedListener {

	private AccountBasicPage basicPage;
	private IncomingServerPage incomingServerPage;
	private OutgoingServerPage outgoingServerPage;

	private YamailAccount account;
	private boolean syncAddress;

	public CreateAccountWizard() {
		account = YamailFactory.eINSTANCE.createYamailAccount();

		IEclipsePreferences preferences = InstanceScope.INSTANCE
				.getNode(YamailCore.PLUGIN_ID);
		account.setDataPath(preferences.get(
				YamailPreferences.YAMIL_GOLBALE_DATA_PATH,
				System.getProperty("user.home"))
				+ "\\(your account)");

		account.setIncomingServer(YamailFactory.eINSTANCE
				.createIncomingServer());
		account.setOutgoingServer(YamailFactory.eINSTANCE
				.createOutgoingServer());
		setWindowTitle("Add Account");
	}

	@Override
	public void addPages() {
		basicPage = new AccountBasicPage(account);
		addPage(basicPage);

		incomingServerPage = new IncomingServerPage(account.getIncomingServer());
		addPage(incomingServerPage);

		outgoingServerPage = new OutgoingServerPage(account.getOutgoingServer());
		addPage(outgoingServerPage);
	}

	@Override
	public void createPageControls(Composite pageContainer) {
		super.createPageControls(pageContainer);
		IWizardContainer container = getContainer();
		if (container instanceof WizardDialog) {
			((WizardDialog) container).addPageChangedListener(this);
		}
	}

	@Override
	public void pageChanged(PageChangedEvent event) {
		final Object selectedPage = event.getSelectedPage();
		if (!syncAddress) {
			if (incomingServerPage == selectedPage) {
				IncomingServer incomingServer = account.getIncomingServer();
				if (incomingServer != null) {
					if (incomingServer.getUserName() == null) {
						incomingServer.setUserName(account.getAddress());
					}
					if (incomingServer.getPassword() == null) {
						incomingServer.setPassword(account.getPassword());
					}
				}
			} else if (outgoingServerPage == selectedPage) {
				OutgoingServer outgoingServer = account.getOutgoingServer();
				if (outgoingServer != null) {
					if (outgoingServer.getUserName() == null) {
						outgoingServer.setUserName(account.getAddress());
					}
					if (outgoingServer.getPassword() == null) {
						outgoingServer.setPassword(account.getPassword());
					}
				}
			}
		}

		// Guess server from email.
		String address = account.getAddress();
		if (account.isDetectServer() && StringUtils.isNotBlank(address)) {
			if (incomingServerPage == selectedPage) {
				try {
					setNeedsProgressMonitor(true);
					getContainer().run(true, false,
							new IRunnableWithProgress() {

								@Override
								public void run(IProgressMonitor monitor)
										throws InvocationTargetException,
										InterruptedException {
									monitor.beginTask(
											"Auto detecting mail server...", 2);
									IncomingServer incomingServer = account
											.getIncomingServer();
									monitor.worked(1);
									if (StringUtils.isEmpty(incomingServer
											.getHostName())) {
										String host = MailUtils.guessHostName(
												incomingServer, address,
												account.getPassword(),
												MailProtocol.POP);
										if (host != null) {
											incomingServer.setHostName(host);
										}
									}
									monitor.done();
									if (selectedPage instanceof XWTWizardPage) {
										((XWTWizardPage) selectedPage).update();
									}
								}
							});
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			if (outgoingServerPage == selectedPage) {

				try {
					setNeedsProgressMonitor(true);
					getContainer().run(true, false,
							new IRunnableWithProgress() {

								@Override
								public void run(IProgressMonitor monitor)
										throws InvocationTargetException,
										InterruptedException {
									monitor.beginTask(
											"Auto detecting mail server...", 2);
									OutgoingServer outgoingServer = account
											.getOutgoingServer();
									monitor.worked(1);
									if (StringUtils.isEmpty(outgoingServer
											.getHostName())) {
										String host = MailUtils.guessHostName(
												outgoingServer, address,
												account.getPassword(),
												MailProtocol.SMTP);
										if (host != null) {
											outgoingServer.setHostName(host);
										}
									}
									monitor.done();
									if (selectedPage instanceof XWTWizardPage) {
										((XWTWizardPage) selectedPage).update();
									}
								}
							});
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}

	@Override
	public void dispose() {
		IWizardContainer container = getContainer();
		if (container instanceof WizardDialog) {
			((WizardDialog) container).removePageChangedListener(this);
		}
		super.dispose();
	}

	@Override
	public boolean performFinish() {
		setNeedsProgressMonitor(true);
		try {
			getContainer().run(true, true, new AddAccountRunnable(account));
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}

}
