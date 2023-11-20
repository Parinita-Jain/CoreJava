package collectionapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStream {
	public static void main(String[] args) {
		List<Student> studs = new ArrayList<Student>();
		
		studs.add(new Student(1, "harry", 18, 90.34f));
		studs.add(new Student(2, "mike", 17, 89.24f));
		studs.add(new Student(3, "scott", 18, 45.23f));
		studs.add(new Student(4, "smith", 19, 37.45f));
		studs.add(new Student(5, "den", 16, 78.34f));
		
		//Parallel Stream
		Stream<Student> parallel = studs.parallelStream();
		
		parallel.forEach(n->System.out.println(n));		
	}
}
