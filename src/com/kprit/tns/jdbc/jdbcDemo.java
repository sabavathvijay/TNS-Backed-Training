package com.kprit.tns.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Declare Variables
		
		// 1. url 
		String url = "jdbc:postgresql://localhost:5432/kprit";
		
		// 2. user name
		String un = "postgres";
		
		//3. password
		String pwd = "root";
		//=====================  Table name is " stud " ===============
		
		// Steps to Configure
		
	// Step1 = Load Driver
		// Throw Exception
		Class.forName("org.postgresql.Driver");
	
	// step2 = Connection
		// Import and Throw Exception
		Connection con = DriverManager.getConnection(url,un,pwd);
		
	// Step3 =Create Statements / Query
		
		//i) Statement  reference as variable
		
		Statement stmt = con.createStatement();
		
		// ii) Query
		String query ="select * from Stud";
		
	//Step4 = Execute The Query
		//Executing Query and  Initializing the ResultSet with Reference
		//Import
		ResultSet rs=stmt.executeQuery(query);
		
	// Step5  = Retrieve the Data 
		//Iteration with while loop using pointer 
		 // next() is as pointer to Check data in the Table
		  // Retrieving from ResultSet Reference rs 
		while(rs.next()) {
			// Capturing the data 
				
			
			// id is integer so , store in " int " variable
					//get store  data Using  getter method  
			
			      int sId = rs.getInt(1);
			      
			  // name is String so, capture in String 
			    //get  store data Using  getter method  
			      String sName = rs.getString(2);
			      
			      System.out.println("Id "+" Name ");
			      System.out.println(sId +" "+" "+ sName);
			      
			      System.out.println("\n ");
			      
			// Note : 1 is first column  and 2 is second column in Table
			
		}
		
		
		// ======  Pending All Other Operations  =====
		

	}

}
