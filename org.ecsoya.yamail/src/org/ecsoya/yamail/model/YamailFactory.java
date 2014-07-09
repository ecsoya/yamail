/**
 */
package org.ecsoya.yamail.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * @see org.ecsoya.yamail.model.YamailPackage
 * @generated
 */
public interface YamailFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	YamailFactory eINSTANCE = org.ecsoya.yamail.model.impl.YamailFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Library</em>'.
	 * @generated
	 */
	YamailLibrary createYamailLibrary();

	/**
	 * Returns a new object of class '<em>Account</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Account</em>'.
	 * @generated
	 */
	YamailAccount createYamailAccount();

	/**
	 * Returns a new object of class '<em>Yamail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Yamail</em>'.
	 * @generated
	 */
	Yamail createYamail();

	/**
	 * Returns a new object of class '<em>Attachment</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment</em>'.
	 * @generated
	 */
	YamailAttachment createYamailAttachment();

	/**
	 * Returns a new object of class '<em>Incoming Server</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Incoming Server</em>'.
	 * @generated
	 */
	IncomingServer createIncomingServer();

	/**
	 * Returns a new object of class '<em>Outgoing Server</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Outgoing Server</em>'.
	 * @generated
	 */
	OutgoingServer createOutgoingServer();

	/**
	 * Returns a new object of class '<em>Folder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Folder</em>'.
	 * @generated
	 */
	YamailFolder createYamailFolder();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	YamailPackage getYamailPackage();

} // YamailFactory
