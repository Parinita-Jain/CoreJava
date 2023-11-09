package basic;

public class BitwiseOperators {
	public static void main(String[] args) {
		int a = 29;
		int b = 11;
		
		int c = -8;
		
		System.out.println("Bitwise AND (&) = " + (a&b));
		System.out.println("Bitwise OR (|) = " + (a|b));
		System.out.println("Bitwise XOR (^) = " + (a^b));
		
		System.out.println("Bitwise NOT (~) = " + (~a));
		System.out.println("Bitwise NOT (~) = " + (~c));
		
		System.out.println("Right Shift Operator (>>) = " + (a>>2));
		a=29;
		System.out.println("Left Shift Operator (<<) = " + (a<<2));
	}
}
