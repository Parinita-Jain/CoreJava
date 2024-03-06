package practice;
import java.util.Scanner;

public class CheckVowels {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a character: ");
		
		//to read the char value using scanner class
		//use next().charAt(0)
		char c = s.next().charAt(0);
		
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
			System.out.println("Vowel");	
		else
			System.out.println("Consonent");
		
		switch(c) {
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U': System.out.println("It's a vowel");
						break;
			default: System.out.println("It's a consonent");
		}
	}
}
