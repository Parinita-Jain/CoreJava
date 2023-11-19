package exceptions;

class Student{
	
}

public class MultipleCatch {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		try {
			int[] arr = {5,6,4,3,7};
			
			//System.out.println(arr[5]);
			
			Object o = new Student(); //upcasting
			Object o1 = new Object();
			
			Student s = (Student)o1; //downcasting
			
			String name = null;
			
			System.out.println(name.toUpperCase());
			
			System.out.println("Quotient = " + (a/b));
			
			
		}		
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		catch(NullPointerException e) {
			System.out.println("String value is null");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
