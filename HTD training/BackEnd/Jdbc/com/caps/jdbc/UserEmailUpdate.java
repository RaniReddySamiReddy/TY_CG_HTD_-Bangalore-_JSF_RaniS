package com.caps.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UserEmailUpdate {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		Connection con = null;
		PreparedStatement pstmt = null;
    	try {
    		//Load the Driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver load and registered");
			
			//Get DB connection
			String dbUrl="jdbc:mysql://localhost:3306/ty_cg_nov6";
			System.out.println("Enter DB user and Password");
			String user = sc.nextLine();
			String password = sc.nextLine();
			con = DriverManager.getConnection(dbUrl,user,password);
			System.out.println("Connection established.....");
			
			//Issue SQL queries via connection
			String query = "update users_info set email=? "
					+ "where userid=? and password=?";
			pstmt = con.prepareStatement(query);
			System.out.println("Enter Userid");
			pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
			System.out.println("Enter new Email");
			pstmt.setString(3, sc.nextLine());
			System.out.println("Enter Password to update");
			pstmt.setString(2, sc.nextLine());
			int count = pstmt.executeUpdate();
			
			//Process the result returned
			if(count>0)
			{
				System.out.println("user Updated");
			}
			else
			{
				System.err.println("something went wrong dude!!!!!!!");
			}
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    	//close all the jdbc objects
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
//Connection extends wrapper , autoclosable---->Interface
//Preparedstatement extends wrapper , autoclosable
//Statement extends wrapper , autoclosable
//ResultSet extends wrapper , autoclosable
//without writing any code we can close the resources by using try(){} 
    	
    	
