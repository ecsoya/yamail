package org.ecsoya.yamail.ui.views;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.layout.TreeColumnLayout;
import org.eclipse.jface.util.ConfigureColumns;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.jface.window.SameShellProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.ecsoya.yamail.model.Priority;
import org.ecsoya.yamail.model.Yamail;
import org.ecsoya.yamail.model.YamailFactory;
import org.ecsoya.yamail.model.YamailFolder;
import org.ecsoya.yamail.model.YamailPackage;
import org.ecsoya.yamail.ui.resources.ImageFactory;

public class MailsView {

	private static final String[] COLUMNS = {
			YamailPackage.Literals.YAMAIL__READ.getName(),
			// YamailPackage.Literals.YAMAIL__PRIORITY.getName(),
			// YamailPackage.Literals.YAMAIL__ATTACHMENTS.getName(),
			// YamailPackage.Literals.YAMAIL__LABEL.getName(),
			YamailPackage.Literals.YAMAIL__FROM.getName(),
			YamailPackage.Literals.YAMAIL__RECIPIENTS.getName(),
			YamailPackage.Literals.YAMAIL__SUBJECT.getName(),
			YamailPackage.Literals.YAMAIL__SENT_DATE.getName(),
			YamailPackage.Literals.YAMAIL__RECEIVED_DATE.getName(),
			YamailPackage.Literals.YAMAIL__SIZE.getName() };
	private static final int[] WEIGHTS = { 2, /* 1, 1, 2, */3, 3, 4, 2, 2, 1 };

	private TreeViewer mailsViewer;

	private Font unreadFont;

	private Color highestPriority;
	private Color highPriority;
	private Color normalPriority;
	private Color lowPriority;
	private Color lowestPriority;

	@Inject
	public MailsView() {
	}

	protected void initializeResources(Tree tree) {
		Display display = tree.getDisplay();
		Font textFont = tree.getFont();
		if (textFont != null) {
			FontData[] fontData = textFont.getFontData();
			for (FontData fd : fontData) {
				fd.setStyle(fd.getStyle() | SWT.BOLD);
			}
			unreadFont = new Font(display, fontData);
		}

		highestPriority = new Color(display, 255, 0, 0);
		highPriority = new Color(display, 125, 0, 0);
		normalPriority = new Color(display, 255, 255, 255);
		lowestPriority = new Color(display, 0, 255, 255);
		lowPriority = new Color(display, 125, 125, 125);
	}

	@PostConstruct
	public void postConstruct(Composite parent) {
		Composite treeComp = new Composite(parent, SWT.NONE);
		final TreeColumnLayout columnLayout = new TreeColumnLayout();
		treeComp.setLayout(columnLayout);
		mailsViewer = new TreeViewer(treeComp, SWT.FULL_SELECTION | SWT.BORDER);
		mailsViewer.setContentProvider(new MailsContentProvider());
		// mailsViewer.setLabelProvider(this);
		Tree tree = mailsViewer.getTree();
		initializeResources(tree);
		tree.setHeaderVisible(true);
		tree.setLinesVisible(true);

		mailsViewer.setColumnProperties(COLUMNS);
		for (int i = 0; i < COLUMNS.length; i++) {
			EStructuralFeature feature = YamailPackage.Literals.YAMAIL
					.getEStructuralFeature(COLUMNS[i]);
			int style = SWT.LEFT;
			if (YamailPackage.Literals.YAMAIL__READ == feature
					|| YamailPackage.Literals.YAMAIL__ATTACHMENTS == feature) {
				style = SWT.CENTER;
			}
			TreeViewerColumn column = new TreeViewerColumn(mailsViewer, style);
			TreeColumn item = column.getColumn();
			item.setMoveable(true);
			item.setResizable(true);
			columnLayout.setColumnData(item, new ColumnWeightData(WEIGHTS[i]));
			String displayName = getColumnDisplayName(COLUMNS[i]);
			if (YamailPackage.Literals.YAMAIL__READ == feature) {
				item.setImage(ImageFactory
						.getImage("icons/full/ctools/16/email_unread.png"));
			} else if (YamailPackage.Literals.YAMAIL__ATTACHMENTS == feature) {
				item.setImage(ImageFactory
						.getImage("icons/full/ctools/16/email_attach.png"));
			} else {
				item.setText(displayName);
			}
			item.setToolTipText(displayName);
			column.setLabelProvider(new CellLabelProvider() {

				@Override
				public void update(ViewerCell cell) {
					doUpdateCell(cell);
				}
			});
		}

		createContextMenu(mailsViewer);
		mailsViewer.setInput(createTestFolder());
	}

	private void createContextMenu(final TreeViewer viewer) {
		final MenuManager mgr = new MenuManager();
		final Tree tree = viewer.getTree();
		final Action configureColumns = new Action("Configure Columns...") {
			@Override
			public void run() {
				ConfigureColumns.forTree(tree, new SameShellProvider(tree));
			}
		};

		for (int i = 0; i < COLUMNS.length; i++) {
			String name = getColumnDisplayName(COLUMNS[i]);
			Action action = new Action(name, Action.AS_CHECK_BOX) {
				@Override
				public void run() {
					if (isChecked()) {

					} else {

					}
				}
			};
			mgr.add(action);
		}

		mgr.add(new Separator());
		mgr.add(configureColumns);

		viewer.getControl().setMenu(mgr.createContextMenu(viewer.getControl()));
	}

	private String getColumnDisplayName(String prop) {
		EStructuralFeature feature = YamailPackage.Literals.YAMAIL
				.getEStructuralFeature(prop);
		if (feature == null) {
			return prop;
		}
		if (YamailPackage.Literals.YAMAIL__READ == feature) {
			return "Read";
		} else if (YamailPackage.Literals.YAMAIL__PRIORITY == feature) {
			return "Priority";
		} else if (YamailPackage.Literals.YAMAIL__ATTACHMENTS == feature) {
			return "Attachments";
		} else if (YamailPackage.Literals.YAMAIL__LABEL == feature) {
			return "Label";
		} else if (YamailPackage.Literals.YAMAIL__FROM == feature) {
			return "From";
		} else if (YamailPackage.Literals.YAMAIL__RECIPIENTS == feature) {
			return "To";
		} else if (YamailPackage.Literals.YAMAIL__SUBJECT == feature) {
			return "Subject";
		} else if (YamailPackage.Literals.YAMAIL__SENT_DATE == feature) {
			return "Sent Time";
		} else if (YamailPackage.Literals.YAMAIL__RECEIVED_DATE == feature) {
			return "Date";
		} else if (YamailPackage.Literals.YAMAIL__SIZE == feature) {
			return "Size";
		}
		return prop;
	}

	private void doUpdateCell(ViewerCell cell) {
		int columnIndex = cell.getColumnIndex();
		Object element = cell.getElement();
		if (element instanceof DateGroup) {
			if (columnIndex == 0) {
				cell.setText(((DateGroup) element).name);
			}
		} else if (element instanceof Yamail) {
			String name = COLUMNS[columnIndex];
			EStructuralFeature feature = YamailPackage.Literals.YAMAIL
					.getEStructuralFeature(name);
			Yamail yamail = (Yamail) element;
			boolean read = yamail.isRead();
			if (YamailPackage.Literals.YAMAIL__READ == feature) {
				if (read) {
					cell.setImage(ImageFactory
							.getImage("icons/full/ctools/16/email_read.png"));
				} else {
					cell.setImage(ImageFactory
							.getImage("icons/full/ctools/16/email_unread.png"));
				}
			} else if (YamailPackage.Literals.YAMAIL__ATTACHMENTS == feature) {
				if (!yamail.getAttachments().isEmpty()) {
					cell.setImage(ImageFactory
							.getImage("icons/full/ctools/16/email_attach.png"));
				}
			} else if (YamailPackage.Literals.YAMAIL__PRIORITY == feature) {
				Priority priority = yamail.getPriority();
				switch (priority) {
				case HIGHEST:
					cell.setBackground(highestPriority);
					break;
				case HIGH:
					cell.setBackground(highPriority);
					break;
				case LOWEST:
					cell.setBackground(lowestPriority);
					break;
				case LOW:
					cell.setBackground(lowPriority);
					break;
				default:
					cell.setBackground(normalPriority);
					break;
				}
				// if (priority != null) {
				// cell.setText(priority.getLiteral());
				// }
			} else {
				Object value = yamail.eGet(feature);
				if (value != null) {
					String textValue = value.toString();
					if (value instanceof Date) {
						SimpleDateFormat format = new SimpleDateFormat(
								"yyyy/MM/dd hh:mm:ss");
						textValue = format.format(value);
					} else if (value instanceof Collection<?>) {
						StringBuffer buf = new StringBuffer();
						for (Object obj : ((Collection<?>) value)) {
							buf.append(obj.toString());
							buf.append(";");
						}
						textValue = new String(buf);
					}
					cell.setText(textValue);
				}
				if (read) {
					cell.setFont(null);
				} else {
					cell.setFont(unreadFont);
				}
			}
		}
	}

	private Object createTestFolder() {
		YamailFolder folder = YamailFactory.eINSTANCE.createYamailFolder();
		Calendar calendar = Calendar.getInstance();
		int day = calendar.get(Calendar.DAY_OF_YEAR);

		int j = 5;
		for (int i = day; i > day - 7; i--) {
			Yamail mail = YamailFactory.eINSTANCE.createYamail();
			calendar.set(Calendar.DAY_OF_YEAR, i);
			mail.setReceivedDate(calendar.getTime());
			mail.setSentDate(calendar.getTime());
			mail.setPriority(Priority.get((j++) % 5));
			mail.getFrom().add("ysh.liujin@163.com");
			mail.getRecipients().add("jin.liu@soaytec.com");
			mail.setSubject("Mail From Jin Liu of "
					+ calendar.getDisplayName(Calendar.DAY_OF_WEEK,
							Calendar.LONG_FORMAT, Locale.getDefault()));
			folder.getMails().add(mail);
		}
		return folder;
	}

	@PreDestroy
	public void preDestroy() {
		if (unreadFont != null) {
			unreadFont.dispose();
		}
		unreadFont = null;
	}

	@Focus
	public void onFocus() {
		mailsViewer.getControl().setFocus();
	}

	@Inject
	public void setSelection(
			@Optional @Named(IServiceConstants.ACTIVE_SELECTION) Object selection) {
		if (mailsViewer == null || mailsViewer.getControl() == null
				|| mailsViewer.getControl().isDisposed()) {
			return;
		}
		if (selection instanceof IStructuredSelection) {
			Object firstElement = ((IStructuredSelection) selection)
					.getFirstElement();
			if (firstElement instanceof YamailFolder) {
				mailsViewer.setInput(firstElement);
			}
		}
	}

}