package org.ecsoya.yamail.ui.dialogs;

import java.net.URL;

import org.ecsoya.yamail.model.OutgoingServer;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

public class OutgoingServerPage extends XWTWizardPage {

	protected OutgoingServerPage(OutgoingServer outgoingServer) {
		super("OutgoingServerPage", "Add SMTP Mail Server", null,
				outgoingServer);
	}

	@Override
	protected URL getContentURL() {
		Bundle bundle = FrameworkUtil.getBundle(getClass());
		if (bundle != null) {
			return bundle.getEntry("xwt/dialogs/OutgoingServerPage.xwt");
		}
		return null;
	}

}
