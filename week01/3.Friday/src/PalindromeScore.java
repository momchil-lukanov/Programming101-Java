
public class PalindromeScore {
	
	public static int palindromScore(int number){
		
		int result = 0;
		int check = number;
		
		if (isPalindromeNumber(number)) {
			return 1;
		} else {
			int counter = 0;
			while (number != 0) {
				int digit = number % 10;
				result = result*10 + digit;
				number = number / 10;
			}
		}
		
		return result + check + 1;
	}

	private static boolean isPalindromeNumber(int argument) {
		int result = 0;
		int check = argument;
		
		while (argument != 0) {
			int digit = argument % 10;
			result = result*10 + digit;
			argument = argument / 10;
		}
		
		return result == check;
	}

	public static void main(String[] args) {
		System.out.println(palindromScore(48));

	}

}
