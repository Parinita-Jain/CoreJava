package abstraction;

interface A1{
	void display1();
}

interface A2{
	void display2();
}

//Extending interface A1
interface B extends A1{
	void calc();
}

//Extending interface A1 and A2
interface C extends A1, A2{
	
}

//class Sample1 implements B{}

public class ExtendedInterface {
	public static void main(String[] args) {
	}
}
