import java.util.Scanner;

class IfElseStatement{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);

		System.out.print("Enter any number ");
		int num =  s.nextInt();		

		if(num>0)
			System.out.println("Number entered is positive");		
		else
			System.out.println("Number entered is negative");

		//execution is not based on condition
		System.out.println("After If");
	}
}