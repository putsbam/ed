package pilha;

import java.util.Stack;

public class TestePilhaNativa {

	public static void main(String[] args) {

		Stack<Integer> p1 = new Stack<Integer>();
		
		p1.push(10);
		p1.push(20);
		p1.push(30);
		System.out.println(p1.peek());
		p1.pop();
		System.out.println(p1.peek());

	}

}
