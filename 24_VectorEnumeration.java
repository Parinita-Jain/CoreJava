package collectionapi;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEnumeration {
	public static void main(String[] args) {
		Vector<String> names = new Vector<String>();
		names.add("harry");
		names.add("mike");
		names.add("scott");
		names.add("smith");
		
		Enumeration<String> e = names.elements();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
