package com.caps.jdbc;

	import java.sql.Connection;
	import java.sql.Driver;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;
	import java.util.Scanner;

	public class InsertUser {
	       public static void main(String[] args) {
	    	   Scanner sc=new Scanner(System.in);
	    	   Connection con=null;
	    	   PreparedStatement pstmt=null;
			//load the driver
	    	try {
				Driver driver=new com.mysql.jdbc.Driver();
				DriverManager.deregisterDriver(driver);
				System.out.println("Loaded and registered Driver.....");
			//get the DBconnection
			String dbUrl="jdbc:mysql://127.0.01:3306/ty_cg_nov6";
			System.out.println("enter dbuser and password");
			String user=sc.nextLine();
	        String password=sc.nextLine();	
			con = DriverManager.getConnection(dbUrl, user, password);
			System.out.println("Connection Established.....");
			
			String query="INSERT into users_info values(?,?,?,?)";
			pstmt=con.prepareStatement(query);
			System.out.println("Enter userid....");
			pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
			System.out.println("enter username....");
			pstmt.setString(2, sc.nextLine());
			System.out.println("enter password....");
			pstmt.setString(3, sc.nextLine());
			System.out.println("enter email....");
			pstmt.setString(4, sc.nextLine());
			int count=pstmt.executeUpdate();
			System.out.println("Data inserted......");
			} catch (SQLException e) {
				e.printStackTrace();
			}
	    	finally
	    	{
	    		try
	    		{
	    			if(con!=null)
	    			{
	    				con.close();
	    			}
	    		}catch(SQLException e) {
	    			e.printStackTrace();
	    	}try {
	    		if(pstmt!=null) {
	    			pstmt.close();
	    		}
	    	}catch(SQLException e) {
	    		e.printStackTrace();
	    	}
	    		
	    	}
	    	
	        }
	    	
	    	 }
	       
	    	
	    	//issue SQL query
	    	//process the result returned
	    	//close all the JDBC objects
	    	

