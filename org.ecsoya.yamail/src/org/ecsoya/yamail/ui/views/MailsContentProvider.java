package org.ecsoya.yamail.ui.views;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.ecsoya.yamail.model.Yamail;
import org.ecsoya.yamail.model.YamailFolder;

public class MailsContentProvider implements ITreeContentProvider {

	private boolean groupingByDate = false;

	private Viewer viewer;

	private Object currentInput;

	private Map<DateGroup, List<Yamail>> datedMails;

	private List<DateGroup> dateGroups;

	public MailsContentProvider() {
		dateGroups = DateGroup.buildDateGroup();
	}

	@Override
	public void dispose() {
		if (datedMails != null) {
			datedMails.clear();
		}
		datedMails = null;
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		this.viewer = viewer;
		this.currentInput = newInput;
		boolean equals = oldInput == null ? newInput == null : oldInput
				.equals(newInput);
		if (!equals) {
			runGroupJob();
		}
	}

	private void runGroupJob() {
		if (!groupingByDate) {
			return;
		}
		Job job = new Job("Grouping By Date") {

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				if (datedMails == null) {
					datedMails = new HashMap<DateGroup, List<Yamail>>();
				}
				datedMails.clear();
				if (!(currentInput instanceof YamailFolder)) {
					return Status.OK_STATUS;
				}
				EList<Yamail> mails = ((YamailFolder) currentInput).getMails();
				for (Yamail yamail : mails) {
					Date sent = yamail.getSentDate();
					DateGroup group = findGroup(sent);
					List<Yamail> list = datedMails.get(group);
					if (list == null) {
						list = new ArrayList<Yamail>();
						datedMails.put(group, list);
					}
					list.add(yamail);
				}

				selfUpdateViewer();

				return Status.OK_STATUS;
			}
		};
		job.schedule();
	}

	protected void selfUpdateViewer() {
		if (viewer != null && viewer.getControl() != null
				&& !viewer.getControl().isDisposed()) {
			viewer.getControl().getDisplay().asyncExec(new Runnable() {

				@Override
				public void run() {
					viewer.refresh();
				}
			});
		}
	}

	@Override
	public Object[] getElements(Object inputElement) {
		if (groupingByDate) {
			if (datedMails != null) {
				Object[] array = datedMails.keySet().toArray();
				Arrays.sort(array, new Comparator<Object>() {

					@Override
					public int compare(Object o1, Object o2) {
						int s1 = ((DateGroup) o1).startDay;
						int s2 = ((DateGroup) o2).startDay;
						if (s1 > s2) {
							return -1;
						} else if (s1 < s2) {
							return 1;
						}
						return 0;
					}
				});
				return array;
			}
		}
		if (inputElement instanceof YamailFolder) {
			return ((YamailFolder) inputElement).getMails().toArray();
		}
		return new Object[0];
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof DateGroup) {
			if (datedMails != null) {
				List<Yamail> list = datedMails.get(parentElement);
				if (list != null) {
					return list.toArray();
				}
			}
		}
		return new Object[0];
	}

	@Override
	public Object getParent(Object element) {
		if (!groupingByDate) {
			if (element instanceof EObject) {
				return ((EObject) element).eContainer();
			}
		}
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		if (element instanceof DateGroup) {
			if (datedMails != null) {
				List<Yamail> list = datedMails.get(element);
				if (list != null) {
					return !list.isEmpty();
				}
			}
		}
		return false;
	}

	public boolean isGroupedByDate() {
		return groupingByDate;
	}

	public void setGroupedByDate(boolean groupedByDate) {
		this.groupingByDate = groupedByDate;
	}

	private DateGroup findGroup(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int day = calendar.get(Calendar.DAY_OF_YEAR);
		for (DateGroup dateGroup : dateGroups) {
			if (day <= dateGroup.startDay && day >= dateGroup.endDay) {
				return dateGroup;
			}
		}
		return null;
	}

}
