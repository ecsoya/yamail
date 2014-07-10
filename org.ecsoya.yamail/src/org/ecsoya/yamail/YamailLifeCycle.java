package org.ecsoya.yamail;

import java.util.List;

import javax.annotation.PreDestroy;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.workbench.UIEvents;
import org.eclipse.e4.ui.workbench.lifecycle.PostContextCreate;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.IWindowCloseHandler;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialogWithToggle;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MenuDetectEvent;
import org.eclipse.swt.events.MenuDetectListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tray;
import org.eclipse.swt.widgets.TrayItem;
import org.ecsoya.yamail.preferences.YamailPreferences;
import org.ecsoya.yamail.ui.resources.ImageFactory;
import org.osgi.service.event.Event;

@SuppressWarnings("restriction")
public class YamailLifeCycle {

	private TrayItem trayItem;
	private MApplication application;
	private MWindow window;
	private Display display;

	@PostContextCreate
	public void postContextCreate(IEclipseContext eclipseContext,
			final IEventBroker eventBroker, IApplicationContext context,
			Display display) {
		this.display = display;
		eventBroker.subscribe(UIEvents.UILifeCycle.APP_STARTUP_COMPLETE,
				new org.osgi.service.event.EventHandler() {

					@Override
					public void handleEvent(Event event) {
						application = (MApplication) event
								.getProperty("org.eclipse.e4.data");
						List<MWindow> children = application.getChildren();
						EModelService service = eclipseContext
								.get(EModelService.class);
						window = service.getTopLevelWindowFor(children.get(0));
						IEclipseContext winCtx = window.getContext();
						winCtx.set(IWindowCloseHandler.class,
								new IWindowCloseHandler() {

									@Override
									public boolean close(MWindow window) {
										String option = YamailPreferences
												.getPreferences()
												.get(YamailPreferences.YAMAIL_GLOBALE_CLOSE_OPTION,
														MessageDialogWithToggle.PROMPT);

										Boolean close = null;
										if (MessageDialogWithToggle.PROMPT
												.equals(option)) {
											MessageDialogWithToggle dlg = MessageDialogWithToggle
													.openYesNoCancelQuestion(
															getShell(),
															"Close Yamail Window",
															"Are you want to quit Yamail? Press 'No' just to hide it.",
															"Never ask me again",
															false,
															YamailCore
																	.getPreferenceStore(),
															YamailPreferences.YAMAIL_GLOBALE_CLOSE_OPTION);
											int returnCode = dlg
													.getReturnCode();
											switch (returnCode) {
											case IDialogConstants.YES_ID:
											case IDialogConstants.YES_TO_ALL_ID:
											case IDialogConstants.PROCEED_ID:
											case IDialogConstants.OK_ID:
												close = Boolean.TRUE;
												break;
											case IDialogConstants.NO_ID:
											case IDialogConstants.NO_TO_ALL_ID:
												close = Boolean.FALSE;
												break;
											}
										}
										if (MessageDialogWithToggle.ALWAYS
												.equals(option)) {
											close = Boolean.TRUE;
										} else if (MessageDialogWithToggle.NEVER
												.equals(option)) {
											close = Boolean.FALSE;
										}
										if (Boolean.TRUE.equals(close)) {
											((Shell) window.getWidget())
													.dispose();
											return true;
										} else if (Boolean.FALSE.equals(close)) {
											window.setVisible(false);
											return false;
										} else {
											// Do nothing, Canceled.
											return false;
										}
									}
								});
					}
				});
		Tray systemTray = display.getSystemTray();
		if (systemTray != null) {
			trayItem = new TrayItem(systemTray, SWT.NONE);
			trayItem.setImage(ImageFactory.getImage("icons/yamail.png"));
			trayItem.setToolTipText("Yamail");
			trayItem.addListener(SWT.Selection, new Listener() {

				@Override
				public void handleEvent(org.eclipse.swt.widgets.Event event) {
					if (window != null) {
						Object widget = window.getWidget();
						if (!window.isVisible()) {
							window.setVisible(true);
							if (widget instanceof Shell) {
								Shell shell = (Shell) widget;
								shell.setVisible(true);
							}
						}
						if (!window.isOnTop()) {
							window.setOnTop(true);
							if (widget instanceof Shell) {
								Shell shell = (Shell) widget;
								shell.moveAbove(null);
							}
						} else {
							window.setOnTop(false);
							if (widget instanceof Shell) {
								Shell shell = (Shell) widget;
								shell.moveBelow(null);
							}
						}
					}
				}
			});
			trayItem.addMenuDetectListener(new MenuDetectListener() {

				@Override
				public void menuDetected(MenuDetectEvent e) {
					Shell shell = getShell();
					Menu menu = new Menu(shell, SWT.POP_UP);
					// creates a new menu item that terminates the program
					MenuItem exit = new MenuItem(menu, SWT.NONE);
					exit.setText("Quit");
					exit.addSelectionListener(new SelectionAdapter() {
						@Override
						public void widgetSelected(SelectionEvent e) {
							if (window != null) {
								window.setVisible(false);
								Object widget = window.getWidget();
								if (widget instanceof Shell) {
									((Shell) widget).dispose();
								}
							}
						}
					});
					// make the menu visible
					menu.setVisible(true);
				}

			});
		}
	}

	private Shell getShell() {
		Shell shell = display.getActiveShell();
		if (window != null) {
			shell = (Shell) window.getWidget();
		}
		return shell;
	}

	@PreDestroy
	public void dispose() {
		if (trayItem != null) {
			trayItem.dispose();
		}
	}

}
