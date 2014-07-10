package org.ecsoya.yamail.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.ecsoya.yamail.YamailCore;

public class YamailPreferenceInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() {
		IEclipsePreferences preferences = InstanceScope.INSTANCE
				.getNode(YamailCore.PLUGIN_ID);
		preferences.put(YamailPreferences.YAMAIL_GOLBALE_DATA_PATH,
				System.getProperty("user.home") + "/.yamail");
	}

}
