package collections.stack;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		List<String> list=new Stack();
		Stack<String> stack=(Stack<String>)list;
		stack.push("pallavi");
		stack.push("janavi");
		stack.add("vinodh");
		System.out.println(stack);
		
		stack.pop();
		for(String i:stack)
			System.out.println(i);
		System.out.println(stack.firstElement());
	}
}
