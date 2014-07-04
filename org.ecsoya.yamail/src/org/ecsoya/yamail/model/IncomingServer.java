/**
 */
package org.ecsoya.yamail.model;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Incoming Server</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ecsoya.yamail.model.IncomingServer#getInterval <em>Interval</em>}</li>
 *   <li>{@link org.ecsoya.yamail.model.IncomingServer#isCheck <em>Check</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ecsoya.yamail.model.YamailPackage#getIncomingServer()
 * @model
 * @generated
 */
public interface IncomingServer extends YamailServer {

	/**
	 * Returns the value of the '<em><b>Interval</b></em>' attribute.
	 * The default value is <code>"15"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval</em>' attribute.
	 * @see #setInterval(int)
	 * @see org.ecsoya.yamail.model.YamailPackage#getIncomingServer_Interval()
	 * @model default="15"
	 * @generated
	 */
	int getInterval();

	/**
	 * Sets the value of the '
	 * {@link org.ecsoya.yamail.model.IncomingServer#getInterval
	 * <em>Interval</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Interval</em>' attribute.
	 * @see #getInterval()
	 * @generated
	 */
	void setInterval(int value);

	/**
	 * Returns the value of the '<em><b>Check</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check</em>' attribute.
	 * @see #setCheck(boolean)
	 * @see org.ecsoya.yamail.model.YamailPackage#getIncomingServer_Check()
	 * @model default="true"
	 * @generated
	 */
	boolean isCheck();

	/**
	 * Sets the value of the '{@link org.ecsoya.yamail.model.IncomingServer#isCheck <em>Check</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check</em>' attribute.
	 * @see #isCheck()
	 * @generated
	 */
	void setCheck(boolean value);
} // IncomingServer
