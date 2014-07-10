package org.ecsoya.yamail.preferences;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.ecsoya.yamail.YamailCore;

public class YamailPreferences {

	public static final String YAMAIL_GOLBALE_DATA_PATH = "yamail.global.data.path";

	public static final String YAMAIL_GLOBALE_CLOSE_OPTION = "yamail.global.close.option";

	public static IEclipsePreferences getPreferences() {
		return InstanceScope.INSTANCE.getNode(YamailCore.PLUGIN_ID);
	}
}
