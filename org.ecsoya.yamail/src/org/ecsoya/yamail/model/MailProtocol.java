/**
 */
package org.ecsoya.yamail.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>Mail Protocol</b></em>', and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ecsoya.yamail.model.YamailPackage#getMailProtocol()
 * @model instanceClass="org.ecsoya.yamail.model.MailProtocol"
 * @generated
 */
public enum MailProtocol implements Enumerator {
	/**
	 * The '<em><b>POP</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #POP_VALUE
	 * @generated
	 * @ordered
	 */
	POP(110, "POP", "pop3"),

	/**
	 * The '<em><b>SECURE POP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURE_POP_VALUE
	 * @generated
	 * @ordered
	 */
	SECURE_POP(995, "SECURE_POP", "pop3s"),

	/**
	 * The '<em><b>IMAP</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #IMAP_VALUE
	 * @generated
	 * @ordered
	 */
	IMAP(143, "IMAP", "imap"),

	/**
	 * The '<em><b>SECURE IMAP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURE_IMAP_VALUE
	 * @generated
	 * @ordered
	 */
	SECURE_IMAP(993, "SECURE_IMAP", "imaps"),

	/**
	 * The '<em><b>SMTP</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #SMTP_VALUE
	 * @generated
	 * @ordered
	 */
	SMTP(25, "SMTP", "smtp"),

	/**
	 * The '<em><b>SECURE SMTP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURE_SMTP_VALUE
	 * @generated
	 * @ordered
	 */
	SECURE_SMTP(465, "SECURE_SMTP", "smtps");

	/**
	 * The '<em><b>POP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>POP</b></em>' literal object isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POP
	 * @model literal="pop3"
	 * @generated
	 * @ordered
	 */
	public static final int POP_VALUE = 110;

	/**
	 * The '<em><b>SECURE POP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SECURE POP</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SECURE_POP
	 * @model literal="pop3s"
	 * @generated
	 * @ordered
	 */
	public static final int SECURE_POP_VALUE = 995;

	/**
	 * The '<em><b>IMAP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IMAP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMAP
	 * @model literal="imap"
	 * @generated
	 * @ordered
	 */
	public static final int IMAP_VALUE = 143;

	/**
	 * The '<em><b>SECURE IMAP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SECURE IMAP</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SECURE_IMAP
	 * @model literal="imaps"
	 * @generated
	 * @ordered
	 */
	public static final int SECURE_IMAP_VALUE = 993;

	/**
	 * The '<em><b>SMTP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SMTP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SMTP
	 * @model literal="smtp"
	 * @generated
	 * @ordered
	 */
	public static final int SMTP_VALUE = 25;

	/**
	 * The '<em><b>SECURE SMTP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SECURE SMTP</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SECURE_SMTP
	 * @model literal="smtps"
	 * @generated
	 * @ordered
	 */
	public static final int SECURE_SMTP_VALUE = 465;

	/**
	 * An array of all the '<em><b>Mail Protocol</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final MailProtocol[] VALUES_ARRAY = new MailProtocol[] {
			POP,
			SECURE_POP,
			IMAP,
			SECURE_IMAP,
			SMTP,
			SECURE_SMTP,
		};

	/**
	 * A public read-only list of all the '<em><b>Mail Protocol</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MailProtocol> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Mail Protocol</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static MailProtocol get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MailProtocol result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mail Protocol</b></em>' literal with the specified name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static MailProtocol getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MailProtocol result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mail Protocol</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static MailProtocol get(int value) {
		switch (value) {
			case POP_VALUE: return POP;
			case SECURE_POP_VALUE: return SECURE_POP;
			case IMAP_VALUE: return IMAP;
			case SECURE_IMAP_VALUE: return SECURE_IMAP;
			case SMTP_VALUE: return SMTP;
			case SECURE_SMTP_VALUE: return SECURE_SMTP;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	private MailProtocol(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} // MailProtocol
