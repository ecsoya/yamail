package org.ecsoya.yamail.ui.views;

import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.IFontProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.ecsoya.yamail.model.FolderType;
import org.ecsoya.yamail.model.YamailAccount;
import org.ecsoya.yamail.model.YamailFolder;
import org.ecsoya.yamail.ui.resources.ImageFactory;

public class AccountLabelProvider extends LabelProvider implements
		IFontProvider, IColorProvider {

	@Override
	public String getText(Object element) {
		if (element instanceof YamailAccount) {
			YamailAccount acc = (YamailAccount) element;
			if (acc.getName() != null) {
				return acc.getName();
			} else if (acc.getAddress() != null) {
				return acc.getAddress();
			}
		} else if (element instanceof YamailFolder) {
			return ((YamailFolder) element).getName();
		}
		return super.getText(element);
	}

	@Override
	public Image getImage(Object element) {
		if (element instanceof YamailAccount) {
			return ImageFactory.getImage("icons/full/obj/16/email_account.png");
		}
		if (element instanceof YamailFolder) {
			YamailFolder folder = ((YamailFolder) element);
			FolderType type = folder.getType();
			if (!folder.isSystem() || type == null) {
				return ImageFactory
						.getImage("icons/full/obj/32/email_folder.png");
			} else {
				switch (type) {
				case DRAFT:
					return ImageFactory.getImage("icons/full/obj/32/email_draft.png");
				case INBOX:
					return ImageFactory.getImage("icons/full/obj/32/email_inbox.png");
				case SENT:
					return ImageFactory.getImage("icons/full/obj/32/email_sent.png");
				case SPAM:
					return ImageFactory.getImage("icons/full/obj/32/email_spam.png");
				case TRASH:
					return ImageFactory.getImage("icons/full/obj/32/email_trash.png");
				}
			}
		}
		return super.getImage(element);
	}

	@Override
	public Font getFont(Object element) {
		if (element instanceof YamailAccount) {
			return JFaceResources.getBannerFont();
		}
		return null;
	}

	@Override
	public Color getForeground(Object element) {
		if (element instanceof YamailAccount) {
			return new Color(null, 0, 0, 255);
		}
		return null;
	}

	@Override
	public Color getBackground(Object element) {
		return null;
	}
}
