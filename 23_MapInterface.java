package collectionapi;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapInterface {
	public static void main(String[] args) {
		//Non-generic Map
		Map map = new HashMap();
		map.put("a", 6);
		map.put(3, "abc");
		map.put(1, 9);
		
		System.out.println(map);
		
		//Generic Map
		//Map<String,Integer> marks = new HashMap<String, Integer>();
		
		//Map<String, Integer> marks = new LinkedHashMap<String, Integer>();
		
		Map<String, Integer> marks = new TreeMap<String, Integer>();
		
		marks.put("english", 89);
		marks.put("hindi", 67);
		marks.put("science", 34);
		marks.put("maths",56);
		
		System.out.println(marks);
		
		marks.put("hindi", 90);
		System.out.println(marks);
		
		marks.put("history",56);
		System.out.println(marks);
		
		Set<String> subjects = marks.keySet();
		System.out.println(subjects);
		
		Collection<Integer> marksVals = marks.values();
		System.out.println(marksVals);
		
		marks.replace("english", 78);
		System.out.println(marks);
		
		marks.remove("hindi");
		System.out.println(marks);
	}

}
