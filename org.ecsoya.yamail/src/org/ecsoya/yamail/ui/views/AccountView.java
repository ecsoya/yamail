package org.ecsoya.yamail.ui.views;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

public class AccountView {
	@Inject
	public AccountView() {

	}

	@PostConstruct
	public void postConstruct(Composite parent) {
		new Text(parent, SWT.NONE).setText("Hello World");
	}

	@PreDestroy
	public void preDestroy() {

	}

	@Focus
	public void onFocus() {

	}

}