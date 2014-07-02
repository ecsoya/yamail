package org.ecsoya.yamail.xwt;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.swt.widgets.Widget;
import org.eclipse.xwt.javabean.metadata.properties.AbstractProperty;

public class CSSStyleProperty extends AbstractProperty {

	public CSSStyleProperty() {
		super("stylesheet", Widget.class);
	}

	@Override
	public void setValue(Object target, Object value)
			throws IllegalArgumentException, IllegalAccessException,
			InvocationTargetException, SecurityException, NoSuchFieldException {
		if (target instanceof Widget) {
			((Widget) target).setData("style", value);
		}
	}

	@Override
	public Object getValue(Object target) throws IllegalArgumentException,
			IllegalAccessException, InvocationTargetException,
			SecurityException, NoSuchFieldException {
		if (target instanceof Widget) {
			return ((Widget) target).getData("style");
		}
		return null;
	}

}
