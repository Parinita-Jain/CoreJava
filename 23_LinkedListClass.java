package collectionapi;

import java.util.LinkedList;

public class LinkedListClass {

	public static void main(String[] args) {
		LinkedList<String> subjects = new LinkedList<String>();
		
		subjects.add("english");
		subjects.add("maths");
		subjects.add(1,"science");
		
		System.out.println(subjects);
		
		subjects.addFirst("hindi");
		subjects.addLast("history");
		
		System.out.println(subjects);
		
		subjects.remove(2);
		System.out.println(subjects);
		
		subjects.removeFirst();
		System.out.println(subjects);
		
		subjects.removeLast();
		System.out.println(subjects);
	}

}
