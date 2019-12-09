package com.caps.jdbc;
	import java.sql.Connection;
	import java.sql.Driver;
	import java.sql.DriverManager;
    import java.sql.PreparedStatement;
    import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.Scanner;

public class UserLoginDynamically {
	      public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
			Connection con=null;
			PreparedStatement pstmt=null;
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
				String dbPass=sc.nextLine();
				
				con =DriverManager.getConnection(dbUrl,dbUser,dbPass);
				System.out.println("Connection Established...");
				
				//Issue SQL query via connection
				String query="SELECT * FROM users_info where userid=? AND password=?";
		    	pstmt=con.prepareStatement(query);
		    	System.out.println("enter userid");
		    	pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
		    	System.out.println("enter password");
		    	pstmt.setString(2,sc.nextLine());
		    	
		    	rs=pstmt.executeQuery();
		    	System.out.println("Query issued and executed.....");
		    	System.out.println("#################################");
		    	//Process the results returned
		    	if(rs.next())
		    	{
		    		System.out.println("Userid:"+rs.getInt(1));
		    		System.out.println("Username:"+rs.getString(3));
		    		System.out.println("Email:"+rs.getString(2));
		    	}
		    	else {
		    		System.err.println("Something went wrong dude!!!!");
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
	    		 if(pstmt!=null)
	    		 {
	        		 try {
	        			 pstmt.close();
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
}
	      //Close All JDBC objects
