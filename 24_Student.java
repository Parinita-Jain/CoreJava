package collectionapi;

import java.util.Comparator;

public class Student implements Comparable<Student> {
	private int id;
	private String name;
	private int age;
	private float marks;
	
	public Student(int id, String name, int age, float marks) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student o) {
		//ascending order by name
		return this.name.compareTo(o.name);
		
		//descending order by name
		/*int val = this.name.compareTo(o.name);
		if(val==0)
			return 0;
		else if(val>0)
			return -1;
		else 
			return 1;*/
		
		//ascending order by age
		/*if(this.age == o.age)
			return 0;
		else if(this.age > o.age)
			return -1;
		else 
			return 1;
			*/
	}	
}

class SortByNameAscending implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}

class SortByNameDescending implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		int val = o1.getName().compareTo(o2.getName());
		
		if(val==0)
			return 0;
		else if(val>0)
			return -1;
		else
			return 1;
	}	
}

class SortByAgeAscending implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getAge() == o2.getAge())
			return 0;
		else if(o1.getAge() < o2.getAge())
			return -1;
		else 
			return 1;
	}
	
}

class SortByAgeDescending implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getAge() == o2.getAge())
			return 0;
		else if(o1.getAge() > o2.getAge())
			return -1;
		else 
			return 1;
	}
	
}
