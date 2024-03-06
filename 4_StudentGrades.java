package practice;
/*Write a program to give the grades to the student:
 * Range	Grade	Conditions
 * 100-75	A		marks<=100 && marks>=75
 * 75-60	B
 * 60-45	C
 * 45-35	D
 * 35-0		Fail
 */
import java.util.Scanner;
public class StudentGrades {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter your marks ");
		float marks = s.nextFloat();
		
		if(marks<=100 && marks>=75)
			System.out.println("Grade A");
		else if(marks<75 && marks>=60)
			System.out.println("Grade B");
		else if(marks<60 && marks>=45)
			System.out.println("Grade C");
		else if(marks<45 && marks>=35)
			System.out.println("Grade D");
		else if(marks<35 && marks>=0)
			System.out.println("Failed");
		else
			System.out.println("Marks entered are invalid");
	}
}
