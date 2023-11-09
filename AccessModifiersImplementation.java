package oopsbasic;

public class AccessModifiersImplementation {

	public static void main(String[] args) {
		A a = new A();
		a.num = 10;
		B b = new B();
		b.display();
		
		a.method1();
	}
}
