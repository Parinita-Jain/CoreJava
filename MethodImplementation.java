package oopsbasic;

class Sample{
	//method declaration
	void sendMessage() {
		System.out.println("Hello from a method");
	}	
	
	int add(int a, int b) {
		return a + b;
	}
	
	void display(String name,int age, float marks) {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Marks: " + marks);
	}
	
	String findEvenOdd(int num){
		if(num%2==0)
			return "Even";
		else
			return "Odd";
	}
}

public class MethodImplementation {
	public static void main(String[] args) {
		Sample s = new Sample();
		//method call
		System.out.println("Before Method Call");
		s.sendMessage();
		System.out.println("After Method Call");
		
	    System.out.println(s.add(6, 4));
	    
	    int val = s.add(4, 9);
	    System.out.println(val);
	    
	    s.display("harry", 15, 89.45f); //valid
	    s.display("ron", 17, 89.45f);
	    //s.display(13, "ron", 89.56f); //invalid
	    //s.display("leena", 12);  //invalid
	    
	    System.out.println(s.findEvenOdd(67));
	    System.out.println(s.findEvenOdd(14));
	    System.out.println(s.findEvenOdd(90));
	}
}
