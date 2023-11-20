package sample;

import java.sql.Connection;
import java.sql.DriverManager;

public class ReadRecord {

	public static void main(String[] args) {		
		try {
			//1.Register the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2. Connect with Database
			String url = "jdbc:mysql://localhost:3306/cj_3_5";
			String username = "root";
			String password = "";
			Connection con = DriverManager.getConnection(url,username,password);
			
			System.out.println(con.getMetaData().getDatabaseProductName());
			
			//5. Close the connection with Database
			con.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
