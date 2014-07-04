/**
 */
package org.ecsoya.yamail.model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Folder</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ecsoya.yamail.model.YamailFolder#getName <em>Name</em>}</li>
 *   <li>{@link org.ecsoya.yamail.model.YamailFolder#getMails <em>Mails</em>}</li>
 *   <li>{@link org.ecsoya.yamail.model.YamailFolder#isSystem <em>System</em>}</li>
 *   <li>{@link org.ecsoya.yamail.model.YamailFolder#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ecsoya.yamail.model.YamailPackage#getYamailFolder()
 * @model
 * @generated
 */
public interface YamailFolder extends EObject {
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
	 * @see org.ecsoya.yamail.model.YamailPackage#getYamailFolder_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ecsoya.yamail.model.YamailFolder#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mails</b></em>' containment reference list.
	 * The list contents are of type {@link org.ecsoya.yamail.model.Yamail}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mails</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mails</em>' containment reference list.
	 * @see org.ecsoya.yamail.model.YamailPackage#getYamailFolder_Mails()
	 * @model containment="true"
	 * @generated
	 */
	EList<Yamail> getMails();

	/**
	 * Returns the value of the '<em><b>System</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>System</em>' attribute.
	 * @see #setSystem(boolean)
	 * @see org.ecsoya.yamail.model.YamailPackage#getYamailFolder_System()
	 * @model
	 * @generated
	 */
	boolean isSystem();

	/**
	 * Sets the value of the '{@link org.ecsoya.yamail.model.YamailFolder#isSystem <em>System</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' attribute.
	 * @see #isSystem()
	 * @generated
	 */
	void setSystem(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute. The literals
	 * are from the enumeration {@link org.ecsoya.yamail.model.FolderType}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.ecsoya.yamail.model.FolderType
	 * @see #setType(FolderType)
	 * @see org.ecsoya.yamail.model.YamailPackage#getYamailFolder_Type()
	 * @model
	 * @generated
	 */
	FolderType getType();

	/**
	 * Sets the value of the '{@link org.ecsoya.yamail.model.YamailFolder#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.ecsoya.yamail.model.FolderType
	 * @see #getType()
	 * @generated
	 */
	void setType(FolderType value);

} // YamailFolder
