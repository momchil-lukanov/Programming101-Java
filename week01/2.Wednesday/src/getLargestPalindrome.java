public class getLargestPalindrome {

	public static boolean isIntPalindrome(long j) {
		long palindrome = j;
		long m = 0;

		while (j != 0) {
			m = m * 10 + (j % 10);
			j = j / 10;
		}
		if (palindrome == m) {
			return true;
		} else {
			return false;
		}

	}

	public static long getLargestPalindrome(long N) {

		long temp = N - 1;
		int result = 1;

		for (int i = (int) temp; i > 0; i--) {
			if (isIntPalindrome(i) == true) {
				result = i;
				break;
			}
		}

		return result;

	}

	public static void main(String[] args) {
		int a = 121;
		System.out.println(getLargestPalindrome(a));

	}

}
