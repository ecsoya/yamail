package org.ecsoya.yamail.ui.views;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.ecsoya.yamail.model.YamailAccount;
import org.ecsoya.yamail.model.YamailFolder;
import org.ecsoya.yamail.ui.resources.ImageFactory;

public class AccountLabelProvider extends LabelProvider {

	@Override
	public String getText(Object element) {
		if (element instanceof YamailAccount) {
			YamailAccount acc = (YamailAccount) element;
//			if (acc.getName() != null) {
//				return acc.getName();
//			} else if (acc.getAddress() != null) {
				return acc.getAddress();
//			}
		} else if (element instanceof YamailFolder) {
			return ((YamailFolder) element).getName();
		}
		return super.getText(element);
	}

	@Override
	public Image getImage(Object element) {
		if (element instanceof YamailAccount){
			return ImageFactory.getImage("icons/full/obj/32/email_account.png");
		}
		if (element instanceof YamailFolder){
			return ImageFactory.getImage("icons/full/obj/32/email_account.png");
		}
		return super.getImage(element);
	}
}
