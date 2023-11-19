package collectionapi;

import java.util.HashSet;
import java.util.Set;

public class SetInterface {

	public static void main(String[] args) {
		Set set = new HashSet();
		
		set.add(56);
		set.add("java");
		set.add(78.34f);
		set.add(56);
		set.add("java");
		
		System.out.println(set);
		
		set.remove(56);
		System.out.println(set);
		
		for(Object o : set) {
			System.out.println(o);
		}
		
	}

}
