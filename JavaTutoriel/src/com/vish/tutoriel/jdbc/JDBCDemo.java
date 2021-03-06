package com.vish.tutoriel.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("org.postgresql.Driver");
		
		Connection con = DriverManager.getConnection(
				"jdbc:postgresql://127.0.0.1:5432/Vish_tutorial", 
				"postgres", 
				"Vish@2016");
		
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery("SELECT * FROM employee");
		
		while(rs.next()){
			System.out.print(rs.getInt("id") + " \t| ");
			System.out.println(rs.getString("Name"));
		}
		
		con.close();
	}
}
