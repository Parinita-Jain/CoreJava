package practice;
import java.util.Scanner;
/*
1		-r1	-c1
22		-r2	-c2
333		-r3	-c3
4444	-r4	-c4
55555	-r5	-c5

1
12
123
1234
12345

*
**
***
****
*****

A
BB
CCC
DDDD
EEEEE

55555
4444
333
22
1

*/

public class Pattern2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows=s.nextInt();
		//number pattern
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		//star pattern
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//character pattern
		char val = 65;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(val);
			}
			val++;
			System.out.println();
		}
		//reverse pattern
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		//reverse star pattern
		for(int i=rows;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
