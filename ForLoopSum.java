package basic;

import java.util.Scanner;

/* Write a program to print the sum of the first n natural numbers
 * 1+2+3+4+5+6+7+8+9+10 = ?
 * 
 * sum = 0
 * i=1		i<=10		i++
 * I	=>	i=1		sum=0+1=1	i=2
 * II	=>	i=2		sum=1+2=3	i=3
 * III	=>	i=3		sum=3+3=6	i=4
 * IV	=>	i=4		sum=6+4=10	i=5
 * V	=>	i=5		sum=10+5=15	i=6
 * VI	=>	i=6		sum=15+6=21	i=7
 * VII	=>	i=7		sum=21+7=28	i=8
 * VIII	=>	i=8		sum=28+8=36	i=9
 * IX	=>	i=9		sum=36+9=45	i=10
 * X	=>	i=10	sum=45+10=55	i=11
 */

public class ForLoopSum {
	public static void main(String[] args) {
		int sum = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter any natural number ");
		int limit = s.nextInt();
		for(int i=1; i<=limit; i++) {
			sum += i; //sum = sum + i
			System.out.println(sum);
		}
		
		System.out.println("Sum = " + sum);
	}
}
