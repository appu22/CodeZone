package com.codezone.person;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PersonApplication {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/connection", "root", "root");

		Statement createStatement = connect.createStatement();

		String sqlQuery = "INSERT INTO person VALUES (3,'xyzz','abc')";

		int insertedData = createStatement.executeUpdate(sqlQuery);

		System.out.println("Person Values Inserted  Database : " + insertedData);

	}

}
