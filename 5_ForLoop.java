package practice;
import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		/*System.out.println("Welcome to Java");
		System.out.println("Welcome to Java");
		System.out.println("Welcome to Java");
		System.out.println("Welcome to Java");
		System.out.println("Welcome to Java");*/
		
		Scanner s = new Scanner(System.in);
		System.out.print("Provide the number of times the message is to be printed");
		int n = s.nextInt();
		
		//for(int i=1;i<=10;i++) {
		for(int i=1;i<=n;i++) {
			System.out.println("Welcome to Java " + i);
		}
		
		//for(int i=10;i>=1;i--) {
		for(int i=n;i>=1;i--) {
			System.out.println(i);
		}
	}
}
