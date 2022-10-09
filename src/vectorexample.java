import java.util.Stack;
import java.util.Vector;

public class vectorexample {
	public static void main(String args[]) {
		// Create a vector
		Vector<String> vec = new Vector<String>(8);
		// Adding elements using add() method of List
		vec.add("Tiger");
		vec.add("Lion");
		vec.add("Dog");
		vec.add("Elephant");

		Stack<Integer> stk = new Stack<>();

		System.out.println("Elements are: " + vec);
	}

}
