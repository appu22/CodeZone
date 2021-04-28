package com.xworkz.amazonapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AmazonApplication {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		//https://google.com
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazon", "root", "root");
		//abstraction---
		
		Statement createStatement = connection.createStatement();
		if(createStatement != null) {
			String query = "insert into amazon_product values(5,'TOY',150.0,'BLUE')";
			
			int executeUpdate = createStatement.executeUpdate(query);
			
			System.out.println("Inserted....." +executeUpdate);
		}else {
			System.out.println("please insert correct details..");
		}
		
		
	}

}
