package practice;
import java.util.Scanner;

public class WhileSumExample {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter a number ");
		int i = s.nextInt();
		
		int sum = 0;
		
		while(i>0) {
			sum += i;
			System.out.print("Enter a number ");
			i = s.nextInt();
		}		
		System.out.println("Sum = " + sum);
	}
}
