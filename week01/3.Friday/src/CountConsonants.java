
public class CountConsonants {

	public static int countConsonants(String a) {

		a.toLowerCase();
		int counter = 0;

		for (int i = 0; i < a.length(); i++) {
			if (isConsonant(a.charAt(i))) {
				counter++;
			}
		}

		return counter;

	}

	private static boolean isConsonant(Character charAt) {
		String sth = "bcdfghjklmnpqrstvwxz";
		for (int i = 0; i < sth.length(); i++) {
			if (charAt.equals(sth.charAt(i))) {
				return true;
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		System.out.println(countConsonants("aeoiythj"));
	}

}
