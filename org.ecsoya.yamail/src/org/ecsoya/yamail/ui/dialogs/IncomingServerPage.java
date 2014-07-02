package org.ecsoya.yamail.ui.dialogs;

import java.net.URL;

import org.eclipse.xwt.IConstants;
import org.ecsoya.yamail.model.IncomingServer;

public class IncomingServerPage extends XWTWizardPage {

	protected IncomingServerPage(IncomingServer incomingServer) {
		super("IncomingServerPage", "Add POP / SMPT mail Server", null,
				incomingServer);
	}

	@Override
	protected URL getContentURL() {
		return IncomingServerPage.class.getResource(IncomingServerPage.class
				.getSimpleName() + IConstants.XWT_EXTENSION_SUFFIX);
	}

}
