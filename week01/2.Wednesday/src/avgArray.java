public class avgArray {
	
	static int sum = 0;
	static int counter = 0;
	
	public static int getAverage(int[] array){
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
			counter += 1;
		}
		return sum/counter;
	}

	public static void main(String[] args) {
		int[] a = {0, 1, 2, 3, 7, 11};
		System.out.println(getAverage(a));
	}

}
