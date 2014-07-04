package org.ecsoya.yamail.utils;

public class StringUtils {
	/**
	 * Return true if String value is null or empty.
	 *
	 * @param value
	 * @return
	 */
	public static boolean isEmpty(String value) {
		return (value == null || value.length() < 1);
	}

	public static boolean isNotBlank(String value) {
		return !isEmpty(value);
	}

	public static String trimToNull(String str) {
		if (isEmpty(str)) {
			return null;
		}
		return str.trim();
	}
}
