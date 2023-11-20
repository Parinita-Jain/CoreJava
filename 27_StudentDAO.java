package com.itvedent.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.x.protobuf.MysqlxPrepare.Prepare;

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
		//? is like a placeholder
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
	
	public boolean deleteRecord(int id) {
		String query = "delete from student where id = ?";
		
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, id);
			
			int i = ps.executeUpdate();
			
			if(i>0)
				return true;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}
	
	public Student searchRecord(String name) {
		Student s = null;
		String query = "select * from student where name = ?";
		
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, name);
			
			ResultSet rs = ps.executeQuery();			
			if(rs.next()) {
				s = new Student();
				s.setId(rs.getInt("id"));
				s.setName(rs.getString("name"));
				s.setAge(rs.getInt("age"));
				s.setMarks(rs.getDouble("marks"));
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}		
		return s;
	}
	
	public boolean updateRecord(Student s) {
		String query = "update student set name=?, age=?, marks=? where id=?";
		
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, s.getName());
			ps.setInt(2, s.getAge());
			ps.setDouble(3, s.getMarks());
			ps.setInt(4, s.getId());
			
			int i = ps.executeUpdate();
			
			if(i>0)
				return true;
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}
}
