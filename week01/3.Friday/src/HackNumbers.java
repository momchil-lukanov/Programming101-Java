
public class HackNumbers {

	public static boolean isHackNumber(int x) {

		String binary = Integer.toBinaryString(x);
		int counter = 0;
		
		for (int i = 0; i < binary.length(); i++) {
			Character temp = binary.charAt(i);
			if (temp.equals('1')) {
				counter++;
			}
		}

		return isPalindrome(binary) && isOdd(counter);

	}

	private static boolean isOdd(int counter) {
		if (counter % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}

	private static boolean isPalindrome(String argument) {
		String reverse = "";

		for (int i = 0; i < argument.length(); i++) {
			reverse = argument.charAt(i) + reverse;
		}

		return reverse.equals(argument);
	}

	public static void main(String[] args) {
		System.out.println(isHackNumber(7919));

	}

}
