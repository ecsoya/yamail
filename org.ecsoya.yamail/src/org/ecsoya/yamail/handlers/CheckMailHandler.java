package org.ecsoya.yamail.handlers;

import javax.inject.Inject;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.jobs.IJobManager;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.ProgressProvider;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.menu.MToolControl;
import org.eclipse.e4.ui.workbench.IWorkbench;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.swt.widgets.Shell;
import org.ecsoya.yamail.YamailCore;
import org.ecsoya.yamail.model.YamailAccount;
import org.ecsoya.yamail.model.YamailLibrary;
import org.ecsoya.yamail.runnable.CheckMessageJob;

public class CheckMailHandler {

	@Inject
	EModelService service;

	@Inject
	MApplication application;

	@Execute
	public void execute(IWorkbench workbench, Shell shell) {
		YamailLibrary library = YamailCore.getLibrary();

		// ProgressMonitorDialog dlg = new ProgressMonitorDialog(shell);
		YamailAccount[] array = library.getAccounts().toArray(
				new YamailAccount[0]);
		// try {
		// dlg.run(true, true, new CheckMessageJob(array));
		// } catch (InvocationTargetException e) {
		// Throwable ex = e.getTargetException();
		// Status status = new Status(IStatus.ERROR, YamailCore.PLUGIN_ID,
		// ex.getMessage(), ex);
		// ErrorDialog.openError(shell, "Check eMails",
		// "There are some problems for getting emails", status);
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }

		IJobManager jobManager = Job.getJobManager();

		MToolControl element = (MToolControl) service.find("statusbar",
				application);

		Object widget = element.getObject();
		final IProgressMonitor p = (IProgressMonitor) widget;
		jobManager.setProgressProvider(new ProgressProvider() {

			@Override
			public IProgressMonitor createMonitor(Job job) {
				return p;
			}
		});

		CheckMessageJob job = new CheckMessageJob(array);
		job.setUser(true);
		job.setSystem(true);
		job.schedule();
	}
}