package org.ecsoya.yamail.utils;

import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.Transport;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.ecsoya.yamail.model.IncomingServer;
import org.ecsoya.yamail.model.MailProtocol;
import org.ecsoya.yamail.model.OutgoingServer;
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
}
