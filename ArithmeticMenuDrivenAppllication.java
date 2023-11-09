package basic;

import java.util.Scanner;

public class ArithmeticMenuDrivenAppllication {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//infinite loop
		while(true) {
			//Arithmetic Menu
			System.out.println("Select the arithmetic operation to be performed: ");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("0. Exit");
			System.out.print("Enter your choice: ");
			int choice = s.nextInt();
			
			if(choice==0)
				break; //stop the loop
			else if(choice==1 || choice==2 || choice==3 ||choice==4) {
				System.out.print("Enter any number ");
				int num1 = s.nextInt();
				System.out.print("Enter any number ");
				int num2 = s.nextInt();
				switch(choice) {
				case 1: System.out.println("Sum = " + (num1+num2));
					break;
				case 2: System.out.println("Difference = " + (num1-num2));
					break;
				case 3:System.out.println("Product = " + (num1*num2));
					break;
				case 4:System.out.println("Quotient = " + (num1/num2));
				}
			}
			else
				System.out.println("Please enter the correct number for your choice");				
		}
	}
}
