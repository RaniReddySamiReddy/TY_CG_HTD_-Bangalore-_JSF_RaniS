package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteUser {
       public static void main(String[] args) {
    	   Scanner sc=new Scanner(System.in);
    	   Connection con=null;
    	   PreparedStatement pstmt=null;
		//load the driver
    	try {
//			Driver driver=new com.mysql.jdbc.Driver();
//			DriverManager.deregisterDriver(driver);
    	Class.forName("com.mysql.jdbc.Driver");
      	System.out.println("Loaded and registered Driver.....");
		//get the DBconnection
		String dbUrl="jdbc:mysql://127.0.01:3306/ty_cg_nov6";
		System.out.println("enter dbuser and password");
		String user=sc.nextLine();
        String password=sc.nextLine();	
		con = DriverManager.getConnection(dbUrl, user, password);
		System.out.println("Connection Established.....");
		
		String query="DELETE from users_info where userid=? and password=?";
		pstmt=con.prepareStatement(query);
		System.out.println("Enter userid....");
		pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
		System.out.println("enter password....");
		pstmt.setString(2, sc.nextLine());
		int count = pstmt.executeUpdate();
		if(count>0)
		{
			System.out.println("user deleted");
		}
		else
		{
			System.err.println("something went wrong dude!!!!!!!");
		}
		
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
    	finally
    	{
    	 if(con!=null)
    	 
    		 try {
    			 con.close();
    		 }catch(Exception e)
    		 {
    			 e.printStackTrace();
    		 }
    		 if(pstmt!=null)
        	
        		 try {
        			 pstmt.close();
        		 }catch(SQLException e)
        		 {
        			 e.printStackTrace();
        		 }
        
    	 }
    	}
}
    	
    	//issue SQL query
    	//process the result returned
    	//close all the JDBC objects
    	
