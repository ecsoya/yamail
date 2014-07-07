package org.ecsoya.yamail.ui.views;

import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Tree;

abstract class ColumnViewerSorter extends ViewerComparator {

	public static final int ASC = 1;
	public static final int NONE = 0;
	public static final int DESC = -1;

	private int direction = 0;
	private TreeViewerColumn column;
	private ColumnViewer viewer;

	public ColumnViewerSorter(ColumnViewer viewer, TreeViewerColumn column) {
		this.column = column;
		this.viewer = viewer;
		SelectionAdapter selectionAdapter = createSelectionAdapter();
		this.column.getColumn().addSelectionListener(selectionAdapter);
	}

	private SelectionAdapter createSelectionAdapter() {
		return new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				if (ColumnViewerSorter.this.viewer.getComparator() != null) {
					if (ColumnViewerSorter.this.viewer.getComparator() == ColumnViewerSorter.this) {
						int tdirection = ColumnViewerSorter.this.direction;
						if (tdirection == ASC) {
							setSorter(ColumnViewerSorter.this, DESC);
						} else if (tdirection == DESC) {
							setSorter(ColumnViewerSorter.this, NONE);
						}
					} else {
						setSorter(ColumnViewerSorter.this, ASC);
					}
				} else {
					setSorter(ColumnViewerSorter.this, ASC);
				}
			}
		};
	}

	public void setSorter(ColumnViewerSorter sorter, int direction) {
		Tree columnParent = column.getColumn().getParent();
		if (direction == NONE) {
			columnParent.setSortColumn(null);
			columnParent.setSortDirection(SWT.NONE);
			viewer.setComparator(null);

		} else {
			columnParent.setSortColumn(column.getColumn());
			sorter.direction = direction;
			columnParent.setSortDirection(direction == ASC ? SWT.DOWN : SWT.UP);

			if (viewer.getComparator() == sorter) {
				viewer.refresh();
			} else {
				viewer.setComparator(sorter);
			}

		}
	}

	@Override
	public int compare(Viewer viewer, Object e1, Object e2) {
		return direction * doCompare(viewer, e1, e2);
	}

	protected abstract int doCompare(Viewer viewer, Object e1, Object e2);
}