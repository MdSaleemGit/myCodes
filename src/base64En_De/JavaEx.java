package base64En_De;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class JavaEx {
	public static void main(String []args) {
		Encoder encoder = Base64.getEncoder();
		String originalString= "Saleem";
		String encodedString =encoder.encodeToString(originalString.getBytes());
		System.out.println(encodedString);
		Decoder decoder = Base64.getDecoder();
     byte[]  bytes=decoder.decode(encodedString);
     System.out.println("decrypted value:  "+ new String( bytes));
		
	}

}
