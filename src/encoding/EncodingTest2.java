package encoding;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class EncodingTest2 {
	public static void main(String args []){

		

		String [] types = {"UTF-8","EUC-KR","ISO-8859-1"};

		String testValue = "한글";

		System.out.println("기본 글자 : " + testValue);

		String encode_result = null;

		//TEST1//

		System.out.println("------TEST 1------");

		try {

			for(String type : types){

			encode_result = URLEncoder.encode(testValue, type);

			System.out.println("encode with " + type +" : "+ URLEncoder.encode(testValue, type));

				for(String type2 : types){

					System.out.println("decode with " + type2 +" : "+ URLDecoder.decode(encode_result, type2));		

				}

				System.out.println("--------------------");		

			}	

		} catch (UnsupportedEncodingException e) {

			e.printStackTrace();

		}
}
}