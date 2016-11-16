package com.vish.tutoriel.factory;

public class FactoryConsumer {

	public static void main(String[] args) {
		ConnProvider newConn = DBConnectionFactory.getInstance("en_CA");
		
		System.out.println(newConn.getConnection());
	}
}
