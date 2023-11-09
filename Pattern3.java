package basic;

import java.util.Scanner;

/*
 * Right-sided right-angled triangle
 *     1 ===> 4 spaces
 *    22 ===> 3 spaces
 *   333 ===> 2 spaces
 *  4444 ===> 1 space
 * 55555 ===> 0 space
 * 
 *   1 ===> 2 spaces
 *  22 ===> 1 space
 * 333 ===> 0 space
 * 
 *     *
 *    **
 *   ***
 *  ****
 * *****
 * 
 * Equi-lateral Triangle
 *     *
 *    * *
 *   * * *
 *  * * * *
 * * * * * *
 */

public class Pattern3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of the rows ");
		int rows = s.nextInt();		
		
		int spaces = rows-1; 
		for(int i=1;i<=rows;i++, spaces--) {
			//printing the spaces
			for(int k=1;k<=spaces;k++) {
				System.out.print(" ");
			}			
			//printing the values
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println("Star Pattern");
		spaces = rows-1; 
		for(int i=1;i<=rows;i++, spaces--) {
			//printing the spaces
			for(int k=1;k<=spaces;k++) {
				System.out.print(" ");
			}			
			//printing the values
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Equilateral Triangle");
		spaces = rows-1; 
		for(int i=1;i<=rows;i++, spaces--) {
			//printing the spaces
			for(int k=1;k<=spaces;k++) {
				System.out.print(" ");
			}			
			//printing the values
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
