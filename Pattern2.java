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

public class Pattern2 {
	public static void main(String[] args) {
		for(int x = 1; x<=5; x++) {
			for(int y = 1; y<=x; y++) {
				System.out.print(x);
			}
			System.out.println();
		}
	}
}
