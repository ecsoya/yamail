package org.ecsoya.yamail.ui.views;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.services.IStylingEngine;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ViewForm;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.ecsoya.yamail.YamailCore;
import org.ecsoya.yamail.YamailPlugin;
import org.ecsoya.yamail.model.YamailAccount;
import org.ecsoya.yamail.model.YamailFactory;
import org.ecsoya.yamail.model.YamailLibrary;
import org.ecsoya.yamail.ui.dialogs.CreateAccountWizard;
import org.ecsoya.yamail.ui.resources.ImageFactory;

public class AccountView {

	private TreeViewer accountViewer;

	@Inject
	private IStylingEngine engine;

	@Inject
	public AccountView() {
	}

	@PostConstruct
	public void postConstruct(Composite parent) {
		YamailPlugin.engine = engine;
		ViewForm form = new ViewForm(parent, SWT.BORDER | SWT.FLAT);

		accountViewer = new TreeViewer(form, SWT.FULL_SELECTION
				| SWT.HIDE_SELECTION);
		accountViewer.setContentProvider(new AccountContentProvider());
		accountViewer.setLabelProvider(new AccountLabelProvider());
		parent.getDisplay().asyncExec(new Runnable() {

			@Override
			public void run() {
				YamailLibrary library = YamailCore.getLibrary();
				YamailAccount acc = YamailFactory.eINSTANCE
						.createYamailAccount();
				acc.setName("Soyatec");
				acc.setAddress("jin.liu@soyatec.com");

				library.getAccounts().add(acc);

				acc = YamailFactory.eINSTANCE.createYamailAccount();
				acc.setName("Gmail");
				acc.setAddress("jin.liu.soyatec@gmail.com");
				library.getAccounts().add(acc);
				accountViewer.setInput(library);
			}
		});
		form.setContent(accountViewer.getControl());

		Label label = new Label(form, SWT.NONE);
		label.setText("Accounts");
		label.setFont(JFaceResources.getBannerFont());

		form.setTopLeft(label);

		ToolBar toolbar = new ToolBar(form, SWT.FLAT);
		ToolItem toolItem = new ToolItem(toolbar, SWT.NONE);
		toolItem.setToolTipText("Add Account...");
		toolItem.setImage(ImageFactory
				.getImage("icons/full/ctools/16/add_account.png"));
		toolItem.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				WizardDialog dlg = new WizardDialog(parent.getShell(),
						new CreateAccountWizard());
				dlg.setPageSize(600, 400);
				dlg.open();
			}
		});
		form.setTopRight(toolbar);
	}

	@PreDestroy
	public void preDestroy() {
		if (accountViewer != null && accountViewer.getControl() != null) {
			accountViewer.getControl().dispose();
		}
		accountViewer = null;
	}

	@Focus
	public void onFocus() {
		if (accountViewer != null && accountViewer.getControl() != null
				&& !accountViewer.getControl().isDisposed()) {
			accountViewer.getControl().setFocus();
		}
	}

}