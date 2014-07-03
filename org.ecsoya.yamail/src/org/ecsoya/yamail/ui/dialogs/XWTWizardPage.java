package org.ecsoya.yamail.ui.dialogs;

import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.HashMap;

import org.eclipse.core.databinding.AggregateValidationStatus;
import org.eclipse.core.databinding.observable.ChangeEvent;
import org.eclipse.core.databinding.observable.IChangeListener;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.databinding.swt.ISWTObservable;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.IWizardContainer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.xwt.XWT;
import org.eclipse.xwt.XWTLoader;
import org.eclipse.xwt.databinding.BindingContext;
import org.eclipse.xwt.internal.core.UIResource;
import org.ecsoya.yamail.xwt.CSSXWTLoader;

public abstract class XWTWizardPage extends WizardPage {

	private Object dataContext;
	private BindingContext bindingContext;
	private AggregateValidationStatus validationStatus;

	private PageStateManager pageStateManager = new PageStateManager();

	private UIResource uiResource;

	class PageStateManager implements IChangeListener {
		public void handleChange(ChangeEvent event) {
			Object source = event.getSource();
			if (!(source instanceof ISWTObservable)) {
				setPageComplete(false);
			}
		}
	}

	protected XWTWizardPage(String pageName, String title,
			ImageDescriptor titleImage, Object dataContext) {
		this(pageName, title, titleImage, dataContext, null);
	}

	protected XWTWizardPage(String pageName, String title,
			ImageDescriptor titleImage, Object dataContext,
			UIResource uiResource) {
		this(pageName, title, titleImage, dataContext, null, uiResource);
	}

	protected XWTWizardPage(String pageName, String title,
			ImageDescriptor titleImage, Object dataContext,
			BindingContext bindingContext, UIResource uiResource) {
		super(pageName, title, null);
		this.dataContext = dataContext;
		this.bindingContext = bindingContext;
		this.uiResource = uiResource;
	}

	public void createControl(Composite _parent) {
		if (bindingContext == null) {
			bindingContext = new BindingContext(_parent);
		}
		validationStatus = bindingContext.getStatus();
		validationStatus.addChangeListener(new IChangeListener() {
			public void handleChange(ChangeEvent event) {
				final IStatus status = (IStatus) validationStatus.getValue();
				int messageType = toMessageType(status.getSeverity());
				if (IMessageProvider.ERROR == messageType) {
					setErrorMessage(status.getMessage());
				} else if (IMessageProvider.INFORMATION == messageType
						|| IMessageProvider.WARNING == messageType) {
					setMessage(status.getMessage(), messageType);
				}
				if (IStatus.OK == status.getSeverity()) {
					setErrorMessage(null);
				}
				_parent.getDisplay().asyncExec(new Runnable() {

					@Override
					public void run() {
						setPageComplete(status.getSeverity() < IStatus.ERROR);
					}
				});
			}
		});

		CSSXWTLoader.active();

		ClassLoader classLoader = Thread.currentThread()
				.getContextClassLoader();
		try {
			Thread.currentThread().setContextClassLoader(getClassLoader());
			HashMap<String, Object> newOptions = new HashMap<String, Object>();
			newOptions.put(XWTLoader.CONTAINER_PROPERTY, _parent);
			Object dataContext = getDataContext();
			if (dataContext != null) {
				newOptions.put(XWTLoader.DATACONTEXT_PROPERTY, dataContext);
			}
			BindingContext bindingContext = getBindingContext();
			if (bindingContext != null) {
				newOptions.put(XWTLoader.BINDING_CONTEXT_PROPERTY,
						bindingContext);
			}

			InputStream inputStream = getContentInputStream();

			Object element = null;
			if (uiResource != null) {
				element = XWT.loadWithOptions(uiResource, newOptions);
			} else {
				element = (inputStream == null ? XWT.loadWithOptions(
						getContentURL(), newOptions) : XWT.loadWithOptions(
						inputStream, getContentURL(), newOptions));
			}
			if (element instanceof Control) {
				Control control = (Control) element;
				setControl(control);
				XWT.addObservableChangeListener(control, pageStateManager);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Thread.currentThread().setContextClassLoader(classLoader);
			_parent.setVisible(true);
		}
	}

	protected Control getErrorMessageLabel() {
		IWizardContainer container = getContainer();
		if (container == null) {
			return null;
		}
		try {
			Field f = TitleAreaDialog.class.getDeclaredField("messageLabel");
			f.setAccessible(true);
			return (Control) f.get(container);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public void setMessage(String newMessage, int newType) {
		super.setMessage(newMessage, newType);
		Control label = getErrorMessageLabel();
		if (label != null) {
			if (IMessageProvider.ERROR == newType) {
				label.setData("style", "color:red;");
			} else {
				label.setData("style", "color:black;");
			}
			label.reskin(SWT.NONE);
		}
	}

	@Override
	public void setErrorMessage(String newMessage) {
		super.setErrorMessage(newMessage);
		Control label = getErrorMessageLabel();
		if (label != null) {
			if (newMessage == null) {
				label.setData("style", "color:black;");
			} else {
				label.setData("style", "color:red;");
			}
			label.reskin(SWT.NONE);
		}
	}

	protected int toMessageType(int severity) {
		if (IStatus.ERROR == severity) {
			return IMessageProvider.ERROR;
		} else if (IStatus.WARNING == severity) {
			return IMessageProvider.WARNING;
		} else if (IStatus.INFO == severity) {
			return IMessageProvider.INFORMATION;
		}
		return IMessageProvider.NONE;
	}

	@Override
	public void dispose() {
		Control control = getControl();
		if (control != null) {
			XWT.removeObservableChangeListener(control, pageStateManager);
		}
		super.dispose();
	}

	abstract protected URL getContentURL();

	protected InputStream getContentInputStream() {
		return null;
	}

	public UIResource getUIResource() {
		return uiResource;
	}

	public void setUIResource(UIResource uiResource) {
		this.uiResource = uiResource;
	}

	protected ClassLoader getClassLoader() {
		return XWTWizardPage.class.getClassLoader();
	}

	public Object getDataContext() {
		return dataContext;
	}

	public BindingContext getBindingContext() {
		return bindingContext;
	}

	public void setBindingContext(BindingContext bindingContext) {
		this.bindingContext = bindingContext;
	}

	public void update() {
		Control control = getControl();
		if (control != null && !control.isDisposed()) {
			control.getDisplay().asyncExec(new Runnable() {

				@Override
				public void run() {
					final BindingContext bindingContext = getBindingContext();
					if (bindingContext != null) {
						bindingContext.updateTargets();
						bindingContext.updateModels();
					}
				}
			});
		}
	}

}
