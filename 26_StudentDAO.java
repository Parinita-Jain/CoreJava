package com.itvedent.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
	static Connection con = DBConnect.getConnection();
	
	public List<Student> getRecords(){
		List<Student> students = new ArrayList<Student>();
		String query = "select * from student";
	
		try {
			Statement stat = con.createStatement();
			ResultSet rs = stat.executeQuery(query);
			
			while(rs.next()) {
				Student s = new Student();
				s.setId(rs.getInt("id"));
				s.setName(rs.getString("name"));
				s.setAge(rs.getInt("age"));
				s.setMarks(rs.getDouble("marks"));
				students.add(s);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}		
		return students;
	}
	
	public boolean insertRecord(String name, int age, double marks) {
		String query = "insert into student(name,age,marks) values(?,?,?)";
		
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, name);
			ps.setInt(2, age);
			ps.setDouble(3, marks);
			
			//Here the query will return int value indicating the number of rows inserted
			int i = ps.executeUpdate();
			
			if(i>0)
				return true;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}
}
