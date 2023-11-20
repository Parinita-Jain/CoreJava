package sample;

import java.sql.CallableStatement;
import java.sql.Connection;

import com.itvedent.student.DBConnect;

public class CallableProcedure {
	public static void main(String[] args) {
		Connection con = DBConnect.getConnection();
		
		try {
			CallableStatement cs = con.prepareCall("{call insertproc(?,?,?)}");
			cs.setString(1, "ginny");
			cs.setInt(2, 16);
			cs.setDouble(3, 67.35);
			
			cs.execute();
			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		DBConnect.closeConnection();
	}
}
