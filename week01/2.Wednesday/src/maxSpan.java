import java.util.Collections;
import java.util.Vector;

public class maxSpan {
	
	public static int maxSpan(int[] numbers){
		
		Vector<Integer> sth = new Vector<>();
		
		for (int i = 0; i < numbers.length; i++) {
			int maxspan = 0;
			for (int j = i; j < numbers.length; j++) {
				if (numbers[i] == numbers[j]) {
					maxspan = j - i + 1;
				}
			}
			sth.add(maxspan);
		}
		Collections.sort(sth);
		return sth.lastElement();
		
	}

	public static void main(String[] args) {
		int[] a = {1, 4, 2, 1, 4, 1, 4};
		System.out.println(maxSpan(a));

	}

}
