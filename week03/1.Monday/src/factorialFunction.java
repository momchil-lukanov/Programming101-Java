
public class factorialFunction {

	public static <T extends Number> double fac(T first) {
		double temp = 1;
		double result = first.doubleValue();
		while (temp != first.doubleValue()) {
			result *= temp;
			temp++;
		}
		return result;
	}

	public static void main(String[] args) {
		int a = 4;
		System.out.println(fac(a));
	}

}
