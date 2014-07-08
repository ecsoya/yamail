/**
 */
package org.ecsoya.yamail.model;

import java.util.Date;

import javax.mail.Message;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Yamail</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ecsoya.yamail.model.Yamail#getMessage <em>Message</em>}</li>
 *   <li>{@link org.ecsoya.yamail.model.Yamail#isRead <em>Read</em>}</li>
 *   <li>{@link org.ecsoya.yamail.model.Yamail#getFrom <em>From</em>}</li>
 *   <li>{@link org.ecsoya.yamail.model.Yamail#getRecipients <em>Recipients</em>}</li>
 *   <li>{@link org.ecsoya.yamail.model.Yamail#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.ecsoya.yamail.model.Yamail#getContentType <em>Content Type</em>}</li>
 *   <li>{@link org.ecsoya.yamail.model.Yamail#getReceivedDate <em>Received Date</em>}</li>
 *   <li>{@link org.ecsoya.yamail.model.Yamail#getSentDate <em>Sent Date</em>}</li>
 *   <li>{@link org.ecsoya.yamail.model.Yamail#getContent <em>Content</em>}</li>
 *   <li>{@link org.ecsoya.yamail.model.Yamail#getHeaders <em>Headers</em>}</li>
 *   <li>{@link org.ecsoya.yamail.model.Yamail#getSize <em>Size</em>}</li>
 *   <li>{@link org.ecsoya.yamail.model.Yamail#getAttachments <em>Attachments</em>}</li>
 *   <li>{@link org.ecsoya.yamail.model.Yamail#getId <em>Id</em>}</li>
 *   <li>{@link org.ecsoya.yamail.model.Yamail#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.ecsoya.yamail.model.Yamail#getLabel <em>Label</em>}</li>
 *   <li>{@link org.ecsoya.yamail.model.Yamail#getLocalFile <em>Local File</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Read</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Read</em>' attribute.
	 * @see #setRead(boolean)
	 * @see org.ecsoya.yamail.model.YamailPackage#getYamail_Read()
	 * @model
	 * @generated
	 */
	boolean isRead();

	/**
	 * Sets the value of the '{@link org.ecsoya.yamail.model.Yamail#isRead <em>Read</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read</em>' attribute.
	 * @see #isRead()
	 * @generated
	 */
	void setRead(boolean value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' attribute list isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' attribute list.
	 * @see org.ecsoya.yamail.model.YamailPackage#getYamail_From()
	 * @model
	 * @generated
	 */
	EList<String> getFrom();

	/**
	 * Returns the value of the '<em><b>Recipients</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Recipients</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipients</em>' attribute list.
	 * @see org.ecsoya.yamail.model.YamailPackage#getYamail_Recipients()
	 * @model
	 * @generated
	 */
	EList<String> getRecipients();

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Subject</em>' attribute.
	 * @see #setSubject(String)
	 * @see org.ecsoya.yamail.model.YamailPackage#getYamail_Subject()
	 * @model
	 * @generated
	 */
	String getSubject();

	/**
	 * Sets the value of the '{@link org.ecsoya.yamail.model.Yamail#getSubject
	 * <em>Subject</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Subject</em>' attribute.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(String value);

	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Content Type</em>' attribute.
	 * @see #setContentType(String)
	 * @see org.ecsoya.yamail.model.YamailPackage#getYamail_ContentType()
	 * @model
	 * @generated
	 */
	String getContentType();

	/**
	 * Sets the value of the '{@link org.ecsoya.yamail.model.Yamail#getContentType <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' attribute.
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(String value);

	/**
	 * Returns the value of the '<em><b>Received Date</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Received Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Received Date</em>' attribute.
	 * @see #setReceivedDate(Date)
	 * @see org.ecsoya.yamail.model.YamailPackage#getYamail_ReceivedDate()
	 * @model dataType="org.ecsoya.yamail.model.Date"
	 * @generated
	 */
	Date getReceivedDate();

	/**
	 * Sets the value of the '{@link org.ecsoya.yamail.model.Yamail#getReceivedDate <em>Received Date</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Received Date</em>' attribute.
	 * @see #getReceivedDate()
	 * @generated
	 */
	void setReceivedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Sent Date</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sent Date</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Sent Date</em>' attribute.
	 * @see #setSentDate(Date)
	 * @see org.ecsoya.yamail.model.YamailPackage#getYamail_SentDate()
	 * @model dataType="org.ecsoya.yamail.model.Date"
	 * @generated
	 */
	Date getSentDate();

	/**
	 * Sets the value of the '{@link org.ecsoya.yamail.model.Yamail#getSentDate
	 * <em>Sent Date</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Sent Date</em>' attribute.
	 * @see #getSentDate()
	 * @generated
	 */
	void setSentDate(Date value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(Object)
	 * @see org.ecsoya.yamail.model.YamailPackage#getYamail_Content()
	 * @model transient="true"
	 * @generated
	 */
	Object getContent();

	/**
	 * Sets the value of the '{@link org.ecsoya.yamail.model.Yamail#getContent
	 * <em>Content</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(Object value);

	/**
	 * Returns the value of the '<em><b>Headers</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Headers</em>' map isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Headers</em>' map.
	 * @see org.ecsoya.yamail.model.YamailPackage#getYamail_Headers()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, String> getHeaders();

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(long)
	 * @see org.ecsoya.yamail.model.YamailPackage#getYamail_Size()
	 * @model
	 * @generated
	 */
	long getSize();

	/**
	 * Sets the value of the '{@link org.ecsoya.yamail.model.Yamail#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(long value);

	/**
	 * Returns the value of the '<em><b>Attachments</b></em>' containment reference list.
	 * The list contents are of type {@link org.ecsoya.yamail.model.YamailAttachment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachments</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachments</em>' containment reference list.
	 * @see org.ecsoya.yamail.model.YamailPackage#getYamail_Attachments()
	 * @model containment="true"
	 * @generated
	 */
	EList<YamailAttachment> getAttachments();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.ecsoya.yamail.model.YamailPackage#getYamail_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.ecsoya.yamail.model.Yamail#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * The literals are from the enumeration {@link org.ecsoya.yamail.model.Priority}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see org.ecsoya.yamail.model.Priority
	 * @see #setPriority(Priority)
	 * @see org.ecsoya.yamail.model.YamailPackage#getYamail_Priority()
	 * @model
	 * @generated
	 */
	Priority getPriority();

	/**
	 * Sets the value of the '{@link org.ecsoya.yamail.model.Yamail#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see org.ecsoya.yamail.model.Priority
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(Priority value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.ecsoya.yamail.model.YamailPackage#getYamail_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.ecsoya.yamail.model.Yamail#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Local File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local File</em>' attribute.
	 * @see #setLocalFile(String)
	 * @see org.ecsoya.yamail.model.YamailPackage#getYamail_LocalFile()
	 * @model
	 * @generated
	 */
	String getLocalFile();

	/**
	 * Sets the value of the '{@link org.ecsoya.yamail.model.Yamail#getLocalFile <em>Local File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local File</em>' attribute.
	 * @see #getLocalFile()
	 * @generated
	 */
	void setLocalFile(String value);

} // Yamail
