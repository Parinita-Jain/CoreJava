package fileio;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Serialization {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Student stud = new Student();
		System.out.print("Enter ID: ");
		stud.setId(s.nextInt());
		System.out.print("Enter Name: ");
		stud.setName(s.next());
		System.out.print("Enter Marks: ");
		stud.setMarks(s.nextFloat());
		
		System.out.println(stud);
		
		FileOutputStream out = null;
		ObjectOutputStream oos = null;
		
		try {
			//Specifying the file in which the write operation is to be done
			out = new FileOutputStream("D:\\Ongoing Lectures\\Java-Weekday-4-6\\CoreJavaExample\\src\\fileio\\object.txt");
			
			//Specifying the file reference where the byte conversion of the object will be written
			oos = new ObjectOutputStream(out);
			
			//Actual conversion of the Student object into byte stream 
			oos.writeObject(stud);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
