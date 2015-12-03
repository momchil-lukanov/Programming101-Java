
public class CountVowels {
	
	public static int countVowels(String a) {
		
		a.toLowerCase();
		int counter = 0;
		
		for (int i = 0; i < a.length(); i++) {
			if (isVowel(a.charAt(i))) {
				counter++;
			}
		}
		
		return counter;
		
	}

	private static boolean isVowel(Character charAt) {
		String sth = "aeiouy";
		for (int i = 0; i < sth.length(); i++) {
			if (charAt.equals(sth.charAt(i))) {
				return true;
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		System.out.println(countVowels("aehgj"));
	}

}
