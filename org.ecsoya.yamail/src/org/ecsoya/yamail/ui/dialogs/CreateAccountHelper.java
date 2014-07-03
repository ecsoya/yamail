package org.ecsoya.yamail.ui.dialogs;

import javax.mail.MessagingException;

import org.eclipse.core.databinding.AggregateValidationStatus;
import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.dialogs.DialogPage;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.xwt.XWT;
import org.eclipse.xwt.databinding.IBindingContext;
import org.ecsoya.yamail.model.IncomingServer;
import org.ecsoya.yamail.model.YamailAccount;
import org.ecsoya.yamail.utils.MailUtils;

public class CreateAccountHelper {

	/**
	 * Change DataPath of a Account.
	 */
	public void changeDataFolder(Object widget, Event event) {
		YamailAccount account = (YamailAccount) XWT.getDataContext(widget);
		DirectoryDialog dlg = new DirectoryDialog(XWT.findShell(widget),
				SWT.OPEN);
		String dataPath = account.getDataPath();
		if (dataPath != null) {
			dlg.setFilterPath(dataPath);
		} else {
			dlg.setFilterPath(System.getProperty("user.home"));
		}
		String newPath = dlg.open();
		account.setDataPath(newPath);
		IBindingContext bindingContext = XWT.getBindingContext(widget);
		if (bindingContext != null) {
			bindingContext.updateTargets();
		}
		account.setCustomDataPath(true);
	}

	/**
	 * Test incomingServer connection
	 */
	public void testConnection(Object context, Event event) {
		IncomingServer incomingServer = (IncomingServer) XWT
				.getDataContext(context);
		IBindingContext bindingContext = XWT.getBindingContext(context);
		if (bindingContext != null) {
			IObservableList bindings = bindingContext.getBindings();
			for (Object object : bindings) {
				if (object instanceof Binding) {
					((Binding) object).validateTargetToModel();
				}
			}
			AggregateValidationStatus status = bindingContext.getStatus();
			IStatus value = (IStatus) status.getValue();
			Control indicator = (Control) XWT.findElementByName(context,
					"testIndicator");
			if (indicator != null) {
				indicator.setVisible(true);
				// ((GridData) indicator.getLayoutData()).exclude = false;
				indicator.getParent().layout();
				indicator.getDisplay().update();
			}
			Shell shell = XWT.findShell(context);
			Object data = shell.getData();
			WizardDialog dlg = data instanceof WizardDialog ? (WizardDialog) data
					: null;
			if (value.getSeverity() == IStatus.ERROR) {
				if (dlg != null) {
					((DialogPage) dlg.getCurrentPage())
							.setErrorMessage("Test Failed: "
									+ value.getMessage());
					dlg.updateButtons();
				} else {
					MessageDialog.openError(shell, "Test Connection Error",
							value.getMessage());
				}
			} else {
				try {
					if (MailUtils.testIncomingServer(incomingServer)) {
						if (dlg != null) {
							((DialogPage) dlg.getCurrentPage())
									.setMessage("Test Successfully");
							dlg.updateButtons();
						} else {
							MessageDialog.openConfirm(shell, "Test Connection",
									"Test Successfully.");
						}
					}
				} catch (MessagingException e) {
					StringBuffer buf = new StringBuffer(
							"Unfortunately no connection was possible. Review the errors below and rectify:\n");
					Exception next = e.getNextException();
					if (next != null) {
						buf.append(next.getMessage());
					} else {
						buf.append(e.getMessage());
					}
					if (dlg != null) {
						((DialogPage) dlg.getCurrentPage())
								.setErrorMessage(new String(buf));
						dlg.updateButtons();
					} else {
						MessageDialog.openError(shell, "Test Connection Error",
								new String(buf));
					}
				}
			}
			if (indicator != null) {
				indicator.setVisible(false);
				// ((GridData) indicator.getLayoutData()).exclude = false;
				indicator.getParent().layout();
				indicator.getDisplay().update();
			}
		}
	}
}
