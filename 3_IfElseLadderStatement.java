import java.util.Scanner;

class IfElseLadderStatement{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);

		System.out.print("Enter any number ");
		int num =  s.nextInt();		

		if(num>0)
			System.out.println("Number entered is positive");		
		else if(num==0)
			System.out.println("Number entered is zero");
		else
			System.out.println("Number entered is negative");

	}
}