import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class reverseGenericCollection {

	public static <T extends Number> void reverse(Collection<T> collection) {
		Stack<T> something = new Stack<>();
		for (T el : collection) {
			something.push(el);
		}
		collection.clear();
		while(!something.isEmpty()){
			collection.add(something.pop());
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		System.out.println(a);
		reverse(a);
		System.out.println(a);
	}

}
