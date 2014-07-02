/**
 */
package org.ecsoya.yamail.model;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Outgoing Server</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.ecsoya.yamail.model.OutgoingServer#isUseTSL <em>Use TSL</em>}</li>
 * <li>{@link org.ecsoya.yamail.model.OutgoingServer#getFromAddress <em>From
 * Address</em>}</li>
 * <li>{@link org.ecsoya.yamail.model.OutgoingServer#getEmailPrefix <em>Email
 * Prefix</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ecsoya.yamail.model.YamailPackage#getOutgoingServer()
 * @model
 * @generated
 */
public interface OutgoingServer extends YamailServer {
	/**
	 * Returns the value of the '<em><b>Use TSL</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use TSL</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Use TSL</em>' attribute.
	 * @see #setUseTSL(boolean)
	 * @see org.ecsoya.yamail.model.YamailPackage#getOutgoingServer_UseTSL()
	 * @model
	 * @generated
	 */
	boolean isUseTSL();

	/**
	 * Sets the value of the '
	 * {@link org.ecsoya.yamail.model.OutgoingServer#isUseTSL <em>Use TSL</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Use TSL</em>' attribute.
	 * @see #isUseTSL()
	 * @generated
	 */
	void setUseTSL(boolean value);

	/**
	 * Returns the value of the '<em><b>From Address</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>From Address</em>' attribute.
	 * @see #setFromAddress(String)
	 * @see org.ecsoya.yamail.model.YamailPackage#getOutgoingServer_FromAddress()
	 * @model
	 * @generated
	 */
	String getFromAddress();

	/**
	 * Sets the value of the '
	 * {@link org.ecsoya.yamail.model.OutgoingServer#getFromAddress
	 * <em>From Address</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>From Address</em>' attribute.
	 * @see #getFromAddress()
	 * @generated
	 */
	void setFromAddress(String value);

	/**
	 * Returns the value of the '<em><b>Email Prefix</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Email Prefix</em>' attribute.
	 * @see #setEmailPrefix(String)
	 * @see org.ecsoya.yamail.model.YamailPackage#getOutgoingServer_EmailPrefix()
	 * @model
	 * @generated
	 */
	String getEmailPrefix();

	/**
	 * Sets the value of the '
	 * {@link org.ecsoya.yamail.model.OutgoingServer#getEmailPrefix
	 * <em>Email Prefix</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Email Prefix</em>' attribute.
	 * @see #getEmailPrefix()
	 * @generated
	 */
	void setEmailPrefix(String value);

} // OutgoingServer
