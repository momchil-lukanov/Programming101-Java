package tasks;

import java.util.Vector;

public class getPalindromeLength {

	public static int getPalindromeLength(String input) {
		
		Vector<String> temp = new Vector<>();
		String word = "";
		int counter = 0;
		
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) != '*') {
				if (counter == 0) {
					word = input.charAt(i) + word;
				} else {
					word += input.charAt(i);
				}
			} else {
				counter += 1;
				temp.add(word);
				word = "";
			}
		}
		
		counter = 0;
		
		for (int i = 0; i < temp.size(); i++) {
			for (int j = 0; j < temp.get(j).length(); j++) {
				
			}
		}
		
		return counter;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
