package exceptions;

import java.util.Scanner;

public class ThrowKeyword {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a,b;
		
		System.out.print("Enter the numerator: ");
		a = s.nextInt();
		System.out.print("Enter the denominator: ");
		b = s.nextInt();
		try {
			if(b<0) {
				throw new ArithmeticException("Denominator cannot be negative");
			}
			System.out.println("Quotient = " + (a/b));
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}
