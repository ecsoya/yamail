package org.ecsoya.yamail.ui.dialogs;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class IncomingServerPage extends WizardPage {

	protected IncomingServerPage() {
		super("IncomingServerPage");
	}

	@Override
	public void createControl(Composite parent) {
		setControl(new Label(parent, SWT.NONE));
	}

}
