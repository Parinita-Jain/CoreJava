package collectionapi;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {
	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add(2); //boxing //0
		list.add(true);  //1
		list.add("itvedant");//2
		list.add(2);
		list.add("itvedant");
		
		System.out.println(list);
		
		System.out.println(list.get(0));
		
		//for-each loop
		for(Object o : list) {
			System.out.println("Elements are: " + o);
			
		}
	}

}
