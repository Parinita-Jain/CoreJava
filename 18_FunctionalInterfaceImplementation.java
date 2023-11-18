package nestedclasses;

@FunctionalInterface
interface Area{
	float calculate();
}

//1. Create a subclass and implement the method of the interface
class Rectangle implements Area{
	@Override
	public float calculate() {
		float length = 10.34f;
		float breadth = 67.34f;		
		return length * breadth;
	}
}

public class FunctionalInterfaceImplementation {

	public static void main(String[] args) {
		//Rectangle r = new Rectangle();
		Area r = new Rectangle();
		System.out.println(r.calculate());
		
		//2. Create an anonymous class and implement the method of the interface
		Area sq = new Area() {			
			@Override
			public float calculate() {
				float side = 89.34f;
				return side * side;
			}
		};
		
		System.out.println(sq.calculate());
		
		//3. We can use lambda expressions to implement the functional interface
		//No-arg method
		Area circle = () -> {
			float PI = 3.14f;
			float radius  = 23.43f;
			
			return radius * radius * PI;
		};
		
		System.out.println(circle.calculate());
	}
}
