package org.ecsoya.yamail.ui.views;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.ecsoya.yamail.YamailCore;
import org.ecsoya.yamail.model.YamailAccount;
import org.ecsoya.yamail.model.YamailFactory;
import org.ecsoya.yamail.model.YamailFolder;
import org.ecsoya.yamail.model.YamailLibrary;

public class AccountView {

	private TreeViewer accountViewer;

	@Inject
	public AccountView() {

	}

	@PostConstruct
	public void postConstruct(Composite parent) {
		accountViewer = new TreeViewer(parent, SWT.FULL_SELECTION | SWT.BORDER
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
				
				createFolders(acc);
				library.getAccounts().add(acc);

				acc = YamailFactory.eINSTANCE.createYamailAccount();
				acc.setName("Gmail");
				acc.setAddress("jin.liu.soyatec@gmail.com");
				createFolders(acc);
				library.getAccounts().add(acc);
				accountViewer.setInput(library);
			}
		});
	}

	protected void createFolders(YamailAccount acc) {
		YamailFolder folder = YamailFactory.eINSTANCE.createYamailFolder();
		folder.setName("INBOX");
		acc.getFolders().add(folder);
		
		folder = YamailFactory.eINSTANCE.createYamailFolder();
		folder.setName("DRAFT");
		acc.getFolders().add(folder);
		
		folder = YamailFactory.eINSTANCE.createYamailFolder();
		folder.setName("SENT");
		acc.getFolders().add(folder);
		
		folder = YamailFactory.eINSTANCE.createYamailFolder();
		folder.setName("TRASH");
		acc.getFolders().add(folder);
		
		folder = YamailFactory.eINSTANCE.createYamailFolder();
		folder.setName("SPAM");
		acc.getFolders().add(folder);
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