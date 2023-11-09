package basic;

/*
 * Rectangle Pattern
 * 11111
 * 22222
 * 33333
 * 44444
 * 55555
 * 
 * 12345
 * 12345
 * 12345
 * 12345
 * 12345
 * 
 * ****
 * ****
 * ****
 * ****
 * 
 * 1. No. of rows in the pattern will decide the 
 * no. of iteration for the outer loop
 * 
 * 2. In each row, how many values are printed, this will 
 * decide the iterations of the inner loop
 */

public class Pattern1 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(i); //print the value in same row
			}
			System.out.println(); //to change the row
		}
	}

}
