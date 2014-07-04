/**
 */
package org.ecsoya.yamail.model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Library</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ecsoya.yamail.model.YamailLibrary#getAccounts <em>Accounts</em>}</li>
 *   <li>{@link org.ecsoya.yamail.model.YamailLibrary#getSettings <em>Settings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ecsoya.yamail.model.YamailPackage#getYamailLibrary()
 * @model
 * @generated
 */
public interface YamailLibrary extends EObject {
	/**
	 * Returns the value of the '<em><b>Accounts</b></em>' containment reference list.
	 * The list contents are of type {@link org.ecsoya.yamail.model.YamailAccount}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accounts</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accounts</em>' containment reference list.
	 * @see org.ecsoya.yamail.model.YamailPackage#getYamailLibrary_Accounts()
	 * @model containment="true"
	 * @generated
	 */
	EList<YamailAccount> getAccounts();

	/**
	 * Returns the value of the '<em><b>Settings</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Settings</em>' map isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Settings</em>' map.
	 * @see org.ecsoya.yamail.model.YamailPackage#getYamailLibrary_Settings()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, String> getSettings();

} // YamailLibrary
