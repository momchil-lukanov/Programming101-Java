package tasks;

import java.util.Vector;

public class reverseEveryChar {

	public static String reverseEveryChar(String arg) {
		
		String result = "";
		Vector<String> temp = new Vector<>(); 
		
		for (int i = 0; i < arg.length(); i++) {
			if (arg.charAt(i) != ' ') {
				result = arg.charAt(i) + result;
			} else {
				temp.add(result);
				result = "";
			}
		}
		
		temp.add(result);
		
		result = "";
		
		for (int i = 0; i < temp.size(); i++) {
			result += temp.elementAt(i) + " ";
		}
		return result;
	}

	public static void main(String[] args) {
		String a = "What is this";
		System.out.println(reverseEveryChar(a));
	}

}
