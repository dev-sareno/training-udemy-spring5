package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {

		String jdbcUrl = "jdbc:mysql://localhost:3306/spring5?=useSSL=false&serverTimezone=UTC";
		String user = "spring5";
		String password = "spring5";
		
		try {
			
			System.out.println("Connecting ...");
			
			Connection conn = DriverManager.getConnection(jdbcUrl, user, password);
			
			System.out.println("Connected");
			
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
