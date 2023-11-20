package fileio;

import java.io.FileWriter;

public class CharacterStreamWriting {

	public static void main(String[] args) {
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("D:\\Ongoing Lectures\\Java-Weekday-4-6\\CoreJavaExample\\src\\fileio\\newfile.txt");
			
			String str = "Write using character stream";
			
			fw.write(str);
			
			fw.close();
		}
		catch(Exception e) {
			
		}

	}

}
