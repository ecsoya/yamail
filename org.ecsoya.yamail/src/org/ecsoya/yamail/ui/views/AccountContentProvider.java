package org.ecsoya.yamail.ui.views;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.ecsoya.yamail.model.YamailAccount;
import org.ecsoya.yamail.model.YamailLibrary;

public class AccountContentProvider implements ITreeContentProvider {

	@Override
	public void dispose() {

	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {

	}

	@Override
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof YamailLibrary) {
			return ((YamailLibrary) parentElement).getAccounts().toArray();
		} else if (parentElement instanceof YamailAccount) {
			return ((YamailAccount) parentElement).getFolders().toArray();
		}
		return new Object[0];
	}

	@Override
	public Object getParent(Object element) {
		if (element instanceof EObject) {
			return ((EObject) element).eContainer();
		}
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		return getChildren(element).length != 0;
	}

}
