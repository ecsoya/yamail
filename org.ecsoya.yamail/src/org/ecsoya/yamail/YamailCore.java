package org.ecsoya.yamail;

import org.ecsoya.yamail.model.YamailFactory;
import org.ecsoya.yamail.model.YamailLibrary;

public class YamailCore {

	private static YamailLibrary library;

	public static YamailLibrary getLibrary() {
		if (library == null) {
			library = YamailFactory.eINSTANCE.createYamailLibrary();
		}
		return library;
	}
}
