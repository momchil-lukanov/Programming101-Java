import java.io.UnsupportedEncodingException;

public class DecodeUrl {
	
	public static String decode(String url) throws UnsupportedEncodingException{
		
		String result = java.net.URLDecoder.decode(url, "UTF-8");
		
		return result;
		
	}

	public static void main(String[] args) throws UnsupportedEncodingException {
		System.out.println(decode("kitten%20pic.jpg"));

	}

}
