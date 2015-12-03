
public class countOccurences {

	public static int countOcurrences(String needle, String haystack) {

		int occurence = 0;
		int lastIndex = 0;

		while (lastIndex != -1) {
			lastIndex = haystack.indexOf(needle, lastIndex);
			if (lastIndex != -1) {
				occurence++;
				lastIndex += needle.length();
			}
		}
		return occurence;
	}

	public static void main(String[] args) {
		System.out.println(countOcurrences("da", "daaadaadada"));
	}

}
