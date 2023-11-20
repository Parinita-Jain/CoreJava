package fileio;

import java.io.FileOutputStream;

public class ByteStreamWriting {
	public static void main(String[] args) {
		FileOutputStream out = null;
		
		try {
			//If the file is already existing, write operation will be
			//performed on that file
			//but if the file does not exist, then a new file will 
			//be created and then write operation will be performed
			
			
			//By default, write operation on the file will truncate the old data
			//in file and just write the recent data.
			
			//But if we want to retain the old data and after add the new data
			//we can set the value of the append parameter of FileOutputStream 
			//constructor to true.
			
			//out = new FileOutputStream();
			
			out = new FileOutputStream("D:\\Ongoing Lectures\\Java-Weekday-4-6\\CoreJavaExample\\src\\fileio\\new.txt", true);
			
			//String str = "This is new file";
			String str = "\nWriting again";
			
			//Since we don't have any write method for String value,
			//we will convert the String data into byte[].
			
			byte[] data = str.getBytes();
			
			out.write(data);
			
			out.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
