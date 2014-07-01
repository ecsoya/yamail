/**
 */
package org.ecsoya.yamail.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.ecsoya.yamail.model.YamailFactory
 * @model kind="package"
 * @generated
 */
public interface YamailPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.ecsoya.yamail/model/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "yam";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	YamailPackage eINSTANCE = org.ecsoya.yamail.model.impl.YamailPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.ecsoya.yamail.model.impl.YamailLibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.ecsoya.yamail.model.impl.YamailLibraryImpl
	 * @see org.ecsoya.yamail.model.impl.YamailPackageImpl#getYamailLibrary()
	 * @generated
	 */
	int YAMAIL_LIBRARY = 0;

	/**
	 * The feature id for the '<em><b>Accounts</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YAMAIL_LIBRARY__ACCOUNTS = 0;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' map. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YAMAIL_LIBRARY__SETTINGS = 1;

	/**
	 * The number of structural features of the '<em>Library</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YAMAIL_LIBRARY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Library</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YAMAIL_LIBRARY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ecsoya.yamail.model.impl.YamailAccountImpl <em>Account</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.ecsoya.yamail.model.impl.YamailAccountImpl
	 * @see org.ecsoya.yamail.model.impl.YamailPackageImpl#getYamailAccount()
	 * @generated
	 */
	int YAMAIL_ACCOUNT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YAMAIL_ACCOUNT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Incoming Server</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YAMAIL_ACCOUNT__INCOMING_SERVER = 1;

	/**
	 * The feature id for the '<em><b>Outgoing Server</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YAMAIL_ACCOUNT__OUTGOING_SERVER = 2;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YAMAIL_ACCOUNT__ADDRESS = 3;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YAMAIL_ACCOUNT__PASSWORD = 4;

	/**
	 * The feature id for the '<em><b>Folders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YAMAIL_ACCOUNT__FOLDERS = 5;

	/**
	 * The number of structural features of the '<em>Account</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YAMAIL_ACCOUNT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Account</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YAMAIL_ACCOUNT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ecsoya.yamail.model.impl.YamailServerImpl <em>Server</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.ecsoya.yamail.model.impl.YamailServerImpl
	 * @see org.ecsoya.yamail.model.impl.YamailPackageImpl#getYamailServer()
	 * @generated
	 */
	int YAMAIL_SERVER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YAMAIL_SERVER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Host Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YAMAIL_SERVER__HOST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YAMAIL_SERVER__PORT = 2;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YAMAIL_SERVER__USER_NAME = 3;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YAMAIL_SERVER__PASSWORD = 4;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YAMAIL_SERVER__PROTOCOL = 5;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YAMAIL_SERVER__TIMEOUT = 6;

	/**
	 * The number of structural features of the '<em>Server</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YAMAIL_SERVER_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Server</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YAMAIL_SERVER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ecsoya.yamail.model.impl.YamailImpl <em>Yamail</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.ecsoya.yamail.model.impl.YamailImpl
	 * @see org.ecsoya.yamail.model.impl.YamailPackageImpl#getYamail()
	 * @generated
	 */
	int YAMAIL = 6;

	/**
	 * The meta object id for the '{@link org.ecsoya.yamail.model.impl.IncomingServerImpl <em>Incoming Server</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.ecsoya.yamail.model.impl.IncomingServerImpl
	 * @see org.ecsoya.yamail.model.impl.YamailPackageImpl#getIncomingServer()
	 * @generated
	 */
	int INCOMING_SERVER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INCOMING_SERVER__NAME = YAMAIL_SERVER__NAME;

	/**
	 * The feature id for the '<em><b>Host Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INCOMING_SERVER__HOST_NAME = YAMAIL_SERVER__HOST_NAME;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INCOMING_SERVER__PORT = YAMAIL_SERVER__PORT;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INCOMING_SERVER__USER_NAME = YAMAIL_SERVER__USER_NAME;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INCOMING_SERVER__PASSWORD = YAMAIL_SERVER__PASSWORD;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INCOMING_SERVER__PROTOCOL = YAMAIL_SERVER__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INCOMING_SERVER__TIMEOUT = YAMAIL_SERVER__TIMEOUT;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_SERVER__INTERVAL = YAMAIL_SERVER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Incoming Server</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_SERVER_FEATURE_COUNT = YAMAIL_SERVER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Incoming Server</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INCOMING_SERVER_OPERATION_COUNT = YAMAIL_SERVER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ecsoya.yamail.model.impl.OutgoingServerImpl <em>Outgoing Server</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.ecsoya.yamail.model.impl.OutgoingServerImpl
	 * @see org.ecsoya.yamail.model.impl.YamailPackageImpl#getOutgoingServer()
	 * @generated
	 */
	int OUTGOING_SERVER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OUTGOING_SERVER__NAME = YAMAIL_SERVER__NAME;

	/**
	 * The feature id for the '<em><b>Host Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OUTGOING_SERVER__HOST_NAME = YAMAIL_SERVER__HOST_NAME;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OUTGOING_SERVER__PORT = YAMAIL_SERVER__PORT;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OUTGOING_SERVER__USER_NAME = YAMAIL_SERVER__USER_NAME;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OUTGOING_SERVER__PASSWORD = YAMAIL_SERVER__PASSWORD;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OUTGOING_SERVER__PROTOCOL = YAMAIL_SERVER__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OUTGOING_SERVER__TIMEOUT = YAMAIL_SERVER__TIMEOUT;

	/**
	 * The feature id for the '<em><b>Use TSL</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OUTGOING_SERVER__USE_TSL = YAMAIL_SERVER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From Address</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OUTGOING_SERVER__FROM_ADDRESS = YAMAIL_SERVER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Email Prefix</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OUTGOING_SERVER__EMAIL_PREFIX = YAMAIL_SERVER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Outgoing Server</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_SERVER_FEATURE_COUNT = YAMAIL_SERVER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Outgoing Server</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OUTGOING_SERVER_OPERATION_COUNT = YAMAIL_SERVER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ecsoya.yamail.model.impl.YamailFolderImpl <em>Folder</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.ecsoya.yamail.model.impl.YamailFolderImpl
	 * @see org.ecsoya.yamail.model.impl.YamailPackageImpl#getYamailFolder()
	 * @generated
	 */
	int YAMAIL_FOLDER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YAMAIL_FOLDER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Mails</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YAMAIL_FOLDER__MAILS = 1;

	/**
	 * The number of structural features of the '<em>Folder</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YAMAIL_FOLDER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Folder</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YAMAIL_FOLDER_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YAMAIL__MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>Yamail</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YAMAIL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Yamail</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int YAMAIL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ecsoya.yamail.model.MailProtocol
	 * <em>Mail Protocol</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.ecsoya.yamail.model.MailProtocol
	 * @see org.ecsoya.yamail.model.impl.YamailPackageImpl#getMailProtocol()
	 * @generated
	 */
	int MAIL_PROTOCOL = 7;

	/**
	 * The meta object id for the '<em>Message</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see javax.mail.Message
	 * @see org.ecsoya.yamail.model.impl.YamailPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 8;

	/**
	 * Returns the meta object for class '
	 * {@link org.ecsoya.yamail.model.YamailLibrary <em>Library</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Library</em>'.
	 * @see org.ecsoya.yamail.model.YamailLibrary
	 * @generated
	 */
	EClass getYamailLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ecsoya.yamail.model.YamailLibrary#getAccounts <em>Accounts</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Accounts</em>'.
	 * @see org.ecsoya.yamail.model.YamailLibrary#getAccounts()
	 * @see #getYamailLibrary()
	 * @generated
	 */
	EReference getYamailLibrary_Accounts();

	/**
	 * Returns the meta object for the map '{@link org.ecsoya.yamail.model.YamailLibrary#getSettings <em>Settings</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Settings</em>'.
	 * @see org.ecsoya.yamail.model.YamailLibrary#getSettings()
	 * @see #getYamailLibrary()
	 * @generated
	 */
	EReference getYamailLibrary_Settings();

	/**
	 * Returns the meta object for class '
	 * {@link org.ecsoya.yamail.model.YamailAccount <em>Account</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Account</em>'.
	 * @see org.ecsoya.yamail.model.YamailAccount
	 * @generated
	 */
	EClass getYamailAccount();

	/**
	 * Returns the meta object for the attribute '{@link org.ecsoya.yamail.model.YamailAccount#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ecsoya.yamail.model.YamailAccount#getName()
	 * @see #getYamailAccount()
	 * @generated
	 */
	EAttribute getYamailAccount_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.ecsoya.yamail.model.YamailAccount#getIncomingServer <em>Incoming Server</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Incoming Server</em>'.
	 * @see org.ecsoya.yamail.model.YamailAccount#getIncomingServer()
	 * @see #getYamailAccount()
	 * @generated
	 */
	EReference getYamailAccount_IncomingServer();

	/**
	 * Returns the meta object for the containment reference '{@link org.ecsoya.yamail.model.YamailAccount#getOutgoingServer <em>Outgoing Server</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Outgoing Server</em>'.
	 * @see org.ecsoya.yamail.model.YamailAccount#getOutgoingServer()
	 * @see #getYamailAccount()
	 * @generated
	 */
	EReference getYamailAccount_OutgoingServer();

	/**
	 * Returns the meta object for the attribute '{@link org.ecsoya.yamail.model.YamailAccount#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see org.ecsoya.yamail.model.YamailAccount#getAddress()
	 * @see #getYamailAccount()
	 * @generated
	 */
	EAttribute getYamailAccount_Address();

	/**
	 * Returns the meta object for the attribute '{@link org.ecsoya.yamail.model.YamailAccount#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.ecsoya.yamail.model.YamailAccount#getPassword()
	 * @see #getYamailAccount()
	 * @generated
	 */
	EAttribute getYamailAccount_Password();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ecsoya.yamail.model.YamailAccount#getFolders <em>Folders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Folders</em>'.
	 * @see org.ecsoya.yamail.model.YamailAccount#getFolders()
	 * @see #getYamailAccount()
	 * @generated
	 */
	EReference getYamailAccount_Folders();

	/**
	 * Returns the meta object for class '
	 * {@link org.ecsoya.yamail.model.YamailServer <em>Server</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Server</em>'.
	 * @see org.ecsoya.yamail.model.YamailServer
	 * @generated
	 */
	EClass getYamailServer();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.ecsoya.yamail.model.YamailServer#getName <em>Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ecsoya.yamail.model.YamailServer#getName()
	 * @see #getYamailServer()
	 * @generated
	 */
	EAttribute getYamailServer_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.ecsoya.yamail.model.YamailServer#getHostName <em>Host Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Name</em>'.
	 * @see org.ecsoya.yamail.model.YamailServer#getHostName()
	 * @see #getYamailServer()
	 * @generated
	 */
	EAttribute getYamailServer_HostName();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.ecsoya.yamail.model.YamailServer#getPort <em>Port</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see org.ecsoya.yamail.model.YamailServer#getPort()
	 * @see #getYamailServer()
	 * @generated
	 */
	EAttribute getYamailServer_Port();

	/**
	 * Returns the meta object for the attribute '{@link org.ecsoya.yamail.model.YamailServer#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see org.ecsoya.yamail.model.YamailServer#getUserName()
	 * @see #getYamailServer()
	 * @generated
	 */
	EAttribute getYamailServer_UserName();

	/**
	 * Returns the meta object for the attribute '{@link org.ecsoya.yamail.model.YamailServer#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.ecsoya.yamail.model.YamailServer#getPassword()
	 * @see #getYamailServer()
	 * @generated
	 */
	EAttribute getYamailServer_Password();

	/**
	 * Returns the meta object for the attribute '{@link org.ecsoya.yamail.model.YamailServer#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see org.ecsoya.yamail.model.YamailServer#getProtocol()
	 * @see #getYamailServer()
	 * @generated
	 */
	EAttribute getYamailServer_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link org.ecsoya.yamail.model.YamailServer#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout</em>'.
	 * @see org.ecsoya.yamail.model.YamailServer#getTimeout()
	 * @see #getYamailServer()
	 * @generated
	 */
	EAttribute getYamailServer_Timeout();

	/**
	 * Returns the meta object for class '{@link org.ecsoya.yamail.model.Yamail <em>Yamail</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Yamail</em>'.
	 * @see org.ecsoya.yamail.model.Yamail
	 * @generated
	 */
	EClass getYamail();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.ecsoya.yamail.model.Yamail#getMessage <em>Message</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.ecsoya.yamail.model.Yamail#getMessage()
	 * @see #getYamail()
	 * @generated
	 */
	EAttribute getYamail_Message();

	/**
	 * Returns the meta object for class '{@link org.ecsoya.yamail.model.IncomingServer <em>Incoming Server</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Incoming Server</em>'.
	 * @see org.ecsoya.yamail.model.IncomingServer
	 * @generated
	 */
	EClass getIncomingServer();

	/**
	 * Returns the meta object for the attribute '{@link org.ecsoya.yamail.model.IncomingServer#getInterval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval</em>'.
	 * @see org.ecsoya.yamail.model.IncomingServer#getInterval()
	 * @see #getIncomingServer()
	 * @generated
	 */
	EAttribute getIncomingServer_Interval();

	/**
	 * Returns the meta object for class '{@link org.ecsoya.yamail.model.OutgoingServer <em>Outgoing Server</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outgoing Server</em>'.
	 * @see org.ecsoya.yamail.model.OutgoingServer
	 * @generated
	 */
	EClass getOutgoingServer();

	/**
	 * Returns the meta object for the attribute '{@link org.ecsoya.yamail.model.OutgoingServer#isUseTSL <em>Use TSL</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use TSL</em>'.
	 * @see org.ecsoya.yamail.model.OutgoingServer#isUseTSL()
	 * @see #getOutgoingServer()
	 * @generated
	 */
	EAttribute getOutgoingServer_UseTSL();

	/**
	 * Returns the meta object for the attribute '{@link org.ecsoya.yamail.model.OutgoingServer#getFromAddress <em>From Address</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Address</em>'.
	 * @see org.ecsoya.yamail.model.OutgoingServer#getFromAddress()
	 * @see #getOutgoingServer()
	 * @generated
	 */
	EAttribute getOutgoingServer_FromAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.ecsoya.yamail.model.OutgoingServer#getEmailPrefix <em>Email Prefix</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email Prefix</em>'.
	 * @see org.ecsoya.yamail.model.OutgoingServer#getEmailPrefix()
	 * @see #getOutgoingServer()
	 * @generated
	 */
	EAttribute getOutgoingServer_EmailPrefix();

	/**
	 * Returns the meta object for class '
	 * {@link org.ecsoya.yamail.model.YamailFolder <em>Folder</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Folder</em>'.
	 * @see org.ecsoya.yamail.model.YamailFolder
	 * @generated
	 */
	EClass getYamailFolder();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.ecsoya.yamail.model.YamailFolder#getName <em>Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ecsoya.yamail.model.YamailFolder#getName()
	 * @see #getYamailFolder()
	 * @generated
	 */
	EAttribute getYamailFolder_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ecsoya.yamail.model.YamailFolder#getMails <em>Mails</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mails</em>'.
	 * @see org.ecsoya.yamail.model.YamailFolder#getMails()
	 * @see #getYamailFolder()
	 * @generated
	 */
	EReference getYamailFolder_Mails();

	/**
	 * Returns the meta object for enum '{@link org.ecsoya.yamail.model.MailProtocol <em>Mail Protocol</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mail Protocol</em>'.
	 * @see org.ecsoya.yamail.model.MailProtocol
	 * @generated
	 */
	EEnum getMailProtocol();

	/**
	 * Returns the meta object for data type '{@link javax.mail.Message <em>Message</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Message</em>'.
	 * @see javax.mail.Message
	 * @model instanceClass="javax.mail.Message" serializeable="false"
	 * @generated
	 */
	EDataType getMessage();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	YamailFactory getYamailFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that
	 * represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each operation of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '
		 * {@link org.ecsoya.yamail.model.impl.YamailLibraryImpl
		 * <em>Library</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see org.ecsoya.yamail.model.impl.YamailLibraryImpl
		 * @see org.ecsoya.yamail.model.impl.YamailPackageImpl#getYamailLibrary()
		 * @generated
		 */
		EClass YAMAIL_LIBRARY = eINSTANCE.getYamailLibrary();

		/**
		 * The meta object literal for the '<em><b>Accounts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference YAMAIL_LIBRARY__ACCOUNTS = eINSTANCE.getYamailLibrary_Accounts();

		/**
		 * The meta object literal for the '<em><b>Settings</b></em>' map feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference YAMAIL_LIBRARY__SETTINGS = eINSTANCE.getYamailLibrary_Settings();

		/**
		 * The meta object literal for the '
		 * {@link org.ecsoya.yamail.model.impl.YamailAccountImpl
		 * <em>Account</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see org.ecsoya.yamail.model.impl.YamailAccountImpl
		 * @see org.ecsoya.yamail.model.impl.YamailPackageImpl#getYamailAccount()
		 * @generated
		 */
		EClass YAMAIL_ACCOUNT = eINSTANCE.getYamailAccount();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YAMAIL_ACCOUNT__NAME = eINSTANCE.getYamailAccount_Name();

		/**
		 * The meta object literal for the '<em><b>Incoming Server</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference YAMAIL_ACCOUNT__INCOMING_SERVER = eINSTANCE.getYamailAccount_IncomingServer();

		/**
		 * The meta object literal for the '<em><b>Outgoing Server</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference YAMAIL_ACCOUNT__OUTGOING_SERVER = eINSTANCE.getYamailAccount_OutgoingServer();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YAMAIL_ACCOUNT__ADDRESS = eINSTANCE.getYamailAccount_Address();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YAMAIL_ACCOUNT__PASSWORD = eINSTANCE.getYamailAccount_Password();

		/**
		 * The meta object literal for the '<em><b>Folders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YAMAIL_ACCOUNT__FOLDERS = eINSTANCE.getYamailAccount_Folders();

		/**
		 * The meta object literal for the '{@link org.ecsoya.yamail.model.impl.YamailServerImpl <em>Server</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.ecsoya.yamail.model.impl.YamailServerImpl
		 * @see org.ecsoya.yamail.model.impl.YamailPackageImpl#getYamailServer()
		 * @generated
		 */
		EClass YAMAIL_SERVER = eINSTANCE.getYamailServer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YAMAIL_SERVER__NAME = eINSTANCE.getYamailServer_Name();

		/**
		 * The meta object literal for the '<em><b>Host Name</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YAMAIL_SERVER__HOST_NAME = eINSTANCE.getYamailServer_HostName();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YAMAIL_SERVER__PORT = eINSTANCE.getYamailServer_Port();

		/**
		 * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YAMAIL_SERVER__USER_NAME = eINSTANCE.getYamailServer_UserName();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YAMAIL_SERVER__PASSWORD = eINSTANCE.getYamailServer_Password();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YAMAIL_SERVER__PROTOCOL = eINSTANCE.getYamailServer_Protocol();

		/**
		 * The meta object literal for the '<em><b>Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YAMAIL_SERVER__TIMEOUT = eINSTANCE.getYamailServer_Timeout();

		/**
		 * The meta object literal for the '{@link org.ecsoya.yamail.model.impl.YamailImpl <em>Yamail</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.ecsoya.yamail.model.impl.YamailImpl
		 * @see org.ecsoya.yamail.model.impl.YamailPackageImpl#getYamail()
		 * @generated
		 */
		EClass YAMAIL = eINSTANCE.getYamail();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YAMAIL__MESSAGE = eINSTANCE.getYamail_Message();

		/**
		 * The meta object literal for the '{@link org.ecsoya.yamail.model.impl.IncomingServerImpl <em>Incoming Server</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.ecsoya.yamail.model.impl.IncomingServerImpl
		 * @see org.ecsoya.yamail.model.impl.YamailPackageImpl#getIncomingServer()
		 * @generated
		 */
		EClass INCOMING_SERVER = eINSTANCE.getIncomingServer();

		/**
		 * The meta object literal for the '<em><b>Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCOMING_SERVER__INTERVAL = eINSTANCE.getIncomingServer_Interval();

		/**
		 * The meta object literal for the '{@link org.ecsoya.yamail.model.impl.OutgoingServerImpl <em>Outgoing Server</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.ecsoya.yamail.model.impl.OutgoingServerImpl
		 * @see org.ecsoya.yamail.model.impl.YamailPackageImpl#getOutgoingServer()
		 * @generated
		 */
		EClass OUTGOING_SERVER = eINSTANCE.getOutgoingServer();

		/**
		 * The meta object literal for the '<em><b>Use TSL</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTGOING_SERVER__USE_TSL = eINSTANCE.getOutgoingServer_UseTSL();

		/**
		 * The meta object literal for the '<em><b>From Address</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTGOING_SERVER__FROM_ADDRESS = eINSTANCE.getOutgoingServer_FromAddress();

		/**
		 * The meta object literal for the '<em><b>Email Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTGOING_SERVER__EMAIL_PREFIX = eINSTANCE.getOutgoingServer_EmailPrefix();

		/**
		 * The meta object literal for the '{@link org.ecsoya.yamail.model.impl.YamailFolderImpl <em>Folder</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.ecsoya.yamail.model.impl.YamailFolderImpl
		 * @see org.ecsoya.yamail.model.impl.YamailPackageImpl#getYamailFolder()
		 * @generated
		 */
		EClass YAMAIL_FOLDER = eINSTANCE.getYamailFolder();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YAMAIL_FOLDER__NAME = eINSTANCE.getYamailFolder_Name();

		/**
		 * The meta object literal for the '<em><b>Mails</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference YAMAIL_FOLDER__MAILS = eINSTANCE.getYamailFolder_Mails();

		/**
		 * The meta object literal for the '{@link org.ecsoya.yamail.model.MailProtocol <em>Mail Protocol</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.ecsoya.yamail.model.MailProtocol
		 * @see org.ecsoya.yamail.model.impl.YamailPackageImpl#getMailProtocol()
		 * @generated
		 */
		EEnum MAIL_PROTOCOL = eINSTANCE.getMailProtocol();

		/**
		 * The meta object literal for the '<em>Message</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see javax.mail.Message
		 * @see org.ecsoya.yamail.model.impl.YamailPackageImpl#getMessage()
		 * @generated
		 */
		EDataType MESSAGE = eINSTANCE.getMessage();

	}

} // YamailPackage
