package org.ecsoya.yamail;

import java.io.File;
import java.util.Collections;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.e4.ui.services.IStylingEngine;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.internal.util.BundleUtility;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.ecsoya.yamail.model.YamailFactory;
import org.ecsoya.yamail.model.YamailLibrary;
import org.ecsoya.yamail.model.YamailPackage;
import org.ecsoya.yamail.ui.resources.ImageFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;

@SuppressWarnings("restriction")
public class YamailCore implements BundleActivator {

	public static final String PLUGIN_ID = "org.ecsoya.yamail";

	public static final String ENCODING = "UTF-8";

	private static BundleContext context;

	private static IPreferenceStore preferenceStore;

	private static IStylingEngine engine;

	private static YamailLibrary library;

	private static Resource resource;

	public static YamailLibrary getLibrary() {
		if (library == null) {
			String path = getYamailRoot() + File.separator + "ylib.yam";
			URI uri = URI.createFileURI(path);
			ResourceSet rset = new ResourceSetImpl();
			rset.getPackageRegistry().put(YamailPackage.eNS_URI,
					YamailPackage.eINSTANCE);
			try {
				resource = rset.getResource(uri, true);
			} catch (Exception e) {
				resource = rset.createResource(uri, ENCODING);
			}
			if (!resource.getContents().isEmpty()) {
				library = (YamailLibrary) resource.getContents().get(0);
			} else {
				library = YamailFactory.eINSTANCE.createYamailLibrary();
				resource.getContents().add(library);
			}
		}
		return library;
	}

	public static String getYamailRoot() {
		String userHome = System.getProperty("user.home");
		return userHome + File.separator + ".yamail";
	}

	public static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		YamailCore.context = bundleContext;
	}

	public void stop(BundleContext bundleContext) throws Exception {
		ImageFactory.dispose();
		YamailCore.context = null;
		if (resource != null) {
			resource.save(Collections.EMPTY_MAP);
		}
	}

	public static ImageDescriptor create(String path) {
		if (path == null) {
			return null;
		}
		if (YamailCore.context != null) {
			return ImageDescriptor.createFromURL(BundleUtility.find(
					YamailCore.context.getBundle(), path));
		} else {
			Bundle bundle = FrameworkUtil.getBundle(YamailCore.class);
			return ImageDescriptor.createFromURL(BundleUtility.find(bundle,
					path));
		}
	}

	public static IStylingEngine getStylingEngine() {
		return engine;
	}

	public static void setStylingEngine(IStylingEngine engine) {
		YamailCore.engine = engine;
	}

	public static IPreferenceStore getPreferenceStore() {
		if (preferenceStore == null) {
			preferenceStore = new ScopedPreferenceStore(InstanceScope.INSTANCE,
					PLUGIN_ID);
		}
		return preferenceStore;
	}

	public static IEclipsePreferences getPreferences() {
		return InstanceScope.INSTANCE.getNode(PLUGIN_ID);
	}
}
