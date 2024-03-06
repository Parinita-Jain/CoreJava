package practice;

public class BitwiseOperators {

	public static void main(String[] args) {
		int a = 15;
		//float a = 8.5f;
		int b = 22;
		
		System.out.println("Bitwise AND = " + (a&b));
		System.out.println("Bitwise OR = " + (a|b));
		System.out.println("Bitwise Ex-OR = " + (a^b));
		System.out.println("Bitwise NOT = " + (~a));
		
		System.out.println("Bitwise Right Shift = " + (a>>2));
		System.out.println("Bitwise Left Shift = " + (a<<2));
	}

}
