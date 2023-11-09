package oopsbasic;

class Person{
	//states ==> variables
	String name;
	int age;
	long phoneNo;
	String address;
	
	//behaviours ==> methods
	void eat(String food, String course) {
		System.out.println("Eating " + food + " for " + course);
	}
	
	void sleep(int hours) {
		System.out.println("Sleeping for " + hours + " hours." );
	}
	
	void walk() {
		System.out.println("Walking");
	}
}

public class ClassObjectConcept {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
				
		p1.name = "ekwinder";
		p1.age = 34;
		p1.phoneNo = 9784788554L;
		p1.address = "mumbai";
		
		p2.name = "rohit";
		p2.age = 22;
		p2.phoneNo = 9458973475L;
		p2.address = "mumbai";
		
		System.out.println(p1.name);
		System.out.println(p2.name);
		
		p1.eat("maggi","lunch");
		
		p2.sleep(8);
		
		p2.eat("chips","breakfast");
	}
}
