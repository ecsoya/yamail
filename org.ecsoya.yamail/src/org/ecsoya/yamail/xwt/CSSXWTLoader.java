package org.ecsoya.yamail.xwt;

import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.swt.widgets.Widget;
import org.eclipse.xwt.IXWTLoader;
import org.eclipse.xwt.XWT;
import org.eclipse.xwt.XWTLoader;
import org.eclipse.xwt.XWTLoaderManager;
import org.eclipse.xwt.javabean.metadata.Metaclass;
import org.eclipse.xwt.metadata.IMetaclass;

public class CSSXWTLoader extends XWTLoader {

	public static final String XWT_CSS_NS = "http://www.eclipse.org/xwt/css";
	public static final String XWT_CSS_CLASS_NAME = "Style";
	private IMetaclass cssStyleMetaclass;

	public CSSXWTLoader() {
		super();
		cssStyleMetaclass = new Metaclass(CSSStyle.class, null, true, this);
		IMetaclass metaclass = XWT.getMetaclass(Widget.class);
		if (metaclass != null) {
			metaclass.addProperty(new CSSStyleProperty());
		}
	}

	public IMetaclass getMetaclass(String tagName, String ns) {
		if (XWT_CSS_NS.equals(ns)
				&& XWT_CSS_CLASS_NAME.equalsIgnoreCase(tagName)) {
			return cssStyleMetaclass;
		}
		return super.getMetaclass(tagName, ns);
	}

	@Override
	protected Map<String, Object> prepareOptions(Map<String, Object> options,
			URL url) {
		if (options == null || options == Collections.EMPTY_MAP) {
			options = new HashMap<String, Object>();
		}
		final CSSXWTCallback callback = new CSSXWTCallback();
		options.put(IXWTLoader.CREATED_CALLBACK, callback);
		options.put(IXWTLoader.LOADED_CALLBACK, callback);
		return super.prepareOptions(options, url);
	}

	public static void active() {
		// XWT.registerNamespaceHandler(XWT_CSS_NS, new CSSStyleHandler());

		CSSXWTLoader loader = new CSSXWTLoader();
		XWTLoaderManager.setActive(loader, true);
	}
}
