package com.caps.jdbc;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Properties;
import java.sql.Statement;

public class EvolvedJDBCv2 {
     public static void main(String[] args) {
    	 FileReader reader = null;
    	 Properties prop = null;
		 try {
			reader = new FileReader("db.properties");
			prop = new Properties();
			prop.load(reader);
			
			Class.forName(prop.getProperty("driverClass"));
			System.out.println("Driver loaded......");
		    } catch (Exception e) {
			e.printStackTrace();
		}
		try(Connection con = DriverManager.getConnection(prop.getProperty("dbUrl"),
		   prop.getProperty("dbUser"),
		   prop.getProperty("dbPassword"));
		   Statement stmt = con.createStatement();
		   ResultSet rs=stmt.executeQuery(prop.getProperty("query1")))
		{
			while(rs.next())
			{
				System.out.println("user id: "+rs.getInt(1));
				System.out.println("user name: "+rs.getString(2));
				System.out.println("--------------------");
			}
		}catch (Exception e) {
			e.printStackTrace();
		
	}
}
}

