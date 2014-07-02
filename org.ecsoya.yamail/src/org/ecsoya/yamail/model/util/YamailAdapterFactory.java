/**
 */
package org.ecsoya.yamail.model.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.ecsoya.yamail.model.IncomingServer;
import org.ecsoya.yamail.model.OutgoingServer;
import org.ecsoya.yamail.model.Yamail;
import org.ecsoya.yamail.model.YamailAccount;
import org.ecsoya.yamail.model.YamailFolder;
import org.ecsoya.yamail.model.YamailLibrary;
import org.ecsoya.yamail.model.YamailPackage;
import org.ecsoya.yamail.model.YamailServer;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides
 * an adapter <code>createXXX</code> method for each class of the model. <!--
 * end-user-doc -->
 * 
 * @see org.ecsoya.yamail.model.YamailPackage
 * @generated
 */
public class YamailAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static YamailPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public YamailAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = YamailPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc --> This implementation returns <code>true</code> if
	 * the object is either the model's package or is an instance object of the
	 * model. <!-- end-user-doc -->
	 * 
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected YamailSwitch<Adapter> modelSwitch = new YamailSwitch<Adapter>() {
		@Override
		public Adapter caseYamailLibrary(YamailLibrary object) {
			return createYamailLibraryAdapter();
		}

		@Override
		public Adapter caseYamailAccount(YamailAccount object) {
			return createYamailAccountAdapter();
		}

		@Override
		public Adapter caseYamailServer(YamailServer object) {
			return createYamailServerAdapter();
		}

		@Override
		public Adapter caseIncomingServer(IncomingServer object) {
			return createIncomingServerAdapter();
		}

		@Override
		public Adapter caseOutgoingServer(OutgoingServer object) {
			return createOutgoingServerAdapter();
		}

		@Override
		public Adapter caseYamailFolder(YamailFolder object) {
			return createYamailFolderAdapter();
		}

		@Override
		public Adapter caseYamail(Yamail object) {
			return createYamailAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param target
	 *            the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.ecsoya.yamail.model.YamailLibrary <em>Library</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.ecsoya.yamail.model.YamailLibrary
	 * @generated
	 */
	public Adapter createYamailLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.ecsoya.yamail.model.YamailAccount <em>Account</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.ecsoya.yamail.model.YamailAccount
	 * @generated
	 */
	public Adapter createYamailAccountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.ecsoya.yamail.model.YamailServer <em>Server</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.ecsoya.yamail.model.YamailServer
	 * @generated
	 */
	public Adapter createYamailServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.ecsoya.yamail.model.Yamail <em>Yamail</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.ecsoya.yamail.model.Yamail
	 * @generated
	 */
	public Adapter createYamailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.ecsoya.yamail.model.IncomingServer <em>Incoming Server</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.ecsoya.yamail.model.IncomingServer
	 * @generated
	 */
	public Adapter createIncomingServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.ecsoya.yamail.model.OutgoingServer <em>Outgoing Server</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.ecsoya.yamail.model.OutgoingServer
	 * @generated
	 */
	public Adapter createOutgoingServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.ecsoya.yamail.model.YamailFolder <em>Folder</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.ecsoya.yamail.model.YamailFolder
	 * @generated
	 */
	public Adapter createYamailFolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case. <!-- begin-user-doc --> This
	 * default implementation returns null. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // YamailAdapterFactory
