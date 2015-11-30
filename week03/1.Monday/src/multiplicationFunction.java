
public class multiplicationFunction {

	public static <T extends Number> double mul(T first, T second) {
		return first.doubleValue() * second.doubleValue();
	}

	public static void main(String[] args) {
		int a = 6;
		double b = 10.0;
		System.out.println(mul(a, b));
	}

}
