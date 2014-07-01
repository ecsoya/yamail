package org.ecsoya.yamail.ui.dialogs;

import java.net.URL;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.xwt.IConstants;
import org.ecsoya.yamail.model.YamailAccount;

public class AccountBasicPage extends XWTWizardPage {

	protected AccountBasicPage(YamailAccount account) {
		super("AccountBasicPage", "Account", null, account);
	}

	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);
		setMessage("Input your email address and password.");
	}

	@Override
	protected URL getContentURL() {
		return AccountBasicPage.class.getResource(AccountBasicPage.class
				.getSimpleName() + IConstants.XWT_EXTENSION_SUFFIX);
	}
}
