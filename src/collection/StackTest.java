package collection;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class StackTest {

	public static void main(String[] args) {
		Vector<String> stack = new Stack<String>();
		//
		stack.push("둘리");
		stack.push("또치");
		stack.push("희동이");
		
		while(stack.isEmpty() ==false) {
			String value = stack.pop();
			System.out.println(value);
		}
		//stack.pop();//비어있는 경우 예외 발생
		stack.push("둘리");
		stack.push("또치");
		stack.push("희동이");
		System.out.println(stack.pop());
		System.out.println(stack.peek());//빼내진 않고 맨위에 뭐가 있는지만 보는것
		System.out.println(stack.pop());
		
	}

}
