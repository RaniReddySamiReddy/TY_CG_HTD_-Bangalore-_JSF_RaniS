package com.caps.jdbc;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UserLogin {
      public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
    	try {
    		//load the driver
			Driver driver=new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("Driver Loaded....");
			
			//get DB Connection via Driver
			String dbUrl = "jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
			System.out.println("Enter username and password");
			String dbUser=sc.nextLine();
			String dbPass=sc.next();
			
			con =DriverManager.getConnection(dbUrl,dbUser,dbPass);
			System.out.println("Connection Established...");
			
			//Issue SQL query via connection
			String query="SELECT * FROM users_info"+" where userid=105 AND password='sam'";
	    	stmt=con.createStatement();
	    	rs=stmt.executeQuery(query);
	    	System.out.println("Query issued and executed.....");
	    	
	    	//Process the results returned
	    	if(rs.next())
	    	{
	    		System.out.println("Userid:"+rs.getInt(1));
	    		System.out.println("Username:"+rs.getString(3));
	    		System.out.println("Email:"+rs.getString(2));
	    	}
		    } catch (SQLException e) {
			e.printStackTrace();
		} 
    	finally
    	{
    	 if(con!=null)
    	 
    		 try {
    			 con.close();
    		 }catch(SQLException e)
    		 {
    			 e.printStackTrace();
    		 }
    		 if(stmt!=null)
        	
        		 try {
        			 stmt.close();
        		 }catch(SQLException e)
        		 {
        			 e.printStackTrace();
        		 }
        		 if(rs!=null)
            	 
            		 try {
            			 rs.close();
            		 }catch(SQLException e)
            		 {
            			 e.printStackTrace();
            		 }
    	 
        	 }
    	 }
    	}
    	
    	
    	//Close All JDBC objects
    	  