package org.ecsoya.yamail;

import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.workbench.lifecycle.PostContextCreate;
import org.eclipse.equinox.app.IApplicationContext;

@SuppressWarnings("restriction")
public class YamailLifeCycle {

	@PostContextCreate
	public void postContextCreate(final IEventBroker eventBroker,
			IApplicationContext context) {

	}
}
