package collectionapi;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeInterface {

	public static void main(String[] args) {
		Deque<Integer> deque = new ArrayDeque<Integer>();
		
		deque.add(78);
		deque.add(89);
		deque.add(34);
		
		System.out.println(deque);
		
		deque.addFirst(34);
		deque.addLast(90);
		
		System.out.println(deque);
		
		deque.remove();
		System.out.println(deque);
		
		deque.removeLast();
		System.out.println(deque);
		
		deque.removeFirst();
		System.out.println(deque);
	}

}
