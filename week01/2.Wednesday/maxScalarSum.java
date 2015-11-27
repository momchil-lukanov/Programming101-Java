package tasks;

import java.util.Arrays;

public class maxScalarSum {

	public static long maxScalarSum(int[] a, int[] b) {
		Arrays.sort(a);
		Arrays.sort(b);
		long result = 0;

		for (int i = 0; i < a.length; i++) {
			result += a[i] * b[i];
		}

		return result;
	}

	public static void main(String[] args) {
		int[] a = {6, 1, 2};
		int[] b = {3, 5, 4};
		System.out.println(maxScalarSum(a, b));
	}

}
