package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsKeyword {
	
	public static void openFile(String fileName) 
			throws FileNotFoundException{
		FileInputStream in = new FileInputStream(fileName);
	}

	public static void main(String[] args) {
		//caller
		try {
			openFile("d://img.xlsx");
		}
		catch(Exception e) {}
	}
}
