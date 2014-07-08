package org.ecsoya.yamail.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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

	public static String trimToEmpty(String str) {
		if (isEmpty(str)) {
			return "";
		}
		return str.trim();
	}

	public static String toString(List<String> addresses) {
		if (addresses == null || addresses.isEmpty()) {
			return "";
		}
		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < addresses.size(); i++) {
			String addr = addresses.get(i);
			if (addr == null || addr.length() <= 0) {
				continue;
			}
			buf.append(addr);
			if (i < addresses.size() - 1) {
				buf.append("; ");
			}
		}
		return new String(buf);
	}

	public static String toString(Date date) {
		if (date == null) {
			return "";
		}
		SimpleDateFormat format = new SimpleDateFormat(
				"EEE, yyyy/MM/dd hh:mm:ss");
		return format.format(date);
	}
}
