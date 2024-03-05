import java.util.Scanner;

class IfStatement{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);

		System.out.print("Enter any number ");
		int num =  s.nextInt();

		/*if(num>0){
			System.out.println("Number entered is positive");
			System.out.println("Inside if block");
		}*/

		if(num>0)
			System.out.println("Number entered is positive");		

		//execution is not based on condition
		System.out.println("After If");
	}
}