package collectionapi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionIteration {
	public static void main(String[] args) {
		List<Integer> vals = new ArrayList<Integer>();
		
		vals.add(67);
		vals.add(49);
		vals.add(24);
		
		System.out.println("Using Normal For Loop");
		
		for(int i=0; i<vals.size(); i++) {
			System.out.println("Element at index " + i + ": " + vals.get(i));
		}
		
		System.out.println("Using Enhanced For Loop");
		
		for(Integer i : vals) {
			System.out.println("Element: " + i);
		}
		
		System.out.println("Using Iterator Interface");
		
		Iterator<Integer> iter = vals.iterator();
		
		/*
		//first element
		System.out.println(iter.hasNext());
		System.out.println(iter.next());
		//second element
		System.out.println(iter.hasNext());
		System.out.println(iter.next());
		//third element
		System.out.println(iter.hasNext());
		System.out.println(iter.next());
		//fourth element
		System.out.println(iter.hasNext());
		System.out.println(iter.next());
		*/
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("Using ListIterator Interface");
		
		ListIterator<Integer> listIter = vals.listIterator();
		
		System.out.println(listIter.next());
		System.out.println(listIter.next());
		System.out.println(listIter.previous());
		System.out.println(listIter.hasPrevious());
		System.out.println(listIter.previous());
		System.out.println(listIter.hasPrevious());		
	}
}
