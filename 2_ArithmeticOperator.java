class ArithmeticOperator{
	public static void main(String[] args){

		//assigning the literal
		int a = 5;
		int b = 2;

		//assignin the result of the arithmetic operation
		int c = a + b;

		System.out.println(c);
		
		//int+int
		System.out.println(a+b);

		float d = 78.45f;
		float e = 74.34f;

		//float+float
		System.out.println(d+e);

		//int+float
		System.out.println(a+d);

		char c1 = 'a'; //97
		char c2 = 'b'; //98

		//char+char
		//char is implicitly converted into int (ASCII value)
		System.out.println(c1+c2);
		
		//char+int
		System.out.println(c1+2);

		boolean b1 = true;
		boolean b2 = true;

		//boolean+boolean
		//System.out.println(b1+b2);  //not allowed

		String s1 = "hello";
		String s2 = "world";

		//Concatenation
		//String + String
		System.out.println(s1+s2);

		//String + int
		//int is converted in the String
		System.out.println(s1+a);
		
		//String + float
		System.out.println(s1+d);

		//String + char
		System.out.println(s1+c1);

		//String + boolean
		System.out.println(s1+b1);

		//int-int
		System.out.println(a-b);

		//int-float
		System.out.println(d-a);

		//String-String
		//System.out.println(s1-s2);  //not allowed

		//int*int
		System.out.println(a*b);

		//int/int ==> int 
		System.out.println(a/b);
		
		//int/int ==> float
		//explicit type-casting (widening)
		float div = (float)a/b;
		System.out.println(div);

		//int%int
		System.out.println(a%b);
	}
}