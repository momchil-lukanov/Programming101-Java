import java.lang.reflect.Array;
import java.util.Vector;

public class taskForReward {

	public static int proizvedenieBezI(int[] a, int i) {
		int result = 0;
		for (int j = 0; j < a.length; j++) {
			if (j != i) {
				result *= a[j];
			} else {
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
