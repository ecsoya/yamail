package org.ecsoya.yamail.ui.dialogs;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.ecsoya.yamail.model.YamailAccount;

public class AccountBasicPage extends WizardPage {

	private YamailAccount account;

	private Text nameText;
	private Text addressText;
	private Text passwordText;

	protected AccountBasicPage(YamailAccount account) {
		super("AccountBasicPage");
		this.account = account;
	}

	@Override
	public void createControl(Composite parent) {
		Composite control = new Composite(parent, SWT.NONE);
		control.setLayout(new GridLayout(2, false));

		// Display Name
		Label label = new Label(control, SWT.NONE);
		label.setText("Display Name" + ":");

		nameText = new Text(control, SWT.BORDER);
		nameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL
				| GridData.GRAB_HORIZONTAL));
		if (account != null && account.getName() != null) {
			nameText.setText(account.getName());
		}

		// Address
		label = new Label(control, SWT.NONE);
		label.setText("Address" + ":");

		addressText = new Text(control, SWT.BORDER);
		addressText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL
				| GridData.GRAB_HORIZONTAL));
		if (account != null && account.getAddress() != null) {
			addressText.setText(account.getAddress());
		}

		// Password
		label = new Label(control, SWT.NONE);
		label.setText("Password" + ":");

		passwordText = new Text(control, SWT.BORDER | SWT.PASSWORD);
		passwordText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL
				| GridData.GRAB_HORIZONTAL));
		if (account != null && account.getPassword() != null) {
			passwordText.setText(account.getPassword());
		}
	}

	public String getDisplayName() {
		if (nameText != null && !nameText.isDisposed()) {
			return nameText.getText();
		}
		return null;
	}

	public String getAddress() {
		if (addressText != null && !addressText.isDisposed()) {
			return addressText.getText();
		}
		return null;
	}

	public String getPassword() {
		if (passwordText != null && !passwordText.isDisposed()) {
			return passwordText.getText();
		}
		return null;
	}
}
