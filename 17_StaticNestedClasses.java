package nestedclasses;

class ABC{
	static int i = 10;
	
	static void display() {
		System.out.println("static method");
	}
	
	static class ABCInner{
		void displayInner() {
			System.out.println("inside the static inner class");
		}
	}
}

public class StaticNestedClasses {
	public static void main(String[] args) {
		
		System.out.println(ABC.i);
		
		ABC.display();
		
		ABC.ABCInner a = new ABC.ABCInner();
		a.displayInner();
	}
}
