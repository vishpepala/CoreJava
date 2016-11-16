package com.vish.tutoriel.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnection implements ConnProvider {

	@Override
	public Connection getConnection() {
		Connection conn = null;
		try {
			DriverManager.registerDriver(new org.postgresql.Driver());
			conn = DriverManager.getConnection("jdbc:oracle:thin://127.0.0.1:5432/Vish_tutorial", "postgres", "Vish@2016");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

}
