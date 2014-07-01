package org.ecsoya.yamail.ui.dialogs;

import org.eclipse.jface.wizard.Wizard;
import org.ecsoya.yamail.model.YamailAccount;
import org.ecsoya.yamail.model.YamailFactory;

public class CreateAccountWizard extends Wizard {

	private AccountBasicPage basicPage;
	private IncomingServerPage incomingServerPage;
	private OutgoingServerPage outgoingServerPage;

	private YamailAccount account;
	
	public CreateAccountWizard() {
		account = YamailFactory.eINSTANCE.createYamailAccount();
		account.setAddress("jin.liu@soyatec.com");
		setWindowTitle("Add Account");
	}
	
	@Override
	public void addPages() {
		basicPage = new AccountBasicPage(account);
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
