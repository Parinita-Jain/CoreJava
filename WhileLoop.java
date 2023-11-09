package basic;

import java.util.Scanner;

/*
 * Write a program to print the sum of all the positive numbers 
 * provided by the user
 */

public class WhileLoop {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter any number ");
		int num = s.nextInt();
		int sum = 0;
		
		while(num>0) {
			sum += num;
			System.out.print("Enter any number ");
			num = s.nextInt();
		}
		
		System.out.println("Sum = " + sum);
	}

}
