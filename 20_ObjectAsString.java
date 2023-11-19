package stringanddate;

class Student{
	private int id;
	private String name;
	private float marks;
	
	Student(int id, String name, float marks){
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		String output = "ID: " + id 
						+ "\nName: " + name 
						+ "\nMarks: " + marks;
		return output;
		//return "Student Object";
	}
}

class Car{
	private String color;
	private String fuel;
	private int speed;
	
	public Car(String color, String fuel, int speed) {
		this.color = color;
		this.fuel = fuel;
		this.speed = speed;
	}	
	
	@Override
	public String toString() {
		return "Car Object " + color + " " + fuel + " " + speed;
	}
}

public class ObjectAsString {
	public static void main(String[] args) {
		Student s1 = new Student(1,"harry",78.34f);
		Student s2 = new Student(2,"mike",45.34f);
		
		System.out.println(s1);
		//System.out.println(s1.toString()); //added by compiler
		System.out.println(s2);
		
		
		System.out.println(new Car("red","cng",60));
		//compiler will place a call to a method called toString()
		//By default this method is available in Object class
		
		Car c = new Car("blue","petrol",120);
		System.out.println(c);		
	}
}
