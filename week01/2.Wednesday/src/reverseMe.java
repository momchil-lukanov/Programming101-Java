public class reverseMe {
	
	public static String reverseMe(String argument) {
		String result = "";
		
		for (int i = 0; i < argument.length(); i++) {
			result = argument.charAt(i) + result;
		}
		return result;
	}

	public static void main(String[] args) {
		String a = "dancho";
		System.out.println(reverseMe(a));
	}

}
