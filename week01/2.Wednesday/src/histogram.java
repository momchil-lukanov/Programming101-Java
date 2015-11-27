import java.util.Arrays;
import java.util.Scanner;

public class histogram {

	public static int[] histogram(short[][] image) {

		int[] result = new int[256];

		for (int i = 0; i < image.length; i++) {
			for (int j = 0; j < image[0].length; j++) {
				result[image[i][j]]++;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		short[][] map = { { 1, 2, 2, 2, 3, 4 }, 
						{ 2, 0, 5, 6, 7, 7 } };
		int[] sth = histogram(map);
		System.out.println(sth[2]);
	}

}
