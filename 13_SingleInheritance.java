package inheritance;

//parent class
class A{
	/*A(){
		System.out.println("Class A Constructor");
	}*/
	
	A(int val){
		System.out.println("Class A Constructor with value " + val);
	}
	
	void display() {
		System.out.println("Hello from class A");
	}
}

//child class
class B extends A{
	B(){
		//super(); //if don't add it, compiler
		super(8); //explicitly call the parent class constructor
		System.out.println("Class B Constructor");
	}
}

class C extends Demo{
	
}

public class SingleInheritance {

	public static void main(String[] args) {
		A a = new A(6);
		a.display();
		
		B b = new B();
		b.display();
		
		Demo d = new Demo();
		d.displayMessage();
		
		C c= new C();
		c.displayMessage();
	}

}
