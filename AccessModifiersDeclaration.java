package oopsbasic;

//default access class
class A{
	//default access variable
	int num;
	
	private int value;
	
	void display() {
		System.out.println(value);
	}
	
	protected void method1() {}
}

//private class C{}

//protected class D{}


public class AccessModifiersDeclaration {

	public static void main(String[] args) {
		A a = new A();
		//a.value;
	}

}
