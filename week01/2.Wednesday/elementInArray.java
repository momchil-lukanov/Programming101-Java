package tasks;

import java.util.Arrays;

public class elementInArray {

	public static int kthMin(int k, int[] array) {
		
		int counter = 0;
		Arrays.sort(array);
		return array[k];

	}

	public static void main(String[] args) {
		int[] a = {0, -5, 2, 3, -1, -3};
		System.out.println(kthMin(1, a));
	}

}
