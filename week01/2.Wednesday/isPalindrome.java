package tasks;

public class isPalindrome {

	public static boolean isPalindrome(String argument) {
		String reverse = "";
		
		for (int i = 0; i < argument.length(); i++) {
			reverse = argument.charAt(i) + reverse;
		}
		
		return reverse.equals(argument);
		
	}

	public static void main(String[] args) {
		String a = "aha";
		System.out.println(isPalindrome(a));
	}

}
