package fileio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) {
		FileInputStream in = null;
		ObjectInputStream ois = null;
		
		try {
			in = new FileInputStream("D:\\Ongoing Lectures\\Java-Weekday-4-6\\CoreJavaExample\\src\\fileio\\object.txt");			
			
			ois = new ObjectInputStream(in);
			
			Student s = (Student)ois.readObject();
			
			System.out.println(s);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
