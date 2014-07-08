package org.ecsoya.yamail.utils;

import java.io.StringWriter;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;

public class HTMLConverter {

	private static class FormattingVisitor implements NodeVisitor {
		boolean inBody = false;
		boolean inList = false;
		Boolean firstTR = null;
		boolean firstTD = true;
		boolean hasColor = false;
		int listCount = -1;
		ArrayList<String> links = new ArrayList<String>();

		private static final String NEWLINE = "\n";
		private static final String STAR = "*";
		private static final String SPACE = " ";
		private static final String PERIOD = ".";
		private static final String OPEN_BRACKET = "[";
		private static final String CLOSE_BRACKET = "]";
		private static final String DASH_LINE = "----------------------------------------------------------------------------------------";

		private StringWriter writer = new StringWriter();

		public void head(Node node, int depth) {
			String name = node.nodeName();
			if ("body".equals(name)) {
				inBody = true;
			} else if (inBody) {
				if (node instanceof TextNode) {
					writer.write(((TextNode) node).text());
				}
				if (name.equals("p")) {
					writer.write(NEWLINE + NEWLINE);
				} else if (name.equals("ol") || name.equals("ul")) {
					inList = true;
					writer.write(NEWLINE + NEWLINE);
					if (name.equals("ol"))
						listCount = 1;
				} else if (inList && name.equals("li")) {
					writer.write(NEWLINE);
					if (listCount != -1) {
						writer.write(listCount + PERIOD + SPACE);
						listCount++;
					} else {
						writer.write(STAR + SPACE);
					}
				} else if (name.equals("table")) {
					writer.write(NEWLINE);
				} else if (name.equals("tr")) {
					writer.write(NEWLINE);
					if (firstTR == null) {
						firstTR = Boolean.TRUE;
					} else {
						firstTR = Boolean.FALSE;
					}
					firstTD = true;
				} else if (name.equals("td") || name.equals("th")) {
					if (firstTD) {
						if (firstTR != null && Boolean.TRUE.equals(firstTR)) {
							writer.write("||" + SPACE);
						} else {
							writer.write("|" + SPACE);
						}
						firstTD = false;
					}
				} else if (name.equals("pre")) {
					writer.write(NEWLINE);
				} else if (name.equals("img")) {
					// Check if the img has a src attribute
					handleImage((String) node.attr("src"));
				} else if (name.equals("a")) {
					// Check if the img has a src attribute
					handleLink((String) node.attr("href"));
				} else if (name.equals("hr")) {
					writer.write(NEWLINE + DASH_LINE);
				} else if (name.equals("h1") || name.equals("h2")
						|| name.equals("h3") || name.equals("h4")
						|| name.equals("h5") || name.equals("h6")) {
					writer.write(NEWLINE);
					writer.write(name + "." + SPACE);
				} else if (name.equals("br")) {
					writer.write(NEWLINE);
				}
				// JIRA Text Formatting
				else if (name.equals("strong") || name.equals("b")) {
					writer.write(SPACE + STAR);
				} else if (name.equals("i")) {
					writer.write(SPACE + "_");
				} else if (name.equals("u")) {
					writer.write(SPACE + "+");
				} else if (name.equals("strike")) {
					writer.write(SPACE + "-");
				} else if (name.equals("font")) {
					String color = (String) node.attr("color");
					if (color != null) {
						writer.write(SPACE + "{color:" + color + "}");
						hasColor = true;
					}
				}
			}
		}

		private void handleImage(String src) {
			if (src != null) {
				writer.write(SPACE + "!" + src + "!" + SPACE);
			}
		}

		private void handleLink(String src) {
			if (src != null) {
				links.add(src);
				writer.write(OPEN_BRACKET + links.size() + CLOSE_BRACKET);
			}
		}

		public void tail(Node node, int depth) {
			String name = node.nodeName();
			if ("body".equals(name)) {
				if (links.size() != 0) {
					writer.write(NEWLINE + DASH_LINE + NEWLINE);
					for (int i = 0; i < links.size(); i++) {
						String src = (String) links.get(i);
						writer.write(OPEN_BRACKET + (i + 1) + CLOSE_BRACKET
								+ SPACE + src);
						if ((i + 1) < links.size()) {
							writer.write(NEWLINE);
						}
					}
				}
				inBody = false;
			} else if (inBody) {
				if (name.equals("ol") || name.equals("ul")) {
					inList = false;
					if (name.equals("ol")) {
						listCount = -1;
					}
					writer.write(NEWLINE);
				}
				// JIRA Text Formatting
				else if (name.equals("strong") || name.equals("b")) {
					trim();
					writer.write(STAR + SPACE);
				} else if (name.equals("i")) {
					trim();
					writer.write("_" + SPACE);
				} else if (name.equals("u")) {
					trim();
					writer.write("+" + SPACE);
				} else if (name.equals("strike")) {
					trim();
					writer.write("-" + SPACE);
				} else if (name.equals("td") || name.equals("th")) {
					if (firstTR != null && Boolean.TRUE.equals(firstTR)) {
						writer.write("||" + SPACE);
					} else {
						writer.write("|" + SPACE);
					}
				} else if (name.equals("table")) {
					writer.write(NEWLINE);
				} else if (name.equals("h1") || name.equals("h2")
						|| name.equals("h3") || name.equals("h4")
						|| name.equals("h5") || name.equals("h6")) {
					writer.write(NEWLINE);
				} else if (name.equals("font") && hasColor) {
					writer.write(SPACE + "{color}" + SPACE);
					hasColor = false;
				} else if (name.equals("div")) {
					writer.write(NEWLINE);
				}
			}
		}

		public String toString() {
			return writer.toString();
		}

		private void trim() {
			String str = new String(writer.getBuffer());
			writer = new StringWriter();
			writer.write(str.trim());
		}
	}

	public String convert(String html) {
		Document document = Jsoup.parse(html);
		return getRichText(document);
	}

	public String getRichText(Element element) {
		FormattingVisitor formatter = new FormattingVisitor();
		NodeTraversor traversor = new NodeTraversor(formatter);
		traversor.traverse(element);
		return formatter.toString();
	}
}
