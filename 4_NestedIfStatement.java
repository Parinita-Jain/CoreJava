//WAP to check if a number is divisible by 3 and 7
package practice;
import java.util.Scanner;

class NestedIfStatement{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
	
		System.out.print("Enter any number ");
		int num = s.nextInt();

		if(num%3==0 && num%7==0){
			System.out.println("Number is divisible by 3 and 7");
		}	
		else {
			System.out.println("Number is not divisible by 3 and 7");
		}
		
	}
}