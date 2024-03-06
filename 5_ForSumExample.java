package practice;

/*Sum of first 10 numbers
 * 1+2+3+4+5+6+7+8+9+10=55
 * 
 * sum=0
 * i=1	i<=10	i++
 * 
 * sum+=i ===> sum=0+1  = 1		i=2
 * sum+=i ===> sum=1+2  = 3		i=3
 * sum+=i ===> sum=3+3  = 6		i=4
 * sum+=i ===> sum=6+4  = 10	i=5
 * sum+=i ===> sum=10+5 = 15	i=6
 * sum+=i ===> sum=15+6 = 21	i=7
 * sum+=i ===> sum=21+7 = 28	i=8
 * sum+=i ===> sum=28+8 = 36	i=9
 * sum+=i ===> sum=36+9 = 45	i=10
 * sum+=i ===> sum=45+10= 55	i=11
 */
import java.util.Scanner;

public class ForSumExample {

	public static void main(String[] args) {
		//Using for loop
		int sum=0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the limit for summation ");
		int limit = s.nextInt();
		for(int i=1;i<=limit;i++) {
			sum+=i;
		}
		System.out.println("Sum using for = " + sum);
		
		//Using while loop
		sum=0; //reinitialize
		int i=1; //initialexpression
		while(i<=limit) {
			sum+=i;
			i++; //updateexpression
		}
		System.out.println("Sum using while = " + sum);
	}
}
