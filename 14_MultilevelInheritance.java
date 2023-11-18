package inheritance;

class Vehicle{
	public Vehicle() {
		System.out.println("Constructor of Class Vehicle");
	}
	
	/*void displayVehicle() {
		System.out.println("Vehicle Class");
	}*/

	void display() {
		System.out.println("Vehicle Class");
	}
	
	void calculateFuel(float distance) {
		System.out.println("Fuel required is " + (distance*2.5));
	}
}

class Car extends Vehicle{
	public Car() {
		//super();
		System.out.println("Constructor of Class Car");
	}
	
	/*void displayCar() {
		System.out.println("Car Class");
	}*/
	
	void print() {}
	
	@Override
	void display() {		
		System.out.println("Car Class");
		super.display();
		super.calculateFuel(9);
	}
}

class SportsCar extends Car{
	public SportsCar() {
		//super();
		System.out.println("Constructor of Class SportsCar");
	}
	
	void display() {
		super.display();
		System.out.println("SportsCar Class");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		Car c = new Car();
		//c.displayVehicle();
		
		c.display();
		
		SportsCar s = new SportsCar();
		//s.displayVehicle();
		
		s.display();
	}

}
