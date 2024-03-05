import java.util.Scanner;

class Input{
	public static void main(String[] args){
		//using s we will read the input
		Scanner s = new Scanner(System.in);

		System.out.println("Enter your name");
		//next() will wait for the user to enter some string 
		//and press the enter key
		//as the user press the enter key, the string entered
		//will be assigned to the variable name
		String name = s.next();

		System.out.println("Enter your age");
		int age = s.nextInt();

		System.out.print("Enter the first number ");
		float a = s.nextFloat();
		System.out.print("Enter the second number ");
		float b = s.nextFloat();
		
		float result = a+b;

		//concatenation
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);

		System.out.println("Result: " + result);

		//compound assignment operator
		result += a; // result = result + a
		System.out.println("Result: " + result);
	}
}