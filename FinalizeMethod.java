package oopsbasic;

class Car{
	String color;
	float price;
	
	Car(String color, float price){
		this.color = color;
		this.price = price;
	}	
	
	//Also known as destructor method
	//Will be called before the object is deleted by the gc()
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Car Object Deleted " + this.color);
	}
}

public class FinalizeMethod {

	public static void main(String[] args) {
		//First object referred by reference variable c
		
		Car c = new Car("red",89348.45f);
		
		//Now we are making reference variable c refer 
		//second object, it will stop referring the first object
		//So the first object will now become unreferred.
		c = new Car("blue",3468534.34f);
		
		//Now we are making reference variable c refer 
		//third object, it will stop referring the second object
		//So the second object will now become unreferred.
		c = new Car("grey",74859.34f);
		
		System.gc();

	}

}
