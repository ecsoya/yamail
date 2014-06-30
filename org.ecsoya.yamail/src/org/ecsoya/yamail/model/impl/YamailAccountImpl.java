/**
 */
package org.ecsoya.yamail.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.ecsoya.yamail.model.IncomingServer;
import org.ecsoya.yamail.model.OutgoingServer;
import org.ecsoya.yamail.model.YamailAccount;
import org.ecsoya.yamail.model.YamailPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Account</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.ecsoya.yamail.model.impl.YamailAccountImpl#getName <em>Name
 * </em>}</li>
 * <li>{@link org.ecsoya.yamail.model.impl.YamailAccountImpl#getIncomingServer
 * <em>Incoming Server</em>}</li>
 * <li>{@link org.ecsoya.yamail.model.impl.YamailAccountImpl#getOutgoingServer
 * <em>Outgoing Server</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YamailAccountImpl extends MinimalEObjectImpl.Container implements
		YamailAccount {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIncomingServer()
	 * <em>Incoming Server</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getIncomingServer()
	 * @generated
	 * @ordered
	 */
	protected IncomingServer incomingServer;

	/**
	 * The cached value of the '{@link #getOutgoingServer()
	 * <em>Outgoing Server</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getOutgoingServer()
	 * @generated
	 * @ordered
	 */
	protected OutgoingServer outgoingServer;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected YamailAccountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return YamailPackage.Literals.YAMAIL_ACCOUNT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					YamailPackage.YAMAIL_ACCOUNT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IncomingServer getIncomingServer() {
		return incomingServer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetIncomingServer(
			IncomingServer newIncomingServer, NotificationChain msgs) {
		IncomingServer oldIncomingServer = incomingServer;
		incomingServer = newIncomingServer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					YamailPackage.YAMAIL_ACCOUNT__INCOMING_SERVER,
					oldIncomingServer, newIncomingServer);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setIncomingServer(IncomingServer newIncomingServer) {
		if (newIncomingServer != incomingServer) {
			NotificationChain msgs = null;
			if (incomingServer != null)
				msgs = ((InternalEObject) incomingServer)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- YamailPackage.YAMAIL_ACCOUNT__INCOMING_SERVER,
								null, msgs);
			if (newIncomingServer != null)
				msgs = ((InternalEObject) newIncomingServer)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- YamailPackage.YAMAIL_ACCOUNT__INCOMING_SERVER,
								null, msgs);
			msgs = basicSetIncomingServer(newIncomingServer, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					YamailPackage.YAMAIL_ACCOUNT__INCOMING_SERVER,
					newIncomingServer, newIncomingServer));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OutgoingServer getOutgoingServer() {
		return outgoingServer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetOutgoingServer(
			OutgoingServer newOutgoingServer, NotificationChain msgs) {
		OutgoingServer oldOutgoingServer = outgoingServer;
		outgoingServer = newOutgoingServer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					YamailPackage.YAMAIL_ACCOUNT__OUTGOING_SERVER,
					oldOutgoingServer, newOutgoingServer);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setOutgoingServer(OutgoingServer newOutgoingServer) {
		if (newOutgoingServer != outgoingServer) {
			NotificationChain msgs = null;
			if (outgoingServer != null)
				msgs = ((InternalEObject) outgoingServer)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- YamailPackage.YAMAIL_ACCOUNT__OUTGOING_SERVER,
								null, msgs);
			if (newOutgoingServer != null)
				msgs = ((InternalEObject) newOutgoingServer)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- YamailPackage.YAMAIL_ACCOUNT__OUTGOING_SERVER,
								null, msgs);
			msgs = basicSetOutgoingServer(newOutgoingServer, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					YamailPackage.YAMAIL_ACCOUNT__OUTGOING_SERVER,
					newOutgoingServer, newOutgoingServer));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case YamailPackage.YAMAIL_ACCOUNT__INCOMING_SERVER:
			return basicSetIncomingServer(null, msgs);
		case YamailPackage.YAMAIL_ACCOUNT__OUTGOING_SERVER:
			return basicSetOutgoingServer(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case YamailPackage.YAMAIL_ACCOUNT__NAME:
			return getName();
		case YamailPackage.YAMAIL_ACCOUNT__INCOMING_SERVER:
			return getIncomingServer();
		case YamailPackage.YAMAIL_ACCOUNT__OUTGOING_SERVER:
			return getOutgoingServer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case YamailPackage.YAMAIL_ACCOUNT__NAME:
			setName((String) newValue);
			return;
		case YamailPackage.YAMAIL_ACCOUNT__INCOMING_SERVER:
			setIncomingServer((IncomingServer) newValue);
			return;
		case YamailPackage.YAMAIL_ACCOUNT__OUTGOING_SERVER:
			setOutgoingServer((OutgoingServer) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case YamailPackage.YAMAIL_ACCOUNT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case YamailPackage.YAMAIL_ACCOUNT__INCOMING_SERVER:
			setIncomingServer((IncomingServer) null);
			return;
		case YamailPackage.YAMAIL_ACCOUNT__OUTGOING_SERVER:
			setOutgoingServer((OutgoingServer) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case YamailPackage.YAMAIL_ACCOUNT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case YamailPackage.YAMAIL_ACCOUNT__INCOMING_SERVER:
			return incomingServer != null;
		case YamailPackage.YAMAIL_ACCOUNT__OUTGOING_SERVER:
			return outgoingServer != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // YamailAccountImpl
