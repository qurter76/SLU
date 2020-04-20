package encoding;

import java.io.UnsupportedEncodingException;

public class EncodingTest {

	public static void main(String[] args) throws UnsupportedEncodingException {

		String source = "대한민국";
		
		// java파일 기본 encoding
		System.out.println("file encoding : "
				+ System.getProperty("file.encoding"));
		
		// 기본 encoding의 바이트 배열
		byte[] chbyte = source.getBytes();
		for (byte b : chbyte) {
			System.out.printf("%02x ", b);
		}
		System.out.println();
		System.out.println("기본 encoding 문자열 길이 : "+new String(chbyte).length());
		System.out.println("기본 encoding 바이트 길이 : "+chbyte.length);
		System.out.println("기본 encoding 문자열 : "+new String(chbyte));
		System.out.println();

		// euc-kr encoding의 바이트 배열
		byte[] krbyte = source.getBytes("euc-kr");
		for (byte b : krbyte) {
			System.out.printf("%02x ", b);
		}
		System.out.println();
		System.out.println("euc-kr 문자열 길이 : "+new String(krbyte).length());
		System.out.println("euc-kr 바이트 길이 : "+krbyte.length);
		System.out.println("euc-kr 문자열 : "+new String(krbyte));

	}
}
