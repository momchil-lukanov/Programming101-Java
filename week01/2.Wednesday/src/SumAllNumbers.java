
public class SumAllNumbers {

	public static int sumOfNumbers(String input) {
		input = input.replaceAll("[\\D]+", " ");
		String[] numbers = input.split(" ");
		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			 try {
			sum += Integer.parseInt(numbers[i]);
			 } catch (Exception e) {
//			  Just in case, the element in the array is not parse-able into
//			  Integer, Ignore it
			 }
		}
		return sum;

	}

	public static void main(String[] args) {
		System.out.println(sumOfNumbers("abc123dd34"));
	}

}
