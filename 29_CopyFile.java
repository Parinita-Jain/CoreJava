package fileio;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile {

	public static void main(String[] args) {
		FileInputStream in = null;
		FileOutputStream out = null;
		
		String filePath = "D:\\Ongoing Lectures\\Java-Weekday-4-6\\CoreJavaExample\\src\\fileio\\";
			
		try {
			in = new FileInputStream(filePath+"image.jpg");
			out = new FileOutputStream(filePath+"copyimage.jpg");
			
			//int data = in.read();
			
			//while(data != -1) {
			//	out.write(data);
			//	data = in.read();
			//}
			
			byte[] readImage = new byte[in.available()];
			
			in.read(readImage);
			
			out.write(readImage);
			
			in.close();
			out.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
