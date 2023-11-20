package collectionapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ComparableComparator {

	public static void main(String[] args) {
		List<String> sub = new ArrayList<String>();
		
		sub.add("english");
		sub.add("maths");
		sub.add("science");
		sub.add("hindi");
		sub.add("geography");
		
		Collections.sort(sub);
		
		System.out.println(sub);
		
		Set<Integer> age = new TreeSet<Integer>();
		
		age.add(17);
		age.add(18);
		age.add(16);
		age.add(19);
		
		System.out.println(age);	
		
		List<Student> studs = new ArrayList<Student>();
		
		studs.add(new Student(1, "harry", 18, 90.34f));
		studs.add(new Student(2, "mike", 17, 89.24f));
		studs.add(new Student(3, "scott", 18, 45.23f));
		studs.add(new Student(4, "smith", 19, 37.45f));
		studs.add(new Student(5, "den", 16, 78.34f));
		
		Collections.sort(studs);
		
		for(Student s : studs) {
			System.out.println(s);
		}
		
		System.out.println("---------------------------");
		
		Collections.sort(studs,new SortByNameDescending());
		
		for(Student s : studs) {
			System.out.println(s);
		}
		
		System.out.println("---------------------------");
		
		Collections.sort(studs,new SortByAgeAscending());
		
		for(Student s : studs) {
			System.out.println(s);
		}
		
		System.out.println("---------------------------");
		
		Collections.sort(studs,new SortByAgeDescending());
		
		for(Student s : studs) {
			System.out.println(s);
		}
	}
}
