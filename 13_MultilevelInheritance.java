package inheritance;

class Vehicle{
	public Vehicle() {
		System.out.println("Class Vehicle");
	}
	
	void displayVehicle() {
		System.out.println("Vehicle Class");
	}
}

class Car extends Vehicle{
	public Car() {
		//super();
		System.out.println("Class Car");
	}
	
	void displayCar() {
		System.out.println("Car Class");
	}
}

class SportsCar extends Car{
	public SportsCar() {
		//super();
		System.out.println("Class SportsCar");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		//Car c = new Car();
		//c.displayVehicle();
		
		SportsCar s = new SportsCar();
		//s.displayVehicle();
	}

}
