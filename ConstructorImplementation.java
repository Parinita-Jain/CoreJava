package oopsbasic;

class Student{
	int rollNo;
	String name;
	float marks;
	boolean present = true; //programmer initializing
	
	Student(){
		System.out.println("No-arg Constructor");
	}
	
	Student(int r){
		System.out.println("Parameterized Constructor with only one parameter");
	}
	
	Student(int r,String n,float m){
		this();
		System.out.println("Parameterized Constructor with three parameters");
	}
}

public class ConstructorImplementation {
	public static void main(String[] args) {
		Student s = new Student(6);
		System.out.println(s.rollNo);
		System.out.println(s.name);
		System.out.println(s.marks);
		
		Student s1 = new Student();
		Student s2 = new Student(9);
		Student s3 = new Student(8,"harry",78.35f);
	}
}
