import java.util.Vector;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class getPalindromeLength {

	public static int getPalindromeLength(String input) {

		Vector<String> temp = new Vector<>();
		String word = "";
		int counter = 0;

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '*') {
				counter += 1;
				temp.add(word);
				word = "";
			} else {
				if (counter == 0) {
					word = input.charAt(i) + word;
				} else {
					word += input.charAt(i);
				}
			}
		}
		temp.add(word);
		counter = 0;

		for (int i = 0; i < temp.get(0).length(); i++) {
			Character x = temp.get(0).charAt(i);
			Character y = temp.get(1).charAt(i);
			if (x.equals(y)) {
				counter += 1;
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		String a = "daz*zad";
		System.out.println(getPalindromeLength(a));
	}
}
