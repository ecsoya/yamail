package org.ecsoya.yamail.handlers;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.workbench.IWorkbench;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.swt.widgets.Shell;
import org.ecsoya.yamail.YamailCore;
import org.ecsoya.yamail.model.YamailAccount;
import org.ecsoya.yamail.model.YamailLibrary;
import org.ecsoya.yamail.runnable.CheckMailRunnable;

public class CheckMailHandler {
	@Execute
	public void execute(IWorkbench workbench, Shell shell) {
		YamailLibrary library = YamailCore.getLibrary();

		ProgressMonitorDialog dlg = new ProgressMonitorDialog(shell);
		YamailAccount[] array = library.getAccounts().toArray(
				new YamailAccount[0]);
		try {
			dlg.run(true, true, new CheckMailRunnable(array));
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}