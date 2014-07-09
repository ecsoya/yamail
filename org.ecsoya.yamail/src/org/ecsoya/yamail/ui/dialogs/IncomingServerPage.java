package org.ecsoya.yamail.ui.dialogs;

import java.net.URL;

import org.ecsoya.yamail.model.IncomingServer;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

public class IncomingServerPage extends XWTWizardPage {

	protected IncomingServerPage(IncomingServer incomingServer) {
		super("IncomingServerPage", "Add POP / SMPT mail Server", null,
				incomingServer);
	}

	@Override
	protected URL getContentURL() {
		Bundle bundle = FrameworkUtil.getBundle(getClass());
		if (bundle != null) {
			return bundle.getEntry("xwt/dialogs/IncomingServerPage.xwt");
		}
		return null;
	}

}
