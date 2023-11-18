package abstraction;

class Car extends Object{
	
}

class Bike{
	
}

class ClassicCar extends Car{
	
}

public class ObjectClass {
	public static void any(Object obj) {
		
	}
	
	public static Object anyReturn() {
		//return new Object();
		return new Car();
	}
	
	public static void main(String[] args) {
		ObjectClass.any(new Car());
		ObjectClass.any(new Bike());
		ObjectClass.any(new ClassicCar());
	}
}
