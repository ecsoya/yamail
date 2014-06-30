package org.ecsoya.yamail.ui.views;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

public class HeaderView {
	@Inject
	public HeaderView() {

	}

	@PostConstruct
	public void postConstruct(Composite parent) {
		new Text(parent, SWT.NONE).setText("Mail Headers");
	}

	@PreDestroy
	public void preDestroy() {

	}

	@Focus
	public void onFocus() {

	}

}