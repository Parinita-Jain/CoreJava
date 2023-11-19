package collectionapi;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface {
	public static void main(String[] args) {
		Queue<Integer> queue = new PriorityQueue<Integer>();
		
		queue.add(4);
		queue.add(9);
		queue.add(18);
		queue.add(1);
		
		System.out.println(queue);
		
		queue.add(78);
		
		System.out.println(queue);
		
		queue.remove();
		
		System.out.println(queue);
		
		queue.remove(78);
		System.out.println(queue);
	}
}
