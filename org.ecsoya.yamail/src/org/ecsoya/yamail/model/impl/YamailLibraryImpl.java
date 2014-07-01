/**
 */
package org.ecsoya.yamail.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.ecsoya.yamail.model.YamailAccount;
import org.ecsoya.yamail.model.YamailLibrary;
import org.ecsoya.yamail.model.YamailPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Library</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ecsoya.yamail.model.impl.YamailLibraryImpl#getAccounts <em>Accounts</em>}</li>
 *   <li>{@link org.ecsoya.yamail.model.impl.YamailLibraryImpl#getSettings <em>Settings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YamailLibraryImpl extends MinimalEObjectImpl.Container implements
		YamailLibrary {
	/**
	 * The cached value of the '{@link #getAccounts() <em>Accounts</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAccounts()
	 * @generated
	 * @ordered
	 */
	protected EList<YamailAccount> accounts;

	/**
	 * The cached value of the '{@link #getSettings() <em>Settings</em>}' map.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSettings()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> settings;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected YamailLibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return YamailPackage.Literals.YAMAIL_LIBRARY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YamailAccount> getAccounts() {
		if (accounts == null) {
			accounts = new EObjectContainmentEList<YamailAccount>(YamailAccount.class, this, YamailPackage.YAMAIL_LIBRARY__ACCOUNTS);
		}
		return accounts;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getSettings() {
		if (settings == null) {
			settings = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, YamailPackage.YAMAIL_LIBRARY__SETTINGS);
		}
		return settings;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case YamailPackage.YAMAIL_LIBRARY__ACCOUNTS:
				return ((InternalEList<?>)getAccounts()).basicRemove(otherEnd, msgs);
			case YamailPackage.YAMAIL_LIBRARY__SETTINGS:
				return ((InternalEList<?>)getSettings()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case YamailPackage.YAMAIL_LIBRARY__ACCOUNTS:
				return getAccounts();
			case YamailPackage.YAMAIL_LIBRARY__SETTINGS:
				if (coreType) return getSettings();
				else return getSettings().map();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case YamailPackage.YAMAIL_LIBRARY__ACCOUNTS:
				getAccounts().clear();
				getAccounts().addAll((Collection<? extends YamailAccount>)newValue);
				return;
			case YamailPackage.YAMAIL_LIBRARY__SETTINGS:
				((EStructuralFeature.Setting)getSettings()).set(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case YamailPackage.YAMAIL_LIBRARY__ACCOUNTS:
				getAccounts().clear();
				return;
			case YamailPackage.YAMAIL_LIBRARY__SETTINGS:
				getSettings().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case YamailPackage.YAMAIL_LIBRARY__ACCOUNTS:
				return accounts != null && !accounts.isEmpty();
			case YamailPackage.YAMAIL_LIBRARY__SETTINGS:
				return settings != null && !settings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // YamailLibraryImpl
