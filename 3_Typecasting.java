class Typecasting{
	public static void main(String[] args){
		//implicit typecasting
		//short s = 10;
		//int a = s;

		//not allowed by default by the compiler
		//int a = 10;
		//short s = a;

		//explicit typecasting
		int a = 1098884598;
		short s = (short)a;

		float f = 67.89f;
		int b = (int)f;

		System.out.println(s);
		System.out.println(b);
	}
}