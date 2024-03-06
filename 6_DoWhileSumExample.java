package practice;
import java.util.Scanner;

public class DoWhileSumExample {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int sum = 0;
		int i = 0;
		do {
			//atleast once without checking the condition
			System.out.print("Enter a number ");
			i = s.nextInt();
			sum += i;
		}while(i>0);
		
		System.out.println("Sum = " + sum);
	}
}
