/**
 */
package org.ecsoya.yamail.model.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.ecsoya.yamail.model.IncomingServer;
import org.ecsoya.yamail.model.OutgoingServer;
import org.ecsoya.yamail.model.Yamail;
import org.ecsoya.yamail.model.YamailAccount;
import org.ecsoya.yamail.model.YamailAttachment;
import org.ecsoya.yamail.model.YamailFolder;
import org.ecsoya.yamail.model.YamailLibrary;
import org.ecsoya.yamail.model.YamailPackage;
import org.ecsoya.yamail.model.YamailServer;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance
 * hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the
 * result of the switch. <!-- end-user-doc -->
 * @see org.ecsoya.yamail.model.YamailPackage
 * @generated
 */
public class YamailSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static YamailPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public YamailSwitch() {
		if (modelPackage == null) {
			modelPackage = YamailPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case YamailPackage.YAMAIL_LIBRARY: {
			YamailLibrary yamailLibrary = (YamailLibrary) theEObject;
			T result = caseYamailLibrary(yamailLibrary);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case YamailPackage.YAMAIL_ACCOUNT: {
			YamailAccount yamailAccount = (YamailAccount) theEObject;
			T result = caseYamailAccount(yamailAccount);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case YamailPackage.YAMAIL_SERVER: {
			YamailServer yamailServer = (YamailServer) theEObject;
			T result = caseYamailServer(yamailServer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case YamailPackage.INCOMING_SERVER: {
			IncomingServer incomingServer = (IncomingServer) theEObject;
			T result = caseIncomingServer(incomingServer);
			if (result == null)
				result = caseYamailServer(incomingServer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case YamailPackage.OUTGOING_SERVER: {
			OutgoingServer outgoingServer = (OutgoingServer) theEObject;
			T result = caseOutgoingServer(outgoingServer);
			if (result == null)
				result = caseYamailServer(outgoingServer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case YamailPackage.YAMAIL_FOLDER: {
			YamailFolder yamailFolder = (YamailFolder) theEObject;
			T result = caseYamailFolder(yamailFolder);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case YamailPackage.YAMAIL: {
			Yamail yamail = (Yamail) theEObject;
			T result = caseYamail(yamail);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case YamailPackage.YAMAIL_ATTACHMENT: {
			YamailAttachment yamailAttachment = (YamailAttachment) theEObject;
			T result = caseYamailAttachment(yamailAttachment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYamailLibrary(YamailLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Account</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Account</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYamailAccount(YamailAccount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYamailServer(YamailServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Yamail</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Yamail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYamail(Yamail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYamailAttachment(YamailAttachment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Incoming Server</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Incoming Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncomingServer(IncomingServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Outgoing Server</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Outgoing Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutgoingServer(OutgoingServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Folder</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Folder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYamailFolder(YamailFolder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch, but this is
	 * the last case anyway. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} // YamailSwitch
