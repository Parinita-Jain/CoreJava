package exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class FinallyKeyword {
	public static void main(String[] args) {
		FileInputStream in = null;
		try {
			in = new FileInputStream("d://mg.xlsx");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("finally block");
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
