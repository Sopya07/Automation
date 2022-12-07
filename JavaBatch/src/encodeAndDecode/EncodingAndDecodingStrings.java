package encodeAndDecode;

import org.apache.commons.codec.binary.Base64;

public class EncodingAndDecodingStrings {

	public static void main(String[] args) {

		String str= "testPass01";

		byte[] encodeString= Base64.encodeBase64(str.getBytes());

		System.out.println("encoded string:" +new String(encodeString));
		
		byte[] decodedString=Base64.decodeBase64(encodeString);
		System.out.println("decoded string:" +new String(decodedString));

		
	}

}
