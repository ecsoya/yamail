package org.ecsoya.yamail.utils;

import org.apache.log4j.Logger;

public class LoggerUtil {
	public static final Logger LOGGER = Logger.getLogger("org.ecsoya.yamail");

	public static void info(String info) {
		LOGGER.info(info);
	}

	public static void debug(String debug) {
		LOGGER.debug(debug);
	}

	public static void trace(String trace) {
		LOGGER.trace(trace);
	}

	public static void warn(String warn) {
		LOGGER.warn(warn);
	}

	public static void warn(String warn, Exception e) {
		LOGGER.warn(warn, e);
	}

	public static void error(String error) {
		LOGGER.error(error);
	}

	public static void error(String error, Exception e) {
		LOGGER.error(error, e);
	}

	private LoggerUtil() {
	}
}
