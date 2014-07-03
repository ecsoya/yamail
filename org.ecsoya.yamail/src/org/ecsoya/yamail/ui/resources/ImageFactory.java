package org.ecsoya.yamail.ui.resources;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;
import org.ecsoya.yamail.YamailCore;

public class ImageFactory {

	private static ImageRegistry registry = new ImageRegistry();

	private ImageFactory() {
	}

	public static Image getImage(String path) {
		Image image = registry.get(path);
		if (image == null || image.isDisposed()) {
			getImageDescriptor(path);
		}
		return registry.get(path);
	}

	public static ImageDescriptor getImageDescriptor(String path) {
		ImageDescriptor descriptor = registry.getDescriptor(path);
		if (descriptor == null) {
			descriptor = YamailCore.create(path);
			if (descriptor != null) {
				registry.put(path, descriptor);
			}
		}
		return descriptor;
	}

	public static void dispose() {
		registry.dispose();
	}
}
