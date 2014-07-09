/**
 */
package org.ecsoya.yamail.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>Folder Type</b></em>', and utility methods for working with them. <!--
 * end-user-doc -->
 * @see org.ecsoya.yamail.model.YamailPackage#getFolderType()
 * @model
 * @generated
 */
public enum FolderType implements Enumerator {
	/**
	 * The '<em><b>INBOX</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #INBOX_VALUE
	 * @generated
	 * @ordered
	 */
	INBOX(0, "INBOX", "INBOX"),

	/**
	 * The '<em><b>SENT</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #SENT_VALUE
	 * @generated
	 * @ordered
	 */
	SENT(1, "SENT", "SENT"),

	/**
	 * The '<em><b>DRAFT</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #DRAFT_VALUE
	 * @generated
	 * @ordered
	 */
	DRAFT(2, "DRAFT", "DRAFT"),

	/**
	 * The '<em><b>TRASH</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #TRASH_VALUE
	 * @generated
	 * @ordered
	 */
	TRASH(3, "TRASH", "TRASH"),

	/**
	 * The '<em><b>SPAM</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #SPAM_VALUE
	 * @generated
	 * @ordered
	 */
	SPAM(4, "SPAM", "SPAM");

	/**
	 * The '<em><b>INBOX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INBOX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INBOX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INBOX_VALUE = 0;

	/**
	 * The '<em><b>SENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SENT_VALUE = 1;

	/**
	 * The '<em><b>DRAFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DRAFT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DRAFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DRAFT_VALUE = 2;

	/**
	 * The '<em><b>TRASH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRASH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRASH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRASH_VALUE = 3;

	/**
	 * The '<em><b>SPAM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SPAM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPAM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SPAM_VALUE = 4;

	/**
	 * An array of all the '<em><b>Folder Type</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final FolderType[] VALUES_ARRAY = new FolderType[] { INBOX,
			SENT, DRAFT, TRASH, SPAM, };

	/**
	 * A public read-only list of all the '<em><b>Folder Type</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FolderType> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Folder Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static FolderType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FolderType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Folder Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static FolderType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FolderType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Folder Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static FolderType get(int value) {
		switch (value) {
		case INBOX_VALUE:
			return INBOX;
		case SENT_VALUE:
			return SENT;
		case DRAFT_VALUE:
			return DRAFT;
		case TRASH_VALUE:
			return TRASH;
		case SPAM_VALUE:
			return SPAM;
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
	private FolderType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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

} // FolderType
