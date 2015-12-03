
public class SumAllNumbers {
	
	public static int sumOfNumbers(String input) {
		input = input.replaceAll("^\\d"," ");
		String[] numbers = input.split(" ");
		int sum = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			sum += Integer.parseInt(numbers[i]);
		}
		
		
	}

	public static void main(String[] args) {
		System.out.println(sumOfNumbers("abc123dd34"));
	}

}
