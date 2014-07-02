package org.ecsoya.yamail;

import org.eclipse.e4.ui.services.IStylingEngine;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.internal.util.BundleUtility;
import org.ecsoya.yamail.ui.resources.ImageFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;

@SuppressWarnings("restriction")
public class YamailPlugin implements BundleActivator {

	private static BundleContext context;

	public static IStylingEngine engine;

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext
	 * )
	 */
	public void start(BundleContext bundleContext) throws Exception {
		YamailPlugin.context = bundleContext;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		ImageFactory.dispose();
		YamailPlugin.context = null;
	}

	public static ImageDescriptor create(String path) {
		if (path == null) {
			return null;
		}
		if (YamailPlugin.context != null) {
			return ImageDescriptor.createFromURL(BundleUtility.find(
					YamailPlugin.context.getBundle(), path));
		} else {
			Bundle bundle = FrameworkUtil.getBundle(YamailPlugin.class);
			return ImageDescriptor.createFromURL(BundleUtility.find(bundle,
					path));
		}
	}

	public static IStylingEngine getStylingEngine() {
		return engine;
	}
}
