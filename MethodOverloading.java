package oopsbasic;

public class MethodOverloading {
	
	void add(int a, int b) {
		System.out.println("int + int = " + (a+b));
	}
	
	void add(int a, int b, int c) {
		System.out.println("int + int + int = " + (a+b+c));
	}
	
	void add(int x,float y) {
		System.out.println("int + float = " + (x+y));
	}
	
	void add(float a,int b) {
		System.out.println("float + int = " + (a+b));
	}
	
	void add(float a, float b) {
		System.out.println("float + float = " + (a+b));
	}
	
	void add(char a,char b) {
		System.out.println("char + char = " + (a+b));
	}	
	

	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
		m.add(8, 9);
		
		m.add(7.5f, 8.5f);
		
		m.add('e', 'o');
		
		m.add(6, 56.5f);
		
		m.add(45.34f, 2);
		
		m.add(4, 34,45);	
		
		System.out.println();
	}

}
