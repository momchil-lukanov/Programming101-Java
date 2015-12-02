
public class minGenericElementArray {

	public static <T extends Number> double min(T[] a){
		double minEl = a[0].doubleValue();
		for (int i = 0; i < a.length; i++) {
			if (minEl > a[i].doubleValue()) {
				minEl = a[i].doubleValue(); 
			}
		}
		return minEl;
	}

	public static void main(String[] args) {
		int[] a = {0, -5, 2, 3, -1, -3};
		System.out.println(min(a));

	}

}
