package org.ecsoya.yamail.ui.dialogs;

import java.net.URL;

import org.eclipse.xwt.IConstants;
import org.ecsoya.yamail.model.OutgoingServer;

public class OutgoingServerPage extends XWTWizardPage {

	protected OutgoingServerPage(OutgoingServer outgoingServer) {
		super("OutgoingServerPage", "Add SMTP Mail Server", null,
				outgoingServer);
	}

	@Override
	protected URL getContentURL() {
		return OutgoingServerPage.class.getResource(OutgoingServerPage.class
				.getSimpleName() + IConstants.XWT_EXTENSION_SUFFIX);
	}

}
