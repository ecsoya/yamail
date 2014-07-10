/**
 */
package org.ecsoya.yamail.model.impl;

import java.io.InputStream;
import java.util.Date;

import javax.mail.Message;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.ecsoya.yamail.model.FolderType;
import org.ecsoya.yamail.model.IncomingServer;
import org.ecsoya.yamail.model.MailProtocol;
import org.ecsoya.yamail.model.OutgoingServer;
import org.ecsoya.yamail.model.Priority;
import org.ecsoya.yamail.model.Yamail;
import org.ecsoya.yamail.model.YamailAccount;
import org.ecsoya.yamail.model.YamailAttachment;
import org.ecsoya.yamail.model.YamailFactory;
import org.ecsoya.yamail.model.YamailFolder;
import org.ecsoya.yamail.model.YamailLibrary;
import org.ecsoya.yamail.model.YamailPackage;
import org.ecsoya.yamail.model.YamailServer;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class YamailPackageImpl extends EPackageImpl implements YamailPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yamailLibraryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yamailAccountEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yamailServerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yamailEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yamailAttachmentEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass incomingServerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outgoingServerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yamailFolderEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mailProtocolEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum folderTypeEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum priorityEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType messageEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType inputStreamEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.ecsoya.yamail.model.YamailPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private YamailPackageImpl() {
		super(eNS_URI, YamailFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model,
	 * and for any others upon which it depends.
	 * 
	 * <p>
	 * This method is used to initialize {@link YamailPackage#eINSTANCE} when
	 * that field is accessed. Clients should not invoke it directly. Instead,
	 * they should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static YamailPackage init() {
		if (isInited)
			return (YamailPackage) EPackage.Registry.INSTANCE
					.getEPackage(YamailPackage.eNS_URI);

		// Obtain or create and register package
		YamailPackageImpl theYamailPackage = (YamailPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof YamailPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new YamailPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theYamailPackage.createPackageContents();

		// Initialize created meta-data
		theYamailPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theYamailPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(YamailPackage.eNS_URI, theYamailPackage);
		return theYamailPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getYamailLibrary() {
		return yamailLibraryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getYamailLibrary_Accounts() {
		return (EReference) yamailLibraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getYamailLibrary_Settings() {
		return (EReference) yamailLibraryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getYamailAccount() {
		return yamailAccountEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getYamailAccount_Name() {
		return (EAttribute) yamailAccountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getYamailAccount_IncomingServer() {
		return (EReference) yamailAccountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getYamailAccount_OutgoingServer() {
		return (EReference) yamailAccountEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getYamailAccount_Address() {
		return (EAttribute) yamailAccountEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getYamailAccount_Password() {
		return (EAttribute) yamailAccountEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getYamailAccount_Folders() {
		return (EReference) yamailAccountEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getYamailAccount_DataPath() {
		return (EAttribute) yamailAccountEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getYamailAccount_CustomDataPath() {
		return (EAttribute) yamailAccountEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getYamailAccount_DetectServer() {
		return (EAttribute) yamailAccountEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getYamailAccount__GetFolder__Object() {
		return yamailAccountEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getYamailServer() {
		return yamailServerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getYamailServer_Name() {
		return (EAttribute) yamailServerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getYamailServer_HostName() {
		return (EAttribute) yamailServerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getYamailServer_Port() {
		return (EAttribute) yamailServerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getYamailServer_UserName() {
		return (EAttribute) yamailServerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getYamailServer_Password() {
		return (EAttribute) yamailServerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getYamailServer_Protocol() {
		return (EAttribute) yamailServerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getYamailServer_Timeout() {
		return (EAttribute) yamailServerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getYamail() {
		return yamailEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getYamail_Message() {
		return (EAttribute) yamailEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getYamail_Read() {
		return (EAttribute) yamailEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getYamail_From() {
		return (EAttribute) yamailEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getYamail_Recipients() {
		return (EAttribute) yamailEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getYamail_Subject() {
		return (EAttribute) yamailEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getYamail_ContentType() {
		return (EAttribute) yamailEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getYamail_ReceivedDate() {
		return (EAttribute) yamailEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getYamail_SentDate() {
		return (EAttribute) yamailEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getYamail_Content() {
		return (EAttribute) yamailEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getYamail_Headers() {
		return (EReference) yamailEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getYamail_Size() {
		return (EAttribute) yamailEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getYamail_Attachments() {
		return (EReference) yamailEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getYamail_Id() {
		return (EAttribute) yamailEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getYamail_Priority() {
		return (EAttribute) yamailEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getYamail_Label() {
		return (EAttribute) yamailEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getYamail_LocalFile() {
		return (EAttribute) yamailEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYamail_SpamScore() {
		return (EAttribute) yamailEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getYamailAttachment() {
		return yamailAttachmentEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getYamailAttachment_FileName() {
		return (EAttribute) yamailAttachmentEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getYamailAttachment_ContentType() {
		return (EAttribute) yamailAttachmentEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getYamailAttachment_Content() {
		return (EAttribute) yamailAttachmentEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIncomingServer() {
		return incomingServerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIncomingServer_Interval() {
		return (EAttribute) incomingServerEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIncomingServer_Check() {
		return (EAttribute) incomingServerEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutgoingServer() {
		return outgoingServerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOutgoingServer_UseTSL() {
		return (EAttribute) outgoingServerEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOutgoingServer_FromAddress() {
		return (EAttribute) outgoingServerEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOutgoingServer_EmailPrefix() {
		return (EAttribute) outgoingServerEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getYamailFolder() {
		return yamailFolderEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getYamailFolder_Name() {
		return (EAttribute) yamailFolderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getYamailFolder_Mails() {
		return (EReference) yamailFolderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getYamailFolder_System() {
		return (EAttribute) yamailFolderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getYamailFolder_Type() {
		return (EAttribute) yamailFolderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getYamailFolder__GetMailById__String() {
		return yamailFolderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMailProtocol() {
		return mailProtocolEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFolderType() {
		return folderTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPriority() {
		return priorityEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMessage() {
		return messageEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDate() {
		return dateEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getInputStream() {
		return inputStreamEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public YamailFactory getYamailFactory() {
		return (YamailFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		yamailLibraryEClass = createEClass(YAMAIL_LIBRARY);
		createEReference(yamailLibraryEClass, YAMAIL_LIBRARY__ACCOUNTS);
		createEReference(yamailLibraryEClass, YAMAIL_LIBRARY__SETTINGS);

		yamailAccountEClass = createEClass(YAMAIL_ACCOUNT);
		createEAttribute(yamailAccountEClass, YAMAIL_ACCOUNT__NAME);
		createEReference(yamailAccountEClass, YAMAIL_ACCOUNT__INCOMING_SERVER);
		createEReference(yamailAccountEClass, YAMAIL_ACCOUNT__OUTGOING_SERVER);
		createEAttribute(yamailAccountEClass, YAMAIL_ACCOUNT__ADDRESS);
		createEAttribute(yamailAccountEClass, YAMAIL_ACCOUNT__PASSWORD);
		createEReference(yamailAccountEClass, YAMAIL_ACCOUNT__FOLDERS);
		createEAttribute(yamailAccountEClass, YAMAIL_ACCOUNT__DATA_PATH);
		createEAttribute(yamailAccountEClass, YAMAIL_ACCOUNT__CUSTOM_DATA_PATH);
		createEAttribute(yamailAccountEClass, YAMAIL_ACCOUNT__DETECT_SERVER);
		createEOperation(yamailAccountEClass,
				YAMAIL_ACCOUNT___GET_FOLDER__OBJECT);

		yamailServerEClass = createEClass(YAMAIL_SERVER);
		createEAttribute(yamailServerEClass, YAMAIL_SERVER__NAME);
		createEAttribute(yamailServerEClass, YAMAIL_SERVER__HOST_NAME);
		createEAttribute(yamailServerEClass, YAMAIL_SERVER__PORT);
		createEAttribute(yamailServerEClass, YAMAIL_SERVER__USER_NAME);
		createEAttribute(yamailServerEClass, YAMAIL_SERVER__PASSWORD);
		createEAttribute(yamailServerEClass, YAMAIL_SERVER__PROTOCOL);
		createEAttribute(yamailServerEClass, YAMAIL_SERVER__TIMEOUT);

		incomingServerEClass = createEClass(INCOMING_SERVER);
		createEAttribute(incomingServerEClass, INCOMING_SERVER__INTERVAL);
		createEAttribute(incomingServerEClass, INCOMING_SERVER__CHECK);

		outgoingServerEClass = createEClass(OUTGOING_SERVER);
		createEAttribute(outgoingServerEClass, OUTGOING_SERVER__USE_TSL);
		createEAttribute(outgoingServerEClass, OUTGOING_SERVER__FROM_ADDRESS);
		createEAttribute(outgoingServerEClass, OUTGOING_SERVER__EMAIL_PREFIX);

		yamailFolderEClass = createEClass(YAMAIL_FOLDER);
		createEAttribute(yamailFolderEClass, YAMAIL_FOLDER__NAME);
		createEReference(yamailFolderEClass, YAMAIL_FOLDER__MAILS);
		createEAttribute(yamailFolderEClass, YAMAIL_FOLDER__SYSTEM);
		createEAttribute(yamailFolderEClass, YAMAIL_FOLDER__TYPE);
		createEOperation(yamailFolderEClass,
				YAMAIL_FOLDER___GET_MAIL_BY_ID__STRING);

		yamailEClass = createEClass(YAMAIL);
		createEAttribute(yamailEClass, YAMAIL__MESSAGE);
		createEAttribute(yamailEClass, YAMAIL__READ);
		createEAttribute(yamailEClass, YAMAIL__FROM);
		createEAttribute(yamailEClass, YAMAIL__RECIPIENTS);
		createEAttribute(yamailEClass, YAMAIL__SUBJECT);
		createEAttribute(yamailEClass, YAMAIL__CONTENT_TYPE);
		createEAttribute(yamailEClass, YAMAIL__RECEIVED_DATE);
		createEAttribute(yamailEClass, YAMAIL__SENT_DATE);
		createEAttribute(yamailEClass, YAMAIL__CONTENT);
		createEReference(yamailEClass, YAMAIL__HEADERS);
		createEAttribute(yamailEClass, YAMAIL__SIZE);
		createEReference(yamailEClass, YAMAIL__ATTACHMENTS);
		createEAttribute(yamailEClass, YAMAIL__ID);
		createEAttribute(yamailEClass, YAMAIL__PRIORITY);
		createEAttribute(yamailEClass, YAMAIL__LABEL);
		createEAttribute(yamailEClass, YAMAIL__LOCAL_FILE);
		createEAttribute(yamailEClass, YAMAIL__SPAM_SCORE);

		yamailAttachmentEClass = createEClass(YAMAIL_ATTACHMENT);
		createEAttribute(yamailAttachmentEClass, YAMAIL_ATTACHMENT__FILE_NAME);
		createEAttribute(yamailAttachmentEClass,
				YAMAIL_ATTACHMENT__CONTENT_TYPE);
		createEAttribute(yamailAttachmentEClass, YAMAIL_ATTACHMENT__CONTENT);

		// Create enums
		mailProtocolEEnum = createEEnum(MAIL_PROTOCOL);
		folderTypeEEnum = createEEnum(FOLDER_TYPE);
		priorityEEnum = createEEnum(PRIORITY);

		// Create data types
		messageEDataType = createEDataType(MESSAGE);
		dateEDataType = createEDataType(DATE);
		inputStreamEDataType = createEDataType(INPUT_STREAM);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE
				.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		incomingServerEClass.getESuperTypes().add(this.getYamailServer());
		outgoingServerEClass.getESuperTypes().add(this.getYamailServer());

		// Initialize classes, features, and operations; add parameters
		initEClass(yamailLibraryEClass, YamailLibrary.class, "YamailLibrary",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYamailLibrary_Accounts(), this.getYamailAccount(),
				null, "accounts", null, 0, -1, YamailLibrary.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getYamailLibrary_Settings(),
				theEcorePackage.getEStringToStringMapEntry(), null, "settings",
				null, 0, -1, YamailLibrary.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yamailAccountEClass, YamailAccount.class, "YamailAccount",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYamailAccount_Name(), ecorePackage.getEString(),
				"name", null, 0, 1, YamailAccount.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getYamailAccount_IncomingServer(),
				this.getIncomingServer(), null, "incomingServer", null, 0, 1,
				YamailAccount.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYamailAccount_OutgoingServer(),
				this.getOutgoingServer(), null, "outgoingServer", null, 0, 1,
				YamailAccount.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYamailAccount_Address(), ecorePackage.getEString(),
				"address", null, 0, 1, YamailAccount.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getYamailAccount_Password(), ecorePackage.getEString(),
				"password", null, 0, 1, YamailAccount.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getYamailAccount_Folders(), this.getYamailFolder(),
				null, "folders", null, 0, -1, YamailAccount.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getYamailAccount_DataPath(), ecorePackage.getEString(),
				"dataPath", null, 0, 1, YamailAccount.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getYamailAccount_CustomDataPath(),
				ecorePackage.getEBoolean(), "customDataPath", null, 0, 1,
				YamailAccount.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYamailAccount_DetectServer(),
				ecorePackage.getEBoolean(), "detectServer", "true", 0, 1,
				YamailAccount.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		EOperation op = initEOperation(getYamailAccount__GetFolder__Object(),
				this.getYamailFolder(), "getFolder", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "nameOrType", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(yamailServerEClass, YamailServer.class, "YamailServer",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYamailServer_Name(), ecorePackage.getEString(),
				"name", null, 0, 1, YamailServer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getYamailServer_HostName(), ecorePackage.getEString(),
				"hostName", null, 0, 1, YamailServer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getYamailServer_Port(), ecorePackage.getEInt(), "port",
				null, 0, 1, YamailServer.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getYamailServer_UserName(), ecorePackage.getEString(),
				"userName", null, 0, 1, YamailServer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getYamailServer_Password(), ecorePackage.getEString(),
				"password", null, 0, 1, YamailServer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getYamailServer_Protocol(), this.getMailProtocol(),
				"protocol", null, 0, 1, YamailServer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getYamailServer_Timeout(), ecorePackage.getELong(),
				"timeout", "10000", 0, 1, YamailServer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(incomingServerEClass, IncomingServer.class,
				"IncomingServer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIncomingServer_Interval(), theEcorePackage.getEInt(),
				"interval", "15", 0, 1, IncomingServer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncomingServer_Check(), ecorePackage.getEBoolean(),
				"check", "true", 0, 1, IncomingServer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(outgoingServerEClass, OutgoingServer.class,
				"OutgoingServer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutgoingServer_UseTSL(), ecorePackage.getEBoolean(),
				"useTSL", null, 0, 1, OutgoingServer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutgoingServer_FromAddress(),
				ecorePackage.getEString(), "fromAddress", null, 0, 1,
				OutgoingServer.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getOutgoingServer_EmailPrefix(),
				ecorePackage.getEString(), "emailPrefix", null, 0, 1,
				OutgoingServer.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(yamailFolderEClass, YamailFolder.class, "YamailFolder",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYamailFolder_Name(), ecorePackage.getEString(),
				"name", null, 0, 1, YamailFolder.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getYamailFolder_Mails(), this.getYamail(), null,
				"mails", null, 0, -1, YamailFolder.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYamailFolder_System(), ecorePackage.getEBoolean(),
				"system", null, 0, 1, YamailFolder.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getYamailFolder_Type(), this.getFolderType(), "type",
				null, 0, 1, YamailFolder.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		op = initEOperation(getYamailFolder__GetMailById__String(),
				this.getYamail(), "getMailById", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(yamailEClass, Yamail.class, "Yamail", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYamail_Message(), this.getMessage(), "message", null,
				0, 1, Yamail.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYamail_Read(), ecorePackage.getEBoolean(), "read",
				null, 0, 1, Yamail.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getYamail_From(), ecorePackage.getEString(), "from",
				null, 0, -1, Yamail.class, IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getYamail_Recipients(), ecorePackage.getEString(),
				"recipients", null, 0, -1, Yamail.class, IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYamail_Subject(), ecorePackage.getEString(),
				"subject", null, 0, 1, Yamail.class, IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYamail_ContentType(), ecorePackage.getEString(),
				"contentType", null, 0, 1, Yamail.class, IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYamail_ReceivedDate(), this.getDate(),
				"receivedDate", null, 0, 1, Yamail.class, IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYamail_SentDate(), this.getDate(), "sentDate", null,
				0, 1, Yamail.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYamail_Content(), ecorePackage.getEJavaObject(),
				"content", null, 0, 1, Yamail.class, IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYamail_Headers(),
				theEcorePackage.getEStringToStringMapEntry(), null, "headers",
				null, 0, -1, Yamail.class, IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYamail_Size(), ecorePackage.getELong(), "size", null,
				0, 1, Yamail.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYamail_Attachments(), this.getYamailAttachment(),
				null, "attachments", null, 0, -1, Yamail.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getYamail_Id(), ecorePackage.getEString(), "id", null,
				0, 1, Yamail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYamail_Priority(), this.getPriority(), "priority",
				null, 0, 1, Yamail.class, IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getYamail_Label(), ecorePackage.getEString(), "label",
				null, 0, 1, Yamail.class, IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getYamail_LocalFile(), ecorePackage.getEString(),
				"localFile", null, 0, 1, Yamail.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getYamail_SpamScore(), ecorePackage.getEFloat(),
				"spamScore", "-1", 0, 1, Yamail.class, IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yamailAttachmentEClass, YamailAttachment.class,
				"YamailAttachment", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYamailAttachment_FileName(),
				ecorePackage.getEString(), "fileName", null, 0, 1,
				YamailAttachment.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getYamailAttachment_ContentType(),
				ecorePackage.getEString(), "contentType", null, 0, 1,
				YamailAttachment.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getYamailAttachment_Content(), this.getInputStream(),
				"content", null, 0, 1, YamailAttachment.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(mailProtocolEEnum, MailProtocol.class, "MailProtocol");
		addEEnumLiteral(mailProtocolEEnum, MailProtocol.POP);
		addEEnumLiteral(mailProtocolEEnum, MailProtocol.SECURE_POP);
		addEEnumLiteral(mailProtocolEEnum, MailProtocol.IMAP);
		addEEnumLiteral(mailProtocolEEnum, MailProtocol.SECURE_IMAP);
		addEEnumLiteral(mailProtocolEEnum, MailProtocol.SMTP);
		addEEnumLiteral(mailProtocolEEnum, MailProtocol.SECURE_SMTP);

		initEEnum(folderTypeEEnum, FolderType.class, "FolderType");
		addEEnumLiteral(folderTypeEEnum, FolderType.INBOX);
		addEEnumLiteral(folderTypeEEnum, FolderType.SENT);
		addEEnumLiteral(folderTypeEEnum, FolderType.DRAFT);
		addEEnumLiteral(folderTypeEEnum, FolderType.TRASH);
		addEEnumLiteral(folderTypeEEnum, FolderType.SPAM);

		initEEnum(priorityEEnum, Priority.class, "Priority");
		addEEnumLiteral(priorityEEnum, Priority.HIGHEST);
		addEEnumLiteral(priorityEEnum, Priority.HIGH);
		addEEnumLiteral(priorityEEnum, Priority.NORMAL);
		addEEnumLiteral(priorityEEnum, Priority.LOW);
		addEEnumLiteral(priorityEEnum, Priority.LOWEST);

		// Initialize data types
		initEDataType(messageEDataType, Message.class, "Message",
				!IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dateEDataType, Date.class, "Date", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(inputStreamEDataType, InputStream.class, "InputStream",
				IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} // YamailPackageImpl
