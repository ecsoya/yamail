/**
 */
package org.ecsoya.yamail.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.ecsoya.yamail.model.MailProtocol;
import org.ecsoya.yamail.model.OutgoingServer;
import org.ecsoya.yamail.model.YamailPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Outgoing Server</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ecsoya.yamail.model.impl.OutgoingServerImpl#isUseTSL <em>Use TSL</em>}</li>
 *   <li>{@link org.ecsoya.yamail.model.impl.OutgoingServerImpl#getFromAddress <em>From Address</em>}</li>
 *   <li>{@link org.ecsoya.yamail.model.impl.OutgoingServerImpl#getEmailPrefix <em>Email Prefix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutgoingServerImpl extends YamailServerImpl implements
		OutgoingServer {
	/**
	 * The default value of the '{@link #isUseTSL() <em>Use TSL</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isUseTSL()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_TSL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseTSL() <em>Use TSL</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isUseTSL()
	 * @generated
	 * @ordered
	 */
	protected boolean useTSL = USE_TSL_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromAddress() <em>From Address</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFromAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String FROM_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromAddress() <em>From Address</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFromAddress()
	 * @generated
	 * @ordered
	 */
	protected String fromAddress = FROM_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmailPrefix() <em>Email Prefix</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getEmailPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmailPrefix() <em>Email Prefix</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getEmailPrefix()
	 * @generated
	 * @ordered
	 */
	protected String emailPrefix = EMAIL_PREFIX_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected OutgoingServerImpl() {
		super();
		setProtocol(MailProtocol.SMTP);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return YamailPackage.Literals.OUTGOING_SERVER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUseTSL() {
		return useTSL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseTSL(boolean newUseTSL) {
		boolean oldUseTSL = useTSL;
		useTSL = newUseTSL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					YamailPackage.OUTGOING_SERVER__USE_TSL, oldUseTSL, useTSL));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFromAddress() {
		return fromAddress;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromAddress(String newFromAddress) {
		String oldFromAddress = fromAddress;
		fromAddress = newFromAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					YamailPackage.OUTGOING_SERVER__FROM_ADDRESS,
					oldFromAddress, fromAddress));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmailPrefix() {
		return emailPrefix;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmailPrefix(String newEmailPrefix) {
		String oldEmailPrefix = emailPrefix;
		emailPrefix = newEmailPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					YamailPackage.OUTGOING_SERVER__EMAIL_PREFIX,
					oldEmailPrefix, emailPrefix));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case YamailPackage.OUTGOING_SERVER__USE_TSL:
			return isUseTSL();
		case YamailPackage.OUTGOING_SERVER__FROM_ADDRESS:
			return getFromAddress();
		case YamailPackage.OUTGOING_SERVER__EMAIL_PREFIX:
			return getEmailPrefix();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case YamailPackage.OUTGOING_SERVER__USE_TSL:
			setUseTSL((Boolean) newValue);
			return;
		case YamailPackage.OUTGOING_SERVER__FROM_ADDRESS:
			setFromAddress((String) newValue);
			return;
		case YamailPackage.OUTGOING_SERVER__EMAIL_PREFIX:
			setEmailPrefix((String) newValue);
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
		case YamailPackage.OUTGOING_SERVER__USE_TSL:
			setUseTSL(USE_TSL_EDEFAULT);
			return;
		case YamailPackage.OUTGOING_SERVER__FROM_ADDRESS:
			setFromAddress(FROM_ADDRESS_EDEFAULT);
			return;
		case YamailPackage.OUTGOING_SERVER__EMAIL_PREFIX:
			setEmailPrefix(EMAIL_PREFIX_EDEFAULT);
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
		case YamailPackage.OUTGOING_SERVER__USE_TSL:
			return useTSL != USE_TSL_EDEFAULT;
		case YamailPackage.OUTGOING_SERVER__FROM_ADDRESS:
			return FROM_ADDRESS_EDEFAULT == null ? fromAddress != null
					: !FROM_ADDRESS_EDEFAULT.equals(fromAddress);
		case YamailPackage.OUTGOING_SERVER__EMAIL_PREFIX:
			return EMAIL_PREFIX_EDEFAULT == null ? emailPrefix != null
					: !EMAIL_PREFIX_EDEFAULT.equals(emailPrefix);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (useTSL: ");
		result.append(useTSL);
		result.append(", fromAddress: ");
		result.append(fromAddress);
		result.append(", emailPrefix: ");
		result.append(emailPrefix);
		result.append(')');
		return result.toString();
	}

} // OutgoingServerImpl
