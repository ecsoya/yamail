package org.ecsoya.yamail.utils;

/**
 * @author Jin Liu(jin.liu@soyatec.com)
 */
public interface MailHeaders {

	String HEADER_PRIORITY = "X-PRIORITY";

	String HEADER_MESSAGE_ID = "MESSAGE-ID";

	String HEADER_PRECEDENCE = "PRECEDENCE";

	String HEADER_AUTO_SUBMITTED = "AUTO-SUBMITTED";

	String HEADER_IN_REPLY_TO = "IN-REPLY-TO";

	String HEADER_REFERENCES = "REFERENCES";

	String HEADER_SPAM_FLAG = "X-Spam-Flag";
	String HEADER_SPAM_SCORE = "X-Spam-Score";
	String HEADER_SPAM_LEVEL = "X-Spam-Level";
	String HEADER_SPAM_STATUS = "X-Spam-Status";
}
