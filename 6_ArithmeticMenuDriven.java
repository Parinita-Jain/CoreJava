package practice;
import java.util.Scanner;

public class ArithmeticMenuDriven {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1,num2;
		int operator;
		
		//Infinite Loop
		while(true) {			
			System.out.println("Select the arithmetic operation from the following: ");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Modulus");
			System.out.println("6. Exit");
			operator = s.nextInt();
			
			//Stop the loop
			if(operator==6)
				break;	
			System.out.print("Enter first number ");
			num1 = s.nextInt();
			System.out.print("Enter second number ");
			num2 = s.nextInt();			
			switch (operator) {
			case 1:	System.out.println("Sum = " + (num1+num2));			
				break;
			case 2:	System.out.println("Difference = " + (num1-num2));				
				break;
			case 3:	System.out.println("Product = " + (num1*num2));				
				break;
			case 4:	System.out.println("Division = " + (num1/num2));				
				break;
			case 5:	System.out.println("Remainder = " + (num1%num2));				
				break;
			default: System.out.println("Not a valid choice");	
				break;
			}
		}
	}
}
