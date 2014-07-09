package org.ecsoya.yamail.runnable;

import javax.mail.Message;
import javax.mail.MessagingException;

import org.ecsoya.yamail.model.YamailAccount;
import org.ecsoya.yamail.utils.StringUtils;

public class SpamFilter {

	private static final String SPAM_FLAG = "X-Spam-Flag";
	private static final String SPAM_SCORE = "X-Spam-Score";
	private static final String SPAM_LEVEL = "X-Spam-Level";
	private static final String SPAM_STATUS = "X-Spam-Status";

	private YamailAccount account;

	public SpamFilter(YamailAccount account) {
		this.account = account;
	}

	public boolean isSpam(Message message) {
		if (message == null) {
			return false;
		}
		try {
			String spamFlag = extract(message.getHeader(SPAM_FLAG));
			if ("yes".equalsIgnoreCase(spamFlag)) {
				return true;
			}
			String spamLevel = extract(message.getHeader(SPAM_LEVEL));
			if (spamLevel != null && spamLevel.length() > 5) {
				return true;
			}
			String spamScore = extract(message.getHeader(SPAM_SCORE));
			if (spamScore != null) {
				try {
					float score = Float.parseFloat(spamScore);
					if (score > 6) {
						return true;
					}
				} catch (NumberFormatException e) {
					e.printStackTrace();
				}
			}
			// String spamStatus = extract(message.getHeader(SPAM_STATUS));
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		return false;
	}

	private String extract(String[] headers) {
		if (headers == null || headers.length == 0) {
			return null;
		}
		return StringUtils.trimToNull(headers[0]);
	}
}
