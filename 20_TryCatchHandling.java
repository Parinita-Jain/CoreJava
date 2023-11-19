package exceptions;

public class TryCatchHandling {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		
		try {
			System.out.println("Quotient = " + (a/b));
		}
		catch(ArithmeticException e) {
			System.out.println("Some Error");
		}
		
		System.out.println("After Division");
	}
}
