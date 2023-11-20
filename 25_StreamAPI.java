package collectionapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {
	public static void main(String[] args) {
		List<String> sub = new ArrayList<String>();
		
		sub.add("english");
		sub.add("maths");
		sub.add("geometry");
		sub.add("hindi");
		sub.add("geography");
		sub.add("history");
		
		//Sequential Stream
		//1. Create the stream over the collection
		Stream<String> s = sub.stream();		
		
		//2. Pipeline the task on the stream
		//Using forEach method on stream
		//s.forEach(n->System.out.println(n));
		
		//Pipeline sorting, then printing
		//s.sorted().forEach(n->System.out.println(n));
		
		//Pipeline filtering, then printing
		//s.filter(n->n.contains("e")).forEach(n->System.out.println(n));
		
		//Pipeline filtering, sorting, then printing
		//s.filter(n->n.endsWith("y")).sorted().forEach(n->System.out.println(n));
		
		List<Student> studs = new ArrayList<Student>();
		
		studs.add(new Student(1, "harry", 18, 90.34f));
		studs.add(new Student(2, "mike", 17, 89.24f));
		studs.add(new Student(3, "scott", 18, 45.23f));
		studs.add(new Student(4, "smith", 19, 37.45f));
		studs.add(new Student(5, "den", 16, 78.34f));
		
		Stream<Student> stream = studs.stream();
		
		//stream.forEach(n->System.out.println(n));
		
		//stream.sorted().forEach(n->System.out.println(n));
		
		//stream.sorted(new SortByAgeDescending()).forEach(n->System.out.println(n));
		
		stream.filter(n->n.getMarks()>=60).sorted().forEach(n->System.out.println(n));
	}
}
