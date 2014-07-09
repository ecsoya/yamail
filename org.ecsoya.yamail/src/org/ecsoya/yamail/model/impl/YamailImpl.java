/**
 */
package org.ecsoya.yamail.model.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.MimeMessage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.ecsoya.yamail.model.Priority;
import org.ecsoya.yamail.model.Yamail;
import org.ecsoya.yamail.model.YamailAccount;
import org.ecsoya.yamail.model.YamailAttachment;
import org.ecsoya.yamail.model.YamailException;
import org.ecsoya.yamail.model.YamailPackage;
import org.ecsoya.yamail.utils.MailUtils;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Yamail</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.ecsoya.yamail.model.impl.YamailImpl#getMessage <em>Message
 * </em>}</li>
 * <li>{@link org.ecsoya.yamail.model.impl.YamailImpl#isRead <em>Read</em>}</li>
 * <li>{@link org.ecsoya.yamail.model.impl.YamailImpl#getFrom <em>From</em>}</li>
 * <li>{@link org.ecsoya.yamail.model.impl.YamailImpl#getRecipients <em>
 * Recipients</em>}</li>
 * <li>{@link org.ecsoya.yamail.model.impl.YamailImpl#getSubject <em>Subject
 * </em>}</li>
 * <li>{@link org.ecsoya.yamail.model.impl.YamailImpl#getContentType <em>Content
 * Type</em>}</li>
 * <li>{@link org.ecsoya.yamail.model.impl.YamailImpl#getReceivedDate <em>
 * Received Date</em>}</li>
 * <li>{@link org.ecsoya.yamail.model.impl.YamailImpl#getSentDate <em>Sent Date
 * </em>}</li>
 * <li>{@link org.ecsoya.yamail.model.impl.YamailImpl#getContent <em>Content
 * </em>}</li>
 * <li>{@link org.ecsoya.yamail.model.impl.YamailImpl#getHeaders <em>Headers
 * </em>}</li>
 * <li>{@link org.ecsoya.yamail.model.impl.YamailImpl#getSize <em>Size</em>}</li>
 * <li>{@link org.ecsoya.yamail.model.impl.YamailImpl#getAttachments <em>
 * Attachments</em>}</li>
 * <li>{@link org.ecsoya.yamail.model.impl.YamailImpl#getId <em>Id</em>}</li>
 * <li>{@link org.ecsoya.yamail.model.impl.YamailImpl#getPriority <em>Priority
 * </em>}</li>
 * <li>{@link org.ecsoya.yamail.model.impl.YamailImpl#getLabel <em>Label</em>}</li>
 * <li>{@link org.ecsoya.yamail.model.impl.YamailImpl#getLocalFile <em>Local
 * File</em>}</li>
 * <li>{@link org.ecsoya.yamail.model.impl.YamailImpl#getSpamScore <em>Spam
 * Score</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YamailImpl extends MinimalEObjectImpl.Container implements Yamail {
	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final Message MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected Message message = MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #isRead() <em>Read</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isRead()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READ_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRead() <em>Read</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isRead()
	 * @generated
	 * @ordered
	 */
	protected boolean read = READ_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' attribute
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<String> from;

	/**
	 * The cached value of the '{@link #getRecipients() <em>Recipients</em>}'
	 * attribute list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getRecipients()
	 * @generated
	 * @ordered
	 */
	protected EList<String> recipients;

	/**
	 * The default value of the '{@link #getSubject() <em>Subject</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected String subject = SUBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentType() <em>Content Type</em>}
	 * ' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentType() <em>Content Type</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected String contentType = CONTENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReceivedDate()
	 * <em>Received Date</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getReceivedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date RECEIVED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReceivedDate()
	 * <em>Received Date</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getReceivedDate()
	 * @generated
	 * @ordered
	 */
	protected Date receivedDate = RECEIVED_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSentDate() <em>Sent Date</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSentDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date SENT_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSentDate() <em>Sent Date</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSentDate()
	 * @generated
	 * @ordered
	 */
	protected Date sentDate = SENT_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final Object CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected Object content = CONTENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHeaders() <em>Headers</em>}' map.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHeaders()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> headers;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final long SIZE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected long size = SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttachments() <em>Attachments</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAttachments()
	 * @generated
	 * @ordered
	 */
	protected EList<YamailAttachment> attachments;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final Priority PRIORITY_EDEFAULT = Priority.HIGHEST;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected Priority priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalFile() <em>Local File</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLocalFile()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalFile() <em>Local File</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLocalFile()
	 * @generated
	 * @ordered
	 */
	protected String localFile = LOCAL_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpamScore() <em>Spam Score</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSpamScore()
	 * @generated
	 * @ordered
	 */
	protected static final float SPAM_SCORE_EDEFAULT = -1.0F;

	/**
	 * The cached value of the '{@link #getSpamScore() <em>Spam Score</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSpamScore()
	 * @generated
	 * @ordered
	 */
	protected float spamScore = SPAM_SCORE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected YamailImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return YamailPackage.Literals.YAMAIL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Message getMessage() {
		if (message == null && localFile != null) {
			YamailAccount account = (YamailAccount) eContainer().eContainer();
			File file = new File(account.getDataPath() + File.separator
					+ localFile);
			FileInputStream in = null;
			try {
				in = new FileInputStream(file);
				Session session = Session.getDefaultInstance(MailUtils
						.buildProps(account.getIncomingServer()));
				message = new MimeMessage(session, in);
			} catch (FileNotFoundException e) {
				throw new YamailException(e);
			} catch (MessagingException e) {
				throw new YamailException(e);
			} finally {
				if (in != null) {
					try {
						in.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
		return message;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void setMessage(Message newMessage) {
		Message oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					YamailPackage.YAMAIL__MESSAGE, oldMessage, message));
		// MailUtils.sync(this, newMessage);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isRead() {
		return read;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setRead(boolean newRead) {
		boolean oldRead = read;
		read = newRead;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					YamailPackage.YAMAIL__READ, oldRead, read));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<String> getFrom() {
		if (from == null) {
			from = new EDataTypeUniqueEList<String>(String.class, this,
					YamailPackage.YAMAIL__FROM);
			assertMessageNotNull();
			try {
				from.addAll(MailUtils.extractAddress(message.getFrom()));
			} catch (MessagingException e) {
				throw new YamailException(e);
			}
		}
		return from;
	}

	private void assertMessageNotNull() {
		Message message = getMessage();
		if (message == null) {
			throw new YamailException("Message can not loaded.");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<String> getRecipients() {
		if (recipients == null) {
			recipients = new EDataTypeUniqueEList<String>(String.class, this,
					YamailPackage.YAMAIL__RECIPIENTS);
			assertMessageNotNull();
			try {
				recipients.addAll(MailUtils.extractAddress(message
						.getAllRecipients()));
			} catch (MessagingException e) {
				throw new YamailException(e);
			}
		}
		return recipients;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String getSubject() {
		if (subject == null) {
			assertMessageNotNull();
			try {
				subject = message.getSubject();
			} catch (MessagingException e) {
				throw new YamailException(e);
			}
		}
		return subject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String getContentType() {
		if (contentType == null) {
			assertMessageNotNull();
			try {
				contentType = message.getContentType();
			} catch (MessagingException e) {
				throw new YamailException(e);
			}
		}
		return contentType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Date getReceivedDate() {
		if (receivedDate == null) {
			assertMessageNotNull();
			try {
				receivedDate = message.getReceivedDate();
				if (receivedDate == null) {
					receivedDate = message.getSentDate();
				}
			} catch (MessagingException e) {
				throw new YamailException(e);
			}
		}
		return receivedDate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Date getSentDate() {
		if (sentDate == null) {
			assertMessageNotNull();
			try {
				sentDate = message.getSentDate();
			} catch (MessagingException e) {
				throw new YamailException(e);
			}
		}
		return sentDate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Object getContent() {
		if (content == null) {
			assertMessageNotNull();
			try {
				content = message.getContent();
			} catch (IOException e) {
				throw new YamailException(e);
			} catch (MessagingException e) {
				throw new YamailException(e);
			}
		}
		return content;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EMap<String, String> getHeaders() {
		if (headers == null) {
			headers = new EcoreEMap<String, String>(
					EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY,
					EStringToStringMapEntryImpl.class, this,
					YamailPackage.YAMAIL__HEADERS);
			assertMessageNotNull();
			try {
				headers.putAll(MailUtils.extractHeaders(message));
			} catch (MessagingException e) {
				throw new YamailException(e);
			}
		}
		return headers;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public long getSize() {
		if (size == 0) {
			assertMessageNotNull();
			try {
				size = message.getSize();
			} catch (MessagingException e) {
				throw new YamailException(e);
			}
		}
		return size;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<YamailAttachment> getAttachments() {
		if (attachments == null) {
			attachments = new EObjectContainmentEList<YamailAttachment>(
					YamailAttachment.class, this,
					YamailPackage.YAMAIL__ATTACHMENTS);
		}
		return attachments;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					YamailPackage.YAMAIL__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Priority getPriority() {
		if (priority == null) {
			assertMessageNotNull();
			try {
				priority = Priority.get(MailUtils.getPriority(message));
			} catch (MessagingException e) {
				throw new YamailException(e);
			}
		}
		return priority;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String getLabel() {
		if (label == null) {
			assertMessageNotNull();
		}
		return label;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getLocalFile() {
		return localFile;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setLocalFile(String newLocalFile) {
		String oldLocalFile = localFile;
		localFile = newLocalFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					YamailPackage.YAMAIL__LOCAL_FILE, oldLocalFile, localFile));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public float getSpamScore() {
		if (spamScore == SPAM_SCORE_EDEFAULT) {
			assertMessageNotNull();
			try {
				spamScore = MailUtils.getSpamScore(message);
			} catch (MessagingException e) {
				throw new YamailException(e);
			}
		}
		return spamScore;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case YamailPackage.YAMAIL__HEADERS:
			return ((InternalEList<?>) getHeaders())
					.basicRemove(otherEnd, msgs);
		case YamailPackage.YAMAIL__ATTACHMENTS:
			return ((InternalEList<?>) getAttachments()).basicRemove(otherEnd,
					msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case YamailPackage.YAMAIL__MESSAGE:
			return getMessage();
		case YamailPackage.YAMAIL__READ:
			return isRead();
		case YamailPackage.YAMAIL__FROM:
			return getFrom();
		case YamailPackage.YAMAIL__RECIPIENTS:
			return getRecipients();
		case YamailPackage.YAMAIL__SUBJECT:
			return getSubject();
		case YamailPackage.YAMAIL__CONTENT_TYPE:
			return getContentType();
		case YamailPackage.YAMAIL__RECEIVED_DATE:
			return getReceivedDate();
		case YamailPackage.YAMAIL__SENT_DATE:
			return getSentDate();
		case YamailPackage.YAMAIL__CONTENT:
			return getContent();
		case YamailPackage.YAMAIL__HEADERS:
			if (coreType)
				return getHeaders();
			else
				return getHeaders().map();
		case YamailPackage.YAMAIL__SIZE:
			return getSize();
		case YamailPackage.YAMAIL__ATTACHMENTS:
			return getAttachments();
		case YamailPackage.YAMAIL__ID:
			return getId();
		case YamailPackage.YAMAIL__PRIORITY:
			return getPriority();
		case YamailPackage.YAMAIL__LABEL:
			return getLabel();
		case YamailPackage.YAMAIL__LOCAL_FILE:
			return getLocalFile();
		case YamailPackage.YAMAIL__SPAM_SCORE:
			return getSpamScore();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case YamailPackage.YAMAIL__MESSAGE:
			setMessage((Message) newValue);
			return;
		case YamailPackage.YAMAIL__READ:
			setRead((Boolean) newValue);
			return;
		case YamailPackage.YAMAIL__ID:
			setId((String) newValue);
			return;
		case YamailPackage.YAMAIL__LOCAL_FILE:
			setLocalFile((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case YamailPackage.YAMAIL__MESSAGE:
			setMessage(MESSAGE_EDEFAULT);
			return;
		case YamailPackage.YAMAIL__READ:
			setRead(READ_EDEFAULT);
			return;
		case YamailPackage.YAMAIL__ID:
			setId(ID_EDEFAULT);
			return;
		case YamailPackage.YAMAIL__LOCAL_FILE:
			setLocalFile(LOCAL_FILE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case YamailPackage.YAMAIL__MESSAGE:
			return MESSAGE_EDEFAULT == null ? message != null
					: !MESSAGE_EDEFAULT.equals(message);
		case YamailPackage.YAMAIL__READ:
			return read != READ_EDEFAULT;
		case YamailPackage.YAMAIL__FROM:
			return from != null && !from.isEmpty();
		case YamailPackage.YAMAIL__RECIPIENTS:
			return recipients != null && !recipients.isEmpty();
		case YamailPackage.YAMAIL__SUBJECT:
			return SUBJECT_EDEFAULT == null ? subject != null
					: !SUBJECT_EDEFAULT.equals(subject);
		case YamailPackage.YAMAIL__CONTENT_TYPE:
			return CONTENT_TYPE_EDEFAULT == null ? contentType != null
					: !CONTENT_TYPE_EDEFAULT.equals(contentType);
		case YamailPackage.YAMAIL__RECEIVED_DATE:
			return RECEIVED_DATE_EDEFAULT == null ? receivedDate != null
					: !RECEIVED_DATE_EDEFAULT.equals(receivedDate);
		case YamailPackage.YAMAIL__SENT_DATE:
			return SENT_DATE_EDEFAULT == null ? sentDate != null
					: !SENT_DATE_EDEFAULT.equals(sentDate);
		case YamailPackage.YAMAIL__CONTENT:
			return CONTENT_EDEFAULT == null ? content != null
					: !CONTENT_EDEFAULT.equals(content);
		case YamailPackage.YAMAIL__HEADERS:
			return headers != null && !headers.isEmpty();
		case YamailPackage.YAMAIL__SIZE:
			return size != SIZE_EDEFAULT;
		case YamailPackage.YAMAIL__ATTACHMENTS:
			return attachments != null && !attachments.isEmpty();
		case YamailPackage.YAMAIL__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case YamailPackage.YAMAIL__PRIORITY:
			return priority != PRIORITY_EDEFAULT;
		case YamailPackage.YAMAIL__LABEL:
			return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT
					.equals(label);
		case YamailPackage.YAMAIL__LOCAL_FILE:
			return LOCAL_FILE_EDEFAULT == null ? localFile != null
					: !LOCAL_FILE_EDEFAULT.equals(localFile);
		case YamailPackage.YAMAIL__SPAM_SCORE:
			return spamScore != SPAM_SCORE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (message: ");
		result.append(message);
		result.append(", read: ");
		result.append(read);
		result.append(", from: ");
		result.append(from);
		result.append(", recipients: ");
		result.append(recipients);
		result.append(", subject: ");
		result.append(subject);
		result.append(", contentType: ");
		result.append(contentType);
		result.append(", receivedDate: ");
		result.append(receivedDate);
		result.append(", sentDate: ");
		result.append(sentDate);
		result.append(", content: ");
		result.append(content);
		result.append(", size: ");
		result.append(size);
		result.append(", id: ");
		result.append(id);
		result.append(", priority: ");
		result.append(priority);
		result.append(", label: ");
		result.append(label);
		result.append(", localFile: ");
		result.append(localFile);
		result.append(", spamScore: ");
		result.append(spamScore);
		result.append(')');
		return result.toString();
	}

} // YamailImpl
