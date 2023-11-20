package fileio;

import java.io.FileInputStream;

public class ByteStreamReading {
	public static void main(String[] args) {
		FileInputStream in = null;
		
		try {
			in = new FileInputStream("D:\\Ongoing Lectures\\Java-Weekday-4-6\\CoreJavaExample\\src\\fileio\\test.txt");
			
			//available() return int value indicating the number of bytes remaining to be read
			System.out.println(in.available());
			
			//int val = in.read();
			//System.out.println((char)val);
			
			//while(val != -1) {
			//	System.out.println((char)val);
			//	val = in.read();
			//}
			
			byte[] readInto = new byte[50];
			int charRead = in.read(readInto);
			
			System.out.println(charRead);
			
			for(byte b: readInto) {
				System.out.println((char)b);
			}
			
			in.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
