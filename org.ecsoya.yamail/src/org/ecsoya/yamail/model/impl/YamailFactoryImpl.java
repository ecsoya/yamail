/**
 */
package org.ecsoya.yamail.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.ecsoya.yamail.model.FolderType;
import org.ecsoya.yamail.model.IncomingServer;
import org.ecsoya.yamail.model.MailProtocol;
import org.ecsoya.yamail.model.OutgoingServer;
import org.ecsoya.yamail.model.Yamail;
import org.ecsoya.yamail.model.YamailAccount;
import org.ecsoya.yamail.model.YamailFactory;
import org.ecsoya.yamail.model.YamailFolder;
import org.ecsoya.yamail.model.YamailLibrary;
import org.ecsoya.yamail.model.YamailPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class YamailFactoryImpl extends EFactoryImpl implements YamailFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static YamailFactory init() {
		try {
			YamailFactory theYamailFactory = (YamailFactory) EPackage.Registry.INSTANCE
					.getEFactory(YamailPackage.eNS_URI);
			if (theYamailFactory != null) {
				return theYamailFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new YamailFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public YamailFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case YamailPackage.YAMAIL_LIBRARY:
			return createYamailLibrary();
		case YamailPackage.YAMAIL_ACCOUNT:
			return createYamailAccount();
		case YamailPackage.INCOMING_SERVER:
			return createIncomingServer();
		case YamailPackage.OUTGOING_SERVER:
			return createOutgoingServer();
		case YamailPackage.YAMAIL_FOLDER:
			return createYamailFolder();
		case YamailPackage.YAMAIL:
			return createYamail();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case YamailPackage.MAIL_PROTOCOL:
			return createMailProtocolFromString(eDataType, initialValue);
		case YamailPackage.FOLDER_TYPE:
			return createFolderTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case YamailPackage.MAIL_PROTOCOL:
			return convertMailProtocolToString(eDataType, instanceValue);
		case YamailPackage.FOLDER_TYPE:
			return convertFolderTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public YamailLibrary createYamailLibrary() {
		YamailLibraryImpl yamailLibrary = new YamailLibraryImpl();
		return yamailLibrary;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public YamailAccount createYamailAccount() {
		YamailAccountImpl yamailAccount = new YamailAccountImpl();
		return yamailAccount;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Yamail createYamail() {
		YamailImpl yamail = new YamailImpl();
		return yamail;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IncomingServer createIncomingServer() {
		IncomingServerImpl incomingServer = new IncomingServerImpl();
		return incomingServer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OutgoingServer createOutgoingServer() {
		OutgoingServerImpl outgoingServer = new OutgoingServerImpl();
		return outgoingServer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public YamailFolder createYamailFolder() {
		YamailFolderImpl yamailFolder = new YamailFolderImpl();
		return yamailFolder;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MailProtocol createMailProtocolFromString(EDataType eDataType,
			String initialValue) {
		MailProtocol result = MailProtocol.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertMailProtocolToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FolderType createFolderTypeFromString(EDataType eDataType,
			String initialValue) {
		FolderType result = FolderType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertFolderTypeToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public YamailPackage getYamailPackage() {
		return (YamailPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static YamailPackage getPackage() {
		return YamailPackage.eINSTANCE;
	}

} // YamailFactoryImpl
