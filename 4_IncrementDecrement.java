package practice;

public class IncrementDecrement {

	public static void main(String[] args) {
		int a = 10;
		System.out.println("a = " + a);
		
		//int a1=++a;
		int a1=a++;
		System.out.println("a1 = " + a1);
		System.out.println("a = " + a);
		
		int b = 20;
		System.out.println("b = " + b);
		
		//int b1=--b;
		int b1=b--;
		System.out.println("b1 = " + b1);
		System.out.println("b = " + b);
		
		a=5;
		b=a++-++a;
		System.out.println(b);
	}
}
