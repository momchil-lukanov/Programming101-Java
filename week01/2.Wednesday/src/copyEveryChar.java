public class copyEveryChar {
	
	public static String copyEveryChar(String input, int k) {
		String result = "";
		for (int i = 0; i < input.length(); i++) {
			for (int j = 0; j < k; j++) {
				result += input.charAt(i);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String a = "ivan";
		System.out.println(copyEveryChar(a, 2));
	}

}
