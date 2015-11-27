package tasks;

import java.util.Scanner;

public class pow {

	public static long pow(int a, int b) {

		long result = 1;

		for (int i = 0; i < b; i++) {
			result *= a;
		}

		return result;

	}

	public static void main(String[] args) {
		System.out.println(pow(2, 4));

	}

}
