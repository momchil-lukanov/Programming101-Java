import java.util.Scanner;

public class minElementArray {
	
	public static int min(int[] a){
		int minEl = a[0];
		for (int i = 0; i < a.length; i++) {
			if (minEl > a[i]) {
				minEl = a[i]; 
			}
		}
		return minEl;
	}

	public static void main(String[] args) {
		int[] a = {0, -5, 2, 3, -1, -3};
		System.out.println(min(a));

	}

}
