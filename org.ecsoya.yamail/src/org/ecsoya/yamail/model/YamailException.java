package org.ecsoya.yamail.model;

public class YamailException extends RuntimeException {

	/**
	 * default.
	 */
	private static final long serialVersionUID = 1L;

	public YamailException() {
		super();
	}

	public YamailException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public YamailException(String message, Throwable cause) {
		super(message, cause);
	}

	public YamailException(String message) {
		super(message);
	}

	public YamailException(Throwable cause) {
		super(cause);
	}

}
