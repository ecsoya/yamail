package org.ecsoya.yamail.ui;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

public class StatusLineWrapper implements IProgressMonitor {

	private StatusLine statusLine;
	@Inject
	private UISynchronize sync;

	@PostConstruct
	public void createControls(Composite parent) {
		statusLine = new StatusLine(parent, SWT.NONE);
		statusLine.setCancelEnabled(true);
	}

	@Override
	public void beginTask(String name, int totalWork) {
		sync.asyncExec(new Runnable() {

			@Override
			public void run() {
				statusLine.beginTask(name, totalWork);
			}
		});
	}

	@Override
	public void done() {
		sync.asyncExec(new Runnable() {

			@Override
			public void run() {
				statusLine.done();
			}
		});
	}

	@Override
	public void internalWorked(double work) {
		sync.asyncExec(new Runnable() {

			@Override
			public void run() {
				statusLine.internalWorked(work);
			}
		});
	}

	@Override
	public boolean isCanceled() {
		return statusLine.isCanceled();
	}

	@Override
	public void setCanceled(boolean value) {
		sync.asyncExec(new Runnable() {

			@Override
			public void run() {
				statusLine.setCanceled(value);
			}
		});
	}

	@Override
	public void setTaskName(String name) {
		sync.asyncExec(new Runnable() {

			@Override
			public void run() {
				statusLine.subTask(name);
			}
		});
	}

	@Override
	public void subTask(String name) {
		sync.asyncExec(new Runnable() {

			@Override
			public void run() {
				statusLine.subTask(name);
			}
		});
	}

	@Override
	public void worked(int work) {
		sync.asyncExec(new Runnable() {

			@Override
			public void run() {
				statusLine.worked(work);
			}
		});
	}

}
