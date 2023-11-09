package basic;
/*
 * Left-Sided Right-Angle Triangle
 * 1
 * 22
 * 333
 * 4444
 * 55555
 * 
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 
 * *
 * **
 * ***
 * ****
 * *****
 * 
 * A
 * BB
 * CCC
 * DDDD
 * EEEEE
 * 
 * 55555
 * 4444
 * 333
 * 22
 * 1
 * 
 * 1. No. of rows ===> outer loop iteration
 * 2. For each row the no. of value printed
 * 
 * 1st Row ===> 1
 * 2nd Row ===> 2
 * 3rd Row ===> 3
 * 4th Row ===> 4
 * 5th Row ===> 5
 * 
 * x=1
 * y=1;y<=1
 * 
 * x=2
 * y=1;y<=2
 * 
 * x=3
 * y=1;y<=3
 */

import java.util.Scanner;

public class Pattern2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of rows ");
		int rows = s.nextInt();
		
		//for(int x = 1; x<=5; x++) {
		for(int x=1;x<=rows;x++) {
			for(int y = 1; y<=x; y++) {
				System.out.print(y);
			}
			System.out.println();
		}
		
		System.out.println("Star Pattern");
		for(int x = 1; x<=rows; x++) {
			for(int y = 1; y<=x; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Alphabet Pattern 1");
		int a = 65; //65 is the ASCII value of A
		for(int x = 1; x<=rows; x++, a++) {
			for(int y = 1; y<=x; y++) {
				System.out.print((char)a);
			}
			System.out.println();
		}
		
		System.out.println("Alphabet Pattern 2");
		for(int x = 1; x<=rows; x++) {
			a = 65;
			for(int y = 1; y<=x; y++, a++) {
				System.out.print((char)a);
			}
			System.out.println();
		}
		
		System.out.println("Reversed Pattern");
		for(int x = rows; x>=1; x--) {
			for(int y = 1; y<=x; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
