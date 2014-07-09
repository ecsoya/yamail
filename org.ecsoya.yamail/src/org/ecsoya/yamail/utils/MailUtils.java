package org.ecsoya.yamail.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.BodyPart;
import javax.mail.Header;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Part;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.ecsoya.yamail.model.IncomingServer;
import org.ecsoya.yamail.model.MailProtocol;
import org.ecsoya.yamail.model.OutgoingServer;
import org.ecsoya.yamail.model.YamailServer;

public class MailUtils {
	private static final String DEFAULT_ENCODING = "UTF-8";

	static final int BUFFER_SIZE = 64 * 1024;
	static final String MULTIPART_ALTERNATE_CONTENT_TYPE = "multipart/alternative";
	static final String MULTIPART_RELATED_CONTENT_TYPE = "multipart/related";
	static final String TEXT_CONTENT_TYPE = "text/plain";
	static final String MESSAGE_CONTENT_TYPE = "message/rfc822";
	static final String HTML_CONTENT_TYPE = "text/html";
	static final String CONTENT_TYPE_X_PKCS7 = "application/x-pkcs7-signature";
	static final String CONTENT_TYPE_PKCS7 = "application/pkcs7-signature";

	private static HTMLConverter htmlConverter = new HTMLConverter();

	public static Properties buildProps(YamailServer server) {
		Properties props = new Properties();
		MailProtocol mailProtocol = server.getProtocol();
		if (mailProtocol != null) {
			final String protocol = mailProtocol.getLiteral();
			if (StringUtils.isNotBlank(server.getHostName())) {
				props.put("mail." + protocol + ".host", server.getHostName());
			}
			int port = mailProtocol.getValue();
			if (server.getPort() > 0) {
				port = server.getPort();
			}
			props.put("mail." + protocol + ".port", "" + port);
			props.put("mail." + protocol + ".timeout", "" + server.getTimeout());
			props.put("mail.transport.protocol", "" + protocol);
			if (StringUtils.isNotBlank(server.getUserName())) {
				props.put("mail." + protocol + ".auth", "true");
			}
		}
		return props;
	}

	public static boolean testServer(YamailServer server)
			throws MessagingException {
		if (server instanceof IncomingServer) {
			return testIncomingServer((IncomingServer) server);
		} else if (server instanceof OutgoingServer) {
			return testOutgoingServer((OutgoingServer) server);
		}
		throw new UnsupportedOperationException();
	}

	public static boolean testIncomingServer(IncomingServer server)
			throws MessagingException {
		if (server == null) {
			return false;
		}
		Store store = null;
		try {
			MailProtocol mailProtocol = server.getProtocol();
			if (mailProtocol == null) {
				return false;
			}
			Properties props = buildProps(server);
			Session session = Session.getInstance(props);
			store = session.getStore(mailProtocol.getLiteral());
			store.connect(server.getHostName(), server.getUserName(),
					server.getPassword());
			return true;
		} catch (MessagingException e) {
			// e.printStackTrace();
			throw e;
		} finally {
			if (store != null) {
				store.close();
			}
		}
	}

	public static boolean testOutgoingServer(OutgoingServer server)
			throws MessagingException {
		if (server == null) {
			return false;
		}
		Transport transport = null;
		try {
			MailProtocol mailProtocol = server.getProtocol();
			if (mailProtocol == null) {
				return false;
			}
			Properties props = buildProps(server);
			Session session = Session.getInstance(props);
			transport = session.getTransport(mailProtocol.getLiteral());
			transport.connect(server.getHostName(), server.getUserName(),
					server.getPassword());
			return true;
		} catch (MessagingException e) {
			// e.printStackTrace();
			throw e;
		} finally {
			if (transport != null) {
				transport.close();
			}
		}
	}

	public static String guessHostName(YamailServer server, String address,
			String password, MailProtocol protocol) {
		if (server == null || address == null || protocol == null) {
			return null;
		}
		if (address.indexOf("@") == -1) {
			return null;
		}
		String domain = address.substring(address.indexOf("@") + 1);
		if ("soyatec.com".equalsIgnoreCase(domain)) {
			return "mail.soyatec.com";
		}
		YamailServer myServer = EcoreUtil.copy(server);
		myServer.setUserName(address);
		myServer.setPassword(password);
		myServer.setProtocol(protocol);
		myServer.setTimeout(1000);

		String host1 = protocol.getLiteral() + "." + domain;
		myServer.setHostName(host1);
		try {
			if (testServer(myServer)) {
				return host1;
			}
		} catch (MessagingException e) {
			String host2 = "mail." + domain;
			myServer.setHostName(host2);
			try {
				if (testServer(myServer)) {
					return host2;
				}
			} catch (MessagingException e1) {
			}
		}
		return null;
	}

	public static Map<String, String> extractHeaders(Message message)
			throws MessagingException {
		@SuppressWarnings("rawtypes")
		Enumeration allHeaders = message.getAllHeaders();

		Map<String, String> map = new HashMap<String, String>();
		while (allHeaders.hasMoreElements()) {
			Header header = (Header) allHeaders.nextElement();
			String name = header.getName();
			if (name == null || name.equals("")) {
				continue;
			}
			map.put(name.toUpperCase(), header.getValue());
		}
		return map;
	}

	public static List<String> extractAddress(Address[] addresses) {
		List<String> list = new ArrayList<String>();
		if (addresses != null && addresses.length != 0) {
			for (Address addr : addresses) {
				if (addr instanceof InternetAddress) {
					InternetAddress id = (InternetAddress) addr;
					// Trim down the email address to remove any whitespace etc.
					String emailAddress = StringUtils.trimToNull(id
							.getAddress());
					if (emailAddress != null) {
						list.add(emailAddress);
					}
				}
			}
		}
		return list;
	}

	public static String getMessageId(final Message message) {
		// Note: we get an array because Message-ID is an arbitrary header, but
		// really there can be only one Message-ID
		// value (if it is present)
		try {
			final String[] originalMessageIds = message
					.getHeader(MailHeaders.HEADER_MESSAGE_ID);
			if ((originalMessageIds == null)
					|| (originalMessageIds.length == 0)) {
				return null;
			}
			return originalMessageIds[0];
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static int getPriority(Message message) throws MessagingException {
		if (message == null) {
			return -1;
		}
		String[] header = message.getHeader(MailHeaders.HEADER_PRIORITY);
		if (header != null && header.length != 0) {
			String str = StringUtils.trimToNull(header[0]);
			if (str != null) {
				try {
					return Integer.parseInt(str);
				} catch (Exception e) {
				}
			}
		}
		return -1;
	}

	/**
	 * Return the primary text content of the message.
	 */
	public static String getText(Part p) throws MessagingException, IOException {
		if (p == null) {
			return null;
		}
		if (p.isMimeType("text/*") && !p.isMimeType("text/html")) {
			String s = (String) p.getContent();
			return s;
		}

		if (p.isMimeType("multipart/alternative")) {
			// prefer html text over plain text
			Multipart mp = (Multipart) p.getContent();
			String text = null;
			for (int i = 0; i < mp.getCount(); i++) {
				Part bp = mp.getBodyPart(i);
				if (bp.isMimeType("text/plain")) {
					if (text == null) {
						text = getText(bp);
					}
					continue;
				} else if (bp.isMimeType("text/html")) {
					String s = getText(bp);
					if (s != null) {
						return s;
					}
				} else {
					return getText(bp);
				}
			}
			return text;
		} else if (p.isMimeType("multipart/*")) {
			Multipart mp = (Multipart) p.getContent();
			for (int i = 0; i < mp.getCount(); i++) {
				String s = getText(mp.getBodyPart(i));
				if (s != null) {
					return s;
				}
			}
		}

		return null;
	}

	public static String getBody(Message message) throws MessagingException {
		try {
			String content = extractTextFromPart(message);

			if (content == null) {
				if (message.getContent() instanceof Multipart) {
					content = getBodyFromMultipart((Multipart) message
							.getContent());
				}
			}

			if (content == null) {
				// didn't match anything above
				LoggerUtil
						.info("Could not find any body to extract from the message");
			}

			return content;
		} catch (ClassCastException cce) {
			LoggerUtil
					.info("Exception getting the content type of message - probably not of type 'String': "
							+ cce.getMessage());
			return null;
		} catch (IOException e) {
			LoggerUtil.info("IOException whilst getting message content "
					+ e.getMessage());
			return null;
		}
	}

	private static String getBodyFromMultipart(Multipart multipart)
			throws MessagingException, IOException {
		StringBuffer sb = new StringBuffer();
		getBodyFromMultipart(multipart, sb);
		return sb.toString();
	}

	private static void getBodyFromMultipart(Multipart multipart,
			StringBuffer sb) throws MessagingException, IOException {
		String multipartType = multipart.getContentType();

		// if an multipart/alternative type we just get the first text or html
		// content found
		if (multipartType != null
				&& compareContentType(multipartType,
						MULTIPART_ALTERNATE_CONTENT_TYPE)) {
			BodyPart part = getFirstInlinePartWithMimeType(multipart,
					HTML_CONTENT_TYPE);
			if (part != null) {
				appendMultipartText(extractTextFromPart(part), sb);
			} else {
				part = getFirstInlinePartWithMimeType(multipart,
						TEXT_CONTENT_TYPE);
				appendMultipartText(extractTextFromPart(part), sb);
			}
			return;
		}

		// otherwise assume multipart/mixed type and construct the contents by
		// retrieving all text and html
		for (int i = 0, n = multipart.getCount(); i < n; i++) {
			BodyPart part = multipart.getBodyPart(i);
			String contentType = part.getContentType();

			if (!Part.ATTACHMENT.equals(part.getDisposition())
					&& contentType != null) {
				try {
					String content = extractTextFromPart(part);
					if (content != null) {
						appendMultipartText(content, sb);
					} else if (part.getContent() instanceof Multipart) {
						getBodyFromMultipart((Multipart) part.getContent(), sb);
					}
				} catch (IOException exception) {
					// We swallow the exception because we want to allow
					// processing to continue
					// even if there is a bad part in one part of the message
					LoggerUtil.warn("Error retrieving content from part '"
							+ exception.getMessage() + "'", exception);
				}
			}
		}
	}

	private static BodyPart getFirstInlinePartWithMimeType(Multipart multipart,
			String mimeType) throws MessagingException {
		for (int i = 0, n = multipart.getCount(); i < n; i++) {
			BodyPart part = multipart.getBodyPart(i);
			String contentType = part.getContentType();
			if (!Part.ATTACHMENT.equals(part.getDisposition())
					&& contentType != null
					&& compareContentType(contentType, mimeType)) {
				return part;
			}
		}
		return null;
	}

	private static boolean compareContentType(String contentType,
			String mimeType) {
		return contentType.toLowerCase().startsWith(mimeType);
	}

	private static void appendMultipartText(String content, StringBuffer sb)
			throws IOException, MessagingException {
		if (content != null) {
			if (sb.length() > 0)
				sb.append("\n");
			sb.append(content);
		}
	}

	private static String getBody(Part part, String charsetName)
			throws UnsupportedEncodingException, IOException,
			MessagingException {
		Reader input = null;
		StringWriter output = null;
		try {
			input = new BufferedReader(new InputStreamReader(
					part.getInputStream(), charsetName));
			output = new StringWriter();
			IOUtils.copy(input, output);
			return output.getBuffer().toString();
		} finally {
			IOUtils.closeQuietly(input);
			IOUtils.closeQuietly(output);
		}
	}

	private static String extractTextFromPart(Part part) throws IOException,
			MessagingException, UnsupportedEncodingException {
		if (part == null)
			return null;

		String content = null;

		if (isPartPlainText(part)) {
			try {
				content = (String) part.getContent();
			} catch (UnsupportedEncodingException e) {
				// If the encoding is unsupported read the content with default
				// encoding
				LoggerUtil.warn("Found unsupported encoding '" + e.getMessage()
						+ "'. Reading content with " + DEFAULT_ENCODING
						+ " encoding.");
				content = getBody(part, DEFAULT_ENCODING);
			}
		} else if (isPartHtml(part)) {
			content = htmlConverter.convert((String) part.getContent());
		}

		if (content == null) {
			LoggerUtil
					.warn("Unable to extract text from MIME part with Content-Type '"
							+ part.getContentType());
		}

		return content;
	}

	static public boolean isPartHtml(final Part part) throws MessagingException {
		final String contentType = getContentType(part);
		return HTML_CONTENT_TYPE.equalsIgnoreCase(contentType);
	}

	static public boolean isPartPlainText(final Part part)
			throws MessagingException {
		final String contentType = getContentType(part);
		return TEXT_CONTENT_TYPE.equalsIgnoreCase(contentType);
	}

	static public String getContentType(final Part part)
			throws MessagingException {
		if (part == null) {
			return null;
		}

		final String contentType = part.getContentType();
		return getContentType(contentType);
	}

	static public String getContentType(final String headerValue) {
		if (headerValue == null) {
			return null;
		}

		String out = headerValue;

		final int semiColon = headerValue.indexOf(';');
		if (-1 != semiColon) {
			out = headerValue.substring(0, semiColon);
		}

		return out.trim();
	}

	/**
	 * Return the primary text content of the message.
	 */
	public static String getHTMLText(Part p) throws MessagingException,
			IOException {
		if (p == null) {
			return null;
		}
		if (p.isMimeType("text/html")) {
			String s = (String) p.getContent();
			return s;
		}

		if (p.isMimeType("multipart/alternative")) {
			// prefer html text over plain text
			Multipart mp = (Multipart) p.getContent();
			String text = null;
			for (int i = 0; i < mp.getCount(); i++) {
				Part bp = mp.getBodyPart(i);
				if (bp.isMimeType("text/plain")) {
					if (text == null) {
						text = getText(bp);
					}
					continue;
				} else if (bp.isMimeType("text/html")) {
					String s = getText(bp);
					if (s != null) {
						return s;
					}
				} else {
					return getText(bp);
				}
			}
			return text;
		} else if (p.isMimeType("multipart/*")) {
			Multipart mp = (Multipart) p.getContent();
			for (int i = 0; i < mp.getCount(); i++) {
				String s = getText(mp.getBodyPart(i));
				if (s != null) {
					return s;
				}
			}
		}

		return null;
	}

	public static String getFirstHeader(Message message, String key)
			throws MessagingException {
		if (message == null || key == null) {
			return null;
		}
		String[] headers = message.getHeader(key);
		if (headers == null || headers.length == 0) {
			return null;
		}
		return StringUtils.trimToNull(headers[0]);
	}

	public static float getSpamScore(Message message) throws MessagingException {
		String header = getFirstHeader(message, MailHeaders.HEADER_SPAM_SCORE);
		if (header != null) {
			try {
				return Float.parseFloat(header.trim());
			} catch (NumberFormatException e) {
				return 0;
			}
		}
		return 0;
	}
}
