
public class divisionFunction {

	public static <T extends Number> double div(T first, T second) {
		return first.doubleValue() / second.doubleValue();
	}

	public static void main(String[] args) {
		int a = 6;
		double b = 10.0;
		System.out.println(div(a, b));
	}

}
