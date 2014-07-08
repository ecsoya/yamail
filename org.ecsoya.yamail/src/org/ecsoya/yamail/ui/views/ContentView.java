package org.ecsoya.yamail.ui.views;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.ecsoya.yamail.model.Yamail;
import org.ecsoya.yamail.utils.MailUtils;
import org.ecsoya.yamail.utils.StringUtils;

public class ContentView {

	private Composite contents;
	private Label subjectLabel;
	private Label fromLabel;
	private Label dateLabel;
	private Label toLabel;

	private Yamail currentYamail;
	private Label hiddenPart;
	private Composite visiblePart;
	private Browser browser;

	@Inject
	public ContentView() {

	}

	@PostConstruct
	public void postConstruct(Composite parent) {
		contents = new Composite(parent, SWT.BORDER);
		StackLayout layout = new StackLayout();
		contents.setLayout(layout);
		hiddenPart = new Label(contents, SWT.CENTER);
		layout.topControl = hiddenPart;

		visiblePart = new Composite(contents, SWT.NONE);
		visiblePart.setLayout(new GridLayout());

		Composite headerControl = new Composite(visiblePart, SWT.NONE);
		headerControl.setLayoutData(new GridData(GridData.FILL_HORIZONTAL
				| GridData.GRAB_HORIZONTAL));
		headerControl.setLayout(new GridLayout(2, false));
		// headerControl.setData("style", "background-color:blue;");

		Label label = new Label(headerControl, SWT.RIGHT);
		label.setText("Subject:");
		label.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
		label.setData("style", "font-weight:bold;");

		subjectLabel = new Label(headerControl, SWT.NONE);
		subjectLabel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL
				| GridData.GRAB_HORIZONTAL));

		label = new Label(headerControl, SWT.RIGHT);
		label.setText("From:");
		label.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
		label.setData("style", "font-weight:bold;");
		fromLabel = new Label(headerControl, SWT.NONE);
		fromLabel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL
				| GridData.GRAB_HORIZONTAL));

		label = new Label(headerControl, SWT.RIGHT);
		label.setText("Date:");
		label.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
		label.setData("style", "font-weight:bold;");
		dateLabel = new Label(headerControl, SWT.NONE);
		dateLabel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL
				| GridData.GRAB_HORIZONTAL));

		label = new Label(headerControl, SWT.RIGHT);
		label.setText("To:");
		label.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
		label.setData("style", "font-weight:bold;");
		toLabel = new Label(headerControl, SWT.NONE);
		toLabel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL
				| GridData.GRAB_HORIZONTAL));

		browser = new Browser(visiblePart, SWT.NONE);
		browser.setLayoutData(new GridData(GridData.FILL_BOTH
				| GridData.GRAB_HORIZONTAL | GridData.GRAB_VERTICAL));
	}

	@PreDestroy
	public void preDestroy() {

	}

	@Focus
	public void onFocus() {
		if (contents != null && !contents.isDisposed()) {
			contents.setFocus();
		}
	}

	@Inject
	public void setSelection(
			@Optional @Named(IServiceConstants.ACTIVE_SELECTION) Object selection) {
		Yamail newYamail = null;
		if (selection instanceof IStructuredSelection) {
			Object firstElement = ((IStructuredSelection) selection)
					.getFirstElement();
			if (firstElement instanceof Yamail) {
				newYamail = (Yamail) firstElement;
			}
		}
		setYamail(newYamail);
	}

	public void setYamail(Yamail newYamail) {
		boolean equals = currentYamail == null ? newYamail == null
				: currentYamail.equals(newYamail);
		if (equals) {
			return;
		}
		currentYamail = newYamail;

		if (contents == null || contents.isDisposed()) {
			return;
		}
		contents.getDisplay().asyncExec(new Runnable() {

			@Override
			public void run() {
				refresh();
			}
		});
	}

	protected void refresh() {
		if (contents == null || contents.isDisposed()) {
			return;
		}
		StackLayout layout = (StackLayout) contents.getLayout();
		if (currentYamail == null) {
			layout.topControl = hiddenPart;
		} else {
			layout.topControl = visiblePart;
			subjectLabel.setText(StringUtils.trimToEmpty(currentYamail
					.getSubject()));
			fromLabel.setText(StringUtils.toString(currentYamail.getFrom()));
			dateLabel
					.setText(StringUtils.toString(currentYamail.getSentDate()));
			toLabel.setText(StringUtils.toString(currentYamail.getRecipients()));

			String html = null;
			try {
				html = MailUtils.getHTMLText(currentYamail.getMessage());
			} catch (Exception e) {
				try {
					String text = MailUtils.getText(currentYamail.getMessage());
					if (text != null) {
						html = text;
					}
				} catch (Exception e1) {
				}
			}
			browser.setText(html == null ? "" : html);
		}
		contents.layout();
	}
}