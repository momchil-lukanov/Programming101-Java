import java.util.Scanner;

public class isPrime {
	
	static boolean isPrime = true;
	static int start = 2;
	
	public static boolean isPrime(int N) {
		while (start < N) {
			if (N % start == 0) {
				isPrime = false;
				break;
			}
			start += 1;
		}
		return isPrime;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
		System.out.println(isPrime(a));

	}

}
