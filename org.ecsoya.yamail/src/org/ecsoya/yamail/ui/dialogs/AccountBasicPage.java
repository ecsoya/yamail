package org.ecsoya.yamail.ui.dialogs;

import java.net.URL;

import org.eclipse.swt.widgets.Composite;
import org.ecsoya.yamail.model.YamailAccount;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

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
		Bundle bundle = FrameworkUtil.getBundle(getClass());
		if (bundle != null) {
			return bundle.getEntry("xwt/dialogs/AccountBasicPage.xwt");
		}
		return null;
	}

}
