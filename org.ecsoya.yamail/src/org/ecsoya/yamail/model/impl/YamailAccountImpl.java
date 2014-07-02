/**
 */
package org.ecsoya.yamail.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.ecsoya.yamail.model.FolderType;
import org.ecsoya.yamail.model.IncomingServer;
import org.ecsoya.yamail.model.OutgoingServer;
import org.ecsoya.yamail.model.YamailAccount;
import org.ecsoya.yamail.model.YamailFactory;
import org.ecsoya.yamail.model.YamailFolder;
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
 * <li>{@link org.ecsoya.yamail.model.impl.YamailAccountImpl#getAddress <em>
 * Address</em>}</li>
 * <li>{@link org.ecsoya.yamail.model.impl.YamailAccountImpl#getPassword <em>
 * Password</em>}</li>
 * <li>{@link org.ecsoya.yamail.model.impl.YamailAccountImpl#getFolders <em>
 * Folders</em>}</li>
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
	 * The default value of the '{@link #getAddress() <em>Address</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFolders() <em>Folders</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFolders()
	 * @generated
	 * @ordered
	 */
	protected EList<YamailFolder> folders;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected YamailAccountImpl() {
		super();
		createSystemFolders();
	}

	private void createSystemFolders() {
		YamailFolder folder = YamailFactory.eINSTANCE.createYamailFolder();
		folder.setName("Inbox");
		folder.setType(FolderType.INBOX);
		folder.setSystem(true);
		getFolders().add(folder);

		folder = YamailFactory.eINSTANCE.createYamailFolder();
		folder.setName("Draft");
		folder.setType(FolderType.DRAFT);
		folder.setSystem(true);
		getFolders().add(folder);

		folder = YamailFactory.eINSTANCE.createYamailFolder();
		folder.setName("Sent");
		folder.setType(FolderType.SENT);
		folder.setSystem(true);
		getFolders().add(folder);

		folder = YamailFactory.eINSTANCE.createYamailFolder();
		folder.setName("Trash");
		folder.setType(FolderType.TRASH);
		folder.setSystem(true);
		getFolders().add(folder);

		folder = YamailFactory.eINSTANCE.createYamailFolder();
		folder.setName("Spam");
		folder.setType(FolderType.SPAM);
		folder.setSystem(true);
		getFolders().add(folder);
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
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					YamailPackage.YAMAIL_ACCOUNT__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					YamailPackage.YAMAIL_ACCOUNT__PASSWORD, oldPassword,
					password));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<YamailFolder> getFolders() {
		if (folders == null) {
			folders = new EObjectContainmentEList<YamailFolder>(
					YamailFolder.class, this,
					YamailPackage.YAMAIL_ACCOUNT__FOLDERS);
		}
		return folders;
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
		case YamailPackage.YAMAIL_ACCOUNT__FOLDERS:
			return ((InternalEList<?>) getFolders())
					.basicRemove(otherEnd, msgs);
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
		case YamailPackage.YAMAIL_ACCOUNT__ADDRESS:
			return getAddress();
		case YamailPackage.YAMAIL_ACCOUNT__PASSWORD:
			return getPassword();
		case YamailPackage.YAMAIL_ACCOUNT__FOLDERS:
			return getFolders();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
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
		case YamailPackage.YAMAIL_ACCOUNT__ADDRESS:
			setAddress((String) newValue);
			return;
		case YamailPackage.YAMAIL_ACCOUNT__PASSWORD:
			setPassword((String) newValue);
			return;
		case YamailPackage.YAMAIL_ACCOUNT__FOLDERS:
			getFolders().clear();
			getFolders().addAll((Collection<? extends YamailFolder>) newValue);
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
		case YamailPackage.YAMAIL_ACCOUNT__ADDRESS:
			setAddress(ADDRESS_EDEFAULT);
			return;
		case YamailPackage.YAMAIL_ACCOUNT__PASSWORD:
			setPassword(PASSWORD_EDEFAULT);
			return;
		case YamailPackage.YAMAIL_ACCOUNT__FOLDERS:
			getFolders().clear();
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
		case YamailPackage.YAMAIL_ACCOUNT__ADDRESS:
			return ADDRESS_EDEFAULT == null ? address != null
					: !ADDRESS_EDEFAULT.equals(address);
		case YamailPackage.YAMAIL_ACCOUNT__PASSWORD:
			return PASSWORD_EDEFAULT == null ? password != null
					: !PASSWORD_EDEFAULT.equals(password);
		case YamailPackage.YAMAIL_ACCOUNT__FOLDERS:
			return folders != null && !folders.isEmpty();
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
		result.append(", address: ");
		result.append(address);
		result.append(", password: ");
		result.append(password);
		result.append(')');
		return result.toString();
	}

} // YamailAccountImpl
