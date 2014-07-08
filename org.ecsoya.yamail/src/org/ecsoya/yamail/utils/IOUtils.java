package org.ecsoya.yamail.utils;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

public class IOUtils {
	private static final int DEFAULT_BUFFER_SIZE = 1024 * 4;
	private static final int EOF = -1;

	public static void copy(InputStream input, Writer output)
			throws IOException {
		copy(input, output, Charset.defaultCharset());
	}

	public static void copy(InputStream input, Writer output, Charset encoding)
			throws IOException {
		InputStreamReader in = new InputStreamReader(input, toCharset(encoding));
		copy(in, output);
	}

	public static Charset toCharset(Charset charset) {
		return charset == null ? Charset.defaultCharset() : charset;
	}

	public static Charset toCharset(String charset) {
		return charset == null ? Charset.defaultCharset() : Charset
				.forName(charset);
	}

	public static int copy(Reader input, Writer output) throws IOException {
		long count = copyLarge(input, output);
		if (count > Integer.MAX_VALUE) {
			return -1;
		}
		return (int) count;
	}

	public static long copyLarge(Reader input, Writer output)
			throws IOException {
		return copyLarge(input, output, new char[DEFAULT_BUFFER_SIZE]);
	}

	public static long copyLarge(Reader input, Writer output, char[] buffer)
			throws IOException {
		long count = 0;
		int n = 0;
		while (EOF != (n = input.read(buffer))) {
			output.write(buffer, 0, n);
			count += n;
		}
		return count;
	}

	public static void closeQuietly(Closeable closeable) {
		try {
			if (closeable != null) {
				closeable.close();
			}
		} catch (IOException ioe) {
			// ignore
		}
	}

	private IOUtils() {
	}
}
