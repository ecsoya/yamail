package org.ecsoya.yamail.utils;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.Header;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.ecsoya.yamail.model.IncomingServer;
import org.ecsoya.yamail.model.MailProtocol;
import org.ecsoya.yamail.model.OutgoingServer;
import org.ecsoya.yamail.model.Priority;
import org.ecsoya.yamail.model.Yamail;
import org.ecsoya.yamail.model.YamailServer;

public class MailUtils {

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

	public static void sync(Yamail yamail, Message message) {
		if (yamail == null) {
			return;
		}
		if (message == null) {
			EList<EAttribute> attrs = yamail.eClass().getEAllAttributes();
			for (EAttribute eAttribute : attrs) {
				yamail.eUnset(eAttribute);
			}
		} else {
			try {
				yamail.getFrom().addAll(extractAddress(message.getFrom()));
				yamail.getRecipients().addAll(
						extractAddress(message.getAllRecipients()));
				yamail.getHeaders().putAll(extractHeaders(message));
				yamail.setContent(message.getContent());
				yamail.setContentType(message.getContentType());
				yamail.setSentDate(message.getSentDate());
				yamail.setReceivedDate(message.getReceivedDate());
				yamail.setSize(message.getSize());

				String[] header = message.getHeader("X-Priority");
				if (header != null && header.length != 0) {
					String str = StringUtils.trimToNull(header[0]);
					if (str != null) {
						try {
							int priority = Integer.parseInt(str);
							yamail.setPriority(Priority.get(priority));
						} catch (Exception e) {
						}
					}
				}
				String id = getMessageId(message);
				if (id == null) {
					id = EcoreUtil.generateUUID();
				}
				yamail.setSubject(message.getSubject());
				yamail.setId(id);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}
}
