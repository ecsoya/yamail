/**
 */
package org.ecsoya.yamail.model;

import javax.mail.Message;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Yamail</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ecsoya.yamail.model.Yamail#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ecsoya.yamail.model.YamailPackage#getYamail()
 * @model
 * @generated
 */
public interface Yamail extends EObject {
	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(Message)
	 * @see org.ecsoya.yamail.model.YamailPackage#getYamail_Message()
	 * @model dataType="org.ecsoya.yamail.model.Message" transient="true"
	 * @generated
	 */
	Message getMessage();

	/**
	 * Sets the value of the '{@link org.ecsoya.yamail.model.Yamail#getMessage
	 * <em>Message</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(Message value);

} // Yamail
