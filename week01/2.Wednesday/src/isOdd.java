import java.util.Scanner;

public class isOdd {

	public static boolean isOdd(int n) {
		if (n % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
		System.out.println(isOdd(a));

	}

}
