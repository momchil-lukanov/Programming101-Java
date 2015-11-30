
public class subtractionFunction {

	public static <T extends Number> double sub(T first, T second) {
		return first.doubleValue() - second.doubleValue();
	}

	public static void main(String[] args) {
		int a = 6;
		double b = 10.0;
		System.out.println(sub(a, b));
	}

}
