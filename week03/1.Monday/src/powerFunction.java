public class powerFunction {

	public static <T extends Number> double pow(T first, T second) {
		double result = 1;
		for (int i = 0; i < second.doubleValue(); i++) {
			result *= first.doubleValue();
		}
		return result;
	}

	public static void main(String[] args) {
		int a = 6;
		double b = 2.0;
		System.out.println(pow(a, b));
	}

}