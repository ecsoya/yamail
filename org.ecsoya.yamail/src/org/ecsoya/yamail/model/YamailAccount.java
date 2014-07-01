/**
 */
package org.ecsoya.yamail.model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Account</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ecsoya.yamail.model.YamailAccount#getName <em>Name</em>}</li>
 *   <li>{@link org.ecsoya.yamail.model.YamailAccount#getIncomingServer <em>Incoming Server</em>}</li>
 *   <li>{@link org.ecsoya.yamail.model.YamailAccount#getOutgoingServer <em>Outgoing Server</em>}</li>
 *   <li>{@link org.ecsoya.yamail.model.YamailAccount#getAddress <em>Address</em>}</li>
 *   <li>{@link org.ecsoya.yamail.model.YamailAccount#getPassword <em>Password</em>}</li>
 *   <li>{@link org.ecsoya.yamail.model.YamailAccount#getFolders <em>Folders</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ecsoya.yamail.model.YamailPackage#getYamailAccount()
 * @model
 * @generated
 */
public interface YamailAccount extends EObject {
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
	 * @see org.ecsoya.yamail.model.YamailPackage#getYamailAccount_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ecsoya.yamail.model.YamailAccount#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Incoming Server</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Server</em>' containment reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Server</em>' containment reference.
	 * @see #setIncomingServer(IncomingServer)
	 * @see org.ecsoya.yamail.model.YamailPackage#getYamailAccount_IncomingServer()
	 * @model containment="true"
	 * @generated
	 */
	IncomingServer getIncomingServer();

	/**
	 * Sets the value of the '{@link org.ecsoya.yamail.model.YamailAccount#getIncomingServer <em>Incoming Server</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming Server</em>' containment reference.
	 * @see #getIncomingServer()
	 * @generated
	 */
	void setIncomingServer(IncomingServer value);

	/**
	 * Returns the value of the '<em><b>Outgoing Server</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Server</em>' containment reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Server</em>' containment reference.
	 * @see #setOutgoingServer(OutgoingServer)
	 * @see org.ecsoya.yamail.model.YamailPackage#getYamailAccount_OutgoingServer()
	 * @model containment="true"
	 * @generated
	 */
	OutgoingServer getOutgoingServer();

	/**
	 * Sets the value of the '{@link org.ecsoya.yamail.model.YamailAccount#getOutgoingServer <em>Outgoing Server</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outgoing Server</em>' containment reference.
	 * @see #getOutgoingServer()
	 * @generated
	 */
	void setOutgoingServer(OutgoingServer value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see org.ecsoya.yamail.model.YamailPackage#getYamailAccount_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link org.ecsoya.yamail.model.YamailAccount#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see org.ecsoya.yamail.model.YamailPackage#getYamailAccount_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link org.ecsoya.yamail.model.YamailAccount#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Folders</b></em>' containment reference list.
	 * The list contents are of type {@link org.ecsoya.yamail.model.YamailFolder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Folders</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Folders</em>' containment reference list.
	 * @see org.ecsoya.yamail.model.YamailPackage#getYamailAccount_Folders()
	 * @model containment="true"
	 * @generated
	 */
	EList<YamailFolder> getFolders();

} // YamailAccount
