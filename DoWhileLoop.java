package basic;

import java.util.Scanner;

/*
 * Write a program to print the sum of all the positive numbers 
 * provided by the user
 */

public class DoWhileLoop {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sum = 0;
		int num = 0;
		
		do {
			System.out.print("Enter any number ");
			num = s.nextInt();
			sum += num;
		}
		while(num>0);
		
		System.out.println("Sum = " + sum);
	}
}
