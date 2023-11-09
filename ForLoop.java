package basic;

import java.util.Scanner;

public class ForLoop {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the limit for the loop ");
		int limit = s.nextInt();
		//for(int i=1; i<=5; i++) {
		for(int i=1; i<=limit; i++){
			System.out.println("Welcome to Java " + i);
		}
		
		//for(int a=1; a<=10; a+=2) {
		for(int a=1; a<=limit; a+=2) {
			System.out.println(a);
		}
		
		//for(int n=10; n>=1; n--) {
		for(int n=limit; n>=1; n--) {
			System.out.println(n);
		}
	}

}
