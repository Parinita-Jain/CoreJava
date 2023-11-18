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
}



public class HierarchicalInheritance {
	public static void main(String[] args) {
		//Rectangle rect = new Rectangle();
		
		//Square sq = new Square();
		
		/*Shape s = new Rectangle(); //upcasting
		s.area();
		s.display();
		
		s = new Square();
		s.area();
		
		s = new Circle();
		s.area();*/
		
		int a = 10;
		float f = a; //widening 
		
		int b = (int)f; //narrowing
		
		//calling static method
		calculateArea(new Rectangle());
		calculateArea(new Square());
		calculateArea(new Circle());
		calculateArea(new Shape());
		
		add(4,5);
		
		short s1=10;
		short s2=45;
		add(s1,s2);
		add('e','u');
		//add(67f,45.34f);
		
	}
	
	static void calculateArea(Shape r) {
		r.area(); //dynamic polymorphism
	}
	
	static void add(int a,int b) {
		System.out.println("Sum = " + (a+b));
	}
}
