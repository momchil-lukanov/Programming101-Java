package tasks;

public class doubleFact {
	
	public static long doubleFact(int n) {
		int sum = 1;
		int minusOne = n;
		for (int i = 0; i < n; i++) {
			sum *= minusOne;
			minusOne--;
		}
		return sum;
	}

	public static void main(String[] args) {
		int a = 3;
		long x = doubleFact(a);
		long y = doubleFact((int) x);
		System.out.println(y);
	}

}
