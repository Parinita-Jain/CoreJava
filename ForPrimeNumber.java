package basic;

import java.util.Scanner;

/*Prime number is number that divisible by just 1 and itself*/

public class ForPrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		
		//assuming that all the numbers are prime number
		boolean flag = true;
		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				flag = false;
				break;
			}
		}
		
		if(flag)
			System.out.println(num + " is a prime number");
		else
			System.out.println(num + " is not a prime number");
		
	}

}
