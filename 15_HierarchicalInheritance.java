package inheritance;

import java.util.Scanner;

class Shape{
	static Scanner s = new Scanner(System.in);
	
	void display() {
		System.out.println("Class Shape");
	}
	
	void area() {
		System.out.println("Area of any shape");
	}
}

class Rectangle extends Shape{
	@Override
	void area() {
		System.out.print("Enter the length of the rectangle ");
		int l = s.nextInt();
		System.out.print("Enter the breadth of the rectangle ");
		int b = s.nextInt();
		System.out.println("Area of the rectangle = " + (l*b));
	}
	
	void perimeter() {
		System.out.print("Enter the length of the rectangle ");
		int l = s.nextInt();
		System.out.print("Enter the breadth of the rectangle ");
		int b = s.nextInt();
		System.out.println("Perimeter of the rectangle = " + 2*(l+b));
	}
}

class Square extends Shape{
	@Override
	void area() {
		System.out.print("Enter the side length of the square ");
		int side = s.nextInt();		
		System.out.println("Area of the square = " + (side * 4));
	}
	
}

class Circle extends Shape{
	@Override
	void area() {
		System.out.print("Enter the radius of the circle ");
		int r = s.nextInt();
		System.out.println("Area of the circle = " + (3.14 * r * r));
	}
	
	void circumference() {
		System.out.print("Enter the radius of the circle ");
		int r = s.nextInt();
		System.out.println("Circumference of the circle = " + (3.14 * 2 * r));
	}
}

public class HierarchicalInheritance {
	public static void main(String[] args) {
		//Rectangle rect = new Rectangle();
		
		//Square sq = new Square();
		
		/*Shape s = new Rectangle(); //upcasting
		s.area();
		s.display();
		((Rectangle)s).perimeter(); // downcasting
		
		s = new Square();
		s.area();
		
		s = new Circle();
		s.area();*/
		
		int a = 10;
		float f = a; //widening 
		
		int b = (int)f; //narrowing
		
		//calling static method	
		
		/*add(4,5);
		
		short s1=10;
		short s2=45;
		add(s1,s2);
		add('e','u');
		//add(67f,45.34f);*/		
		
		calculate(new Rectangle()); 
		calculate(new Square());
		calculate(new Circle());
		calculate(new Shape());
	}
	
	static void calculate(Shape r) { //upcasting
		r.area(); //dynamic polymorphism
		if(r instanceof Rectangle) { //check
			((Rectangle)r).perimeter(); //downcasting
		}
		if(r instanceof Circle) { //check
			((Circle)r).circumference(); //downcasting
		}
	}
	
	static void add(int a,int b) {
		System.out.println("Sum = " + (a+b));
	}
}
