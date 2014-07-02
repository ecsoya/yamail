package org.ecsoya.yamail.xwt;

import org.eclipse.swt.widgets.Widget;
import org.eclipse.xwt.INamespaceHandler;

public class CSSStyleHandler implements INamespaceHandler {

	@Override
	public void handleAttribute(Widget widget, Object target, String name,
			String value) {
		widget.setData("style", value);
	}

}
