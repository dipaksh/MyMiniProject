package model;

import java.io.UnsupportedEncodingException;
import Decoder.BASE64Decoder;
import Decoder.BASE64Encoder;

public class EncriptUtils 
{
	public static final String DEFAULT_ENCODING = "UTF-8"; 
	static BASE64Encoder enc = new BASE64Encoder();
	static BASE64Decoder dec = new BASE64Decoder();

	public static String base64encode(String text) {
		try {
			return enc.encode(text.getBytes(DEFAULT_ENCODING));
		} catch (UnsupportedEncodingException e) {
			return null;
		}
	}  
	public static String  EncryptPassword(String uname,String pass)
	{
		pass = xorMessage(pass, uname);
		pass = base64encode(pass); 	    	
		return pass;
	}


	public static String xorMessage(String message, String key) {
		try {
			if (message == null || key == null) return null;

			char[] keys = key.toCharArray();
			char[] mesg = message.toCharArray();

			int ml = mesg.length;
			int kl = keys.length;
			char[] newmsg = new char[ml];

			for (int i = 0; i < ml; i++) {
				newmsg[i] = (char)(mesg[i] ^ keys[i % kl]);
			}
			return new String(newmsg);
		} catch (Exception e) {
			return null;
		}
	}

}
