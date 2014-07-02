package org.ecsoya.yamail.xwt;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.xwt.callback.IBeforeParsingCallback;
import org.eclipse.xwt.callback.ICreatedCallback;
import org.eclipse.xwt.callback.ILoadedCallback;
import org.eclipse.xwt.jface.JFacesHelper;
import org.ecsoya.yamail.YamailPlugin;

public class CSSXWTCallback implements ILoadedCallback, ICreatedCallback,
		IBeforeParsingCallback {

	private Map<Object, CSSStyle> cssStyleMap = new HashMap<Object, CSSStyle>();

	private Object lastSender;
	private Object currentSender;

	@Override
	public void onCreated(Object sender) {
		if (sender instanceof CSSStyle || sender instanceof Widget
				|| JFacesHelper.isViewer(sender)) {
			lastSender = currentSender;
			currentSender = sender;
			if (currentSender instanceof CSSStyle && lastSender != null) {
				cssStyleMap.put(lastSender, (CSSStyle) currentSender);
			}
		}
	}

	@Override
	public void onLoaded(Object sender) {
		if (cssStyleMap.isEmpty() || YamailPlugin.engine == null) {
			return;
		}
		Set<Entry<Object, CSSStyle>> entrySet = cssStyleMap.entrySet();
		for (Entry<Object, CSSStyle> entry : entrySet) {
			Object widget = entry.getKey();
			CSSStyle style = entry.getValue();
			String className = style.getClassName();
			String id = style.getId();
			final String script = style.getScript();
			if (className != null && id != null) {
				YamailPlugin.engine.setClassnameAndId(widget, className, id);
			} else if (className != null) {
				YamailPlugin.engine.setClassname(widget, className);
			} else if (id != null) {
				YamailPlugin.engine.setId(widget, id);
			}
			if (widget instanceof Widget) {
				final Widget wgt = (Widget) widget;
				if (script != null) {
					wgt.setData("style", script);
				}
				wgt.reskin(SWT.ALL);
			}
		}
	}

	@Override
	public String onParsing(String content) {
		return null;
	}

}
