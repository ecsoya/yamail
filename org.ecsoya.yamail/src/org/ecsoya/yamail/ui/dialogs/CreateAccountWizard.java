package org.ecsoya.yamail.ui.dialogs;

import org.eclipse.jface.wizard.Wizard;

public class CreateAccountWizard extends Wizard {

	private AccountBasicPage basicPage;
	private IncomingServerPage incomingServerPage;
	private OutgoingServerPage outgoingServerPage;

	@Override
	public void addPages() {
		basicPage = new AccountBasicPage(null);
		addPage(basicPage);
		
		incomingServerPage = new IncomingServerPage();
		addPage(incomingServerPage);
		
		outgoingServerPage = new OutgoingServerPage();
		addPage(outgoingServerPage);
	}

	@Override
	public boolean performFinish() {
		return false;
	}

}
