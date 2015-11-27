package tasks;
public class getOddOccurence {

	public static int getOddOccurence(int[] a) {

		for (int i = 0; i < a.length; i++) {
			int result = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {
					result += 1;
				}
			}
			if (result % 2 != 0) {
				return a[i];
			}
		}
		return 0;

	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 2, 1, 3, 4, 3, 2, 4, 6, 5, 6, 5 };
		System.out.println(getOddOccurence(a));

	}

}
