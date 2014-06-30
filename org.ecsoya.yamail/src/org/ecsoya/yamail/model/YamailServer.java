/**
 */
package org.ecsoya.yamail.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Server</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.ecsoya.yamail.model.YamailServer#getName <em>Name</em>}</li>
 * <li>{@link org.ecsoya.yamail.model.YamailServer#getHostName <em>Host Name
 * </em>}</li>
 * <li>{@link org.ecsoya.yamail.model.YamailServer#getPort <em>Port</em>}</li>
 * <li>{@link org.ecsoya.yamail.model.YamailServer#getUserName <em>User Name
 * </em>}</li>
 * <li>{@link org.ecsoya.yamail.model.YamailServer#getPassword <em>Password
 * </em>}</li>
 * <li>{@link org.ecsoya.yamail.model.YamailServer#getProtocol <em>Protocol
 * </em>}</li>
 * <li>{@link org.ecsoya.yamail.model.YamailServer#getTimeout <em>Timeout</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ecsoya.yamail.model.YamailPackage#getYamailServer()
 * @model abstract="true"
 * @generated
 */
public interface YamailServer extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.ecsoya.yamail.model.YamailPackage#getYamailServer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '
	 * {@link org.ecsoya.yamail.model.YamailServer#getName <em>Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Host Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Name</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Host Name</em>' attribute.
	 * @see #setHostName(String)
	 * @see org.ecsoya.yamail.model.YamailPackage#getYamailServer_HostName()
	 * @model
	 * @generated
	 */
	String getHostName();

	/**
	 * Sets the value of the '
	 * {@link org.ecsoya.yamail.model.YamailServer#getHostName
	 * <em>Host Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Host Name</em>' attribute.
	 * @see #getHostName()
	 * @generated
	 */
	void setHostName(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see org.ecsoya.yamail.model.YamailPackage#getYamailServer_Port()
	 * @model
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '
	 * {@link org.ecsoya.yamail.model.YamailServer#getPort <em>Port</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

	/**
	 * Returns the value of the '<em><b>User Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Name</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>User Name</em>' attribute.
	 * @see #setUserName(String)
	 * @see org.ecsoya.yamail.model.YamailPackage#getYamailServer_UserName()
	 * @model
	 * @generated
	 */
	String getUserName();

	/**
	 * Sets the value of the '
	 * {@link org.ecsoya.yamail.model.YamailServer#getUserName
	 * <em>User Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>User Name</em>' attribute.
	 * @see #getUserName()
	 * @generated
	 */
	void setUserName(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see org.ecsoya.yamail.model.YamailPackage#getYamailServer_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '
	 * {@link org.ecsoya.yamail.model.YamailServer#getPassword
	 * <em>Password</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute. The
	 * literals are from the enumeration
	 * {@link org.ecsoya.yamail.model.MailProtocol}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see org.ecsoya.yamail.model.MailProtocol
	 * @see #setProtocol(MailProtocol)
	 * @see org.ecsoya.yamail.model.YamailPackage#getYamailServer_Protocol()
	 * @model dataType="org.ecsoya.yamail.model.MailProtocol"
	 * @generated
	 */
	MailProtocol getProtocol();

	/**
	 * Sets the value of the '
	 * {@link org.ecsoya.yamail.model.YamailServer#getProtocol
	 * <em>Protocol</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Protocol</em>' attribute.
	 * @see org.ecsoya.yamail.model.MailProtocol
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(MailProtocol value);

	/**
	 * Returns the value of the '<em><b>Timeout</b></em>' attribute. The default
	 * value is <code>"10000"</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timeout</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Timeout</em>' attribute.
	 * @see #setTimeout(long)
	 * @see org.ecsoya.yamail.model.YamailPackage#getYamailServer_Timeout()
	 * @model default="10000"
	 * @generated
	 */
	long getTimeout();

	/**
	 * Sets the value of the '
	 * {@link org.ecsoya.yamail.model.YamailServer#getTimeout <em>Timeout</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Timeout</em>' attribute.
	 * @see #getTimeout()
	 * @generated
	 */
	void setTimeout(long value);

} // YamailServer
