package basic;

import java.util.Scanner;

public class ArrayCreation {
	public static void main(String[] args) {
		//int[] marks = new int[20];
		//This array is empty at time of the creation
		int marks[] = new int[10];
		Scanner s = new Scanner(System.in);
		
		for(int i=0;i<marks.length;i++) {
			System.out.print("Enter any number ");
			marks[i] = s.nextInt();
		}
		
		System.out.println(marks.length);
		
		for(int i=0;i<marks.length;i++) {
			System.out.println("marks[" + i + "] = " + marks[i]);
		}
		
		//To assign the values to the array at the time of the creation
		//I
		
		float[] temp = {56.78f, 68.34f, 56.90f};
		System.out.println(temp.length);
		
		//II
		String[] names = new String[] {"harry","ron","mike","scott","smith"};
		System.out.println(names.length);
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		System.out.println(names[4]);
		System.out.println(names[5]);
	}
}
