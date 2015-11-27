package tasks;

public class isPalindromeNumber {
	
	public static boolean isPalindromeNumber(int argument) {

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
		int a = 534;
		System.out.println(isPalindromeNumber(a));

	}

}
