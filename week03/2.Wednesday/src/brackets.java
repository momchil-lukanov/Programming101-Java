import java.util.Stack;

public class brackets {
	
	public static boolean areCorrect(String brackets) {
		Stack<Character> something = new Stack<>();
		
		for (int i = 0; i < brackets.length(); i++) {
			Character sth = brackets.charAt(i);
			if (sth.equals('(')) {
				something.push(sth);
			}
			if (sth.equals(')')) {
				if (something.peek().equals('(')) {
					something.push(sth);
				} else {
					return false;
				}
			}
		}
		return true;
		
		
	}

	public static void main(String[] args) {
		String a = "()()())))((())(";
		String b = "()()()";
		System.out.println(areCorrect(a));
		System.out.println(areCorrect(b));
	}

}
