package collectionapi;

import java.util.ArrayList;
import java.util.List;

public class GenericCollection {

	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add("harry");
		list.add("mike");
		
		//list.add(78);
		
		for(Object o : list) {
			System.out.println("Element: " + 
							((String)o).toUpperCase());			 
		}
		
		List<String> names = new ArrayList<String>();
		names.add("harry");
		//names.add(89);
		
		List<Integer> age = new ArrayList<Integer>();
		age.add(67);
	}

}
