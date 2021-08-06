package fila;

import java.util.LinkedList;
import java.util.Queue;

public class TesteFilaNativa {
    public static void main(String[] args) {

		Queue<Integer> q1 = new LinkedList<Integer>();
		
		q1.add(10);
        q1.add(20);
        q1.add(30);
        System.out.println(q1);
		System.out.println(q1.peek());
		q1.remove();
        System.out.println(q1.isEmpty());
	}   
}
