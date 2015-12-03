
public class Anagram {
	
	public static boolean anagram(String a, String b){
		
		a = a.toLowerCase();
		b = b.toLowerCase();

		for (int i = 0; i < a.length(); i++) {
			for (int j = 0; j < b.length(); j++) {
				String x = a.substring(i, i + 1);
				String y = b.substring(j, j + 1);
				if (x.equals(y)) {
					String a1 = a.substring(0, i);
					String a2 = a.substring(i + 1, a.length());
					String b1 = b.substring(0, j);
					String b2 = b.substring(j + 1, b.length());
					a = a1 + "*" + a2;
					b = b1 + "*" + b2;
				}

			}
		}

		return a.equals(b);
	}

	public static void main(String[] args) {
		System.out.println(anagram("army", "mari"));
	}

}
