package fileio;

import java.io.FileReader;
import java.io.IOException;

public class CharacterStreamReading {

	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		
		try {
			fr = new FileReader("D:\\Ongoing Lectures\\Java-Weekday-4-6\\CoreJavaExample\\src\\fileio\\test.txt");
			
			//int val = fr.read();
			//System.out.println((char)val);
			
			//while(val != -1) {
			//	System.out.println((char)val);
			//	val = fr.read();
			//}
			
			char[] readInto = new char[50];
			
			int charRead = fr.read(readInto);
			
			System.out.println(charRead);
			
			for(char c : readInto) {
				System.out.println(c);
			}
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			fr.close();
		}
	}
}
