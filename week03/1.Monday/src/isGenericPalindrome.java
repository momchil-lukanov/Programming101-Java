
public class isGenericPalindrome {

	public static <T> boolean isPalindrome(T argument) {
		String sth = argument.toString();
		String reverse = "";
		
		for (int i = 0; i < sth.length(); i++) {
			reverse = sth.charAt(i) + reverse;
		}
		
		return reverse.equals(sth);
		
	}

	public static void main(String[] args) {
		int a = 121;
		String b = "aha";
		System.out.println(isPalindrome(a));
		System.out.println(isPalindrome(b));
	}

}
