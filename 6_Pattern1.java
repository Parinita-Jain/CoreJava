package practice;
/*
11111-r1-c5
22222-r2-c5
33333-r3-c5
44444-r4-c5
55555-r5-c5

no. of rows ====> outer loop (times/iteration)
no. of cols ====> inner loop

12345
12345
12345
12345
12345
*/

public class Pattern1 {

	public static void main(String[] args) {
		for(int a=1;a<=5;a++) {
			for(int b=1;b<=5;b++) {
				System.out.print("*");
			}
			System.out.println();
			//introduce line break before the next iteration of the outer loop
		}
	}
}
