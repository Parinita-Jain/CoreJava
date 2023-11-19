package exceptions;

import java.io.FileInputStream;

public class CheckedExceptions {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		
		//System.out.println("Quotient = " + (a/b));
		try {
			FileInputStream in = new FileInputStream("d://img.xlsx");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
