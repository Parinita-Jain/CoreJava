package oopsbasic;

class Student{
	int rollNo;
	String name;
	float marks;
	boolean present = true; //programmer initializing
	
	//no-arg constructor
	Student(){
		System.out.println("No-arg Constructor");
	}
	
	//parameterized constructor
	Student(int rollNo){
		this.rollNo = rollNo;
		System.out.println("Parameterized Constructor with only one parameter");
	}
	
	Student(int rollNo,String name,float marks){
		this(rollNo);
		//this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
		System.out.println("Parameterized Constructor with three parameters");
	}
	
	void display() {		
		System.out.println("RollNo: " + rollNo
							+"\nName: " + name
							+"\nMarks: " + marks);
		System.out.println("Aggregate: " + 
							 + this.calculateAggregate());
		
	}
	
	float calculateAggregate() {
		return (this.marks/120) * 100;
	}
}

public class ConstructorImplementation {
	public static void main(String[] args) {
		Student s = new Student(6);
		System.out.println(s.rollNo);
		System.out.println(s.name);
		System.out.println(s.marks);
		
		Student s1 = new Student();
		s1.display();
		Student s2 = new Student(9);
		s2.display();
		Student s3 = new Student(8,"harry",78.35f);
		s3.display();
		
		
	}
}
