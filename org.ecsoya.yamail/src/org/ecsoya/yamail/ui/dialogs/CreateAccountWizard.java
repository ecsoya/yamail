package org.ecsoya.yamail.ui.dialogs;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.jface.dialogs.IPageChangedListener;
import org.eclipse.jface.dialogs.PageChangedEvent;
import org.eclipse.jface.wizard.IWizardContainer;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Composite;
import org.ecsoya.yamail.model.IncomingServer;
import org.ecsoya.yamail.model.OutgoingServer;
import org.ecsoya.yamail.model.YamailAccount;
import org.ecsoya.yamail.model.YamailFactory;
import org.ecsoya.yamail.runnable.AddAccountRunnable;

public class CreateAccountWizard extends Wizard implements IPageChangedListener {

	private AccountBasicPage basicPage;
	private IncomingServerPage incomingServerPage;
	private OutgoingServerPage outgoingServerPage;

	private YamailAccount account;

	public CreateAccountWizard() {
		account = YamailFactory.eINSTANCE.createYamailAccount();
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
		Object selectedPage = event.getSelectedPage();
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
			IWizardContainer container = getContainer();
			if (container instanceof WizardDialog) {
				((WizardDialog) container).removePageChangedListener(this);
			}
		}
		if (selectedPage instanceof XWTWizardPage) {
			((XWTWizardPage) selectedPage).update();
		}
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
