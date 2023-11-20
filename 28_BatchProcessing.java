package sample;

import java.sql.Connection;
import java.sql.Statement;

import com.itvedent.student.DBConnect;

public class BatchProcessing {
	public static void main(String[] args) {
		Connection con = DBConnect.getConnection();
		
		try {
			Statement stat = con.createStatement();
			
			con.setAutoCommit(false);
			
			stat.addBatch("insert into student(name,age,marks) values('tim',16,67.45)");
			stat.addBatch("delete from student where id=7");
			stat.addBatch("update student set name='kelly' where id=2");
			
			stat.executeBatch();
			
			con.commit();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		DBConnect.closeConnection();
	}
}
