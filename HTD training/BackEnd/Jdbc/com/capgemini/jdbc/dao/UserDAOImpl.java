
package com.capgemini.jdbc.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.capgemini.jdbc.bean.UserBean;

public class UserDAOImpl implements UserDAO{
    FileReader reader;
    Properties prop;
    UserBean user;
	public UserDAOImpl()
	{
		try {
			
			reader = new FileReader("db.properties");
			prop = new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driverClass"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public List<UserBean> getAllUsers() {
		List<UserBean> list = new ArrayList<UserBean>();
		
		try(Connection con = DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				Statement stmt = con.createStatement();
				ResultSet rs= stmt.executeQuery(prop.getProperty("query1")))
		{
		while(rs.next()){
			user = new UserBean();
			user.setUserid(rs.getInt(1));
			user.setUsername(rs.getString(2));
			user.setEmail(rs.getString(3));
			list.add(user);
		}
		return list;
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	
	@Override
	public UserBean userLogin(String username, String password) {
		UserBean user=null;
		try(Connection con = DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt = 
				con.prepareStatement(prop.getProperty("selectQuery"))){ 
					pstmt.setString(1, username);
					pstmt.setString(2, password);
					ResultSet result = pstmt.executeQuery();
					while (result.next()) {
						user=new UserBean();
						user.setUserid(result.getInt("userid"));
						user.setUsername(result.getString("username"));
						user.setPassword(result.getString("password"));
						user.setEmail(result.getString("email"));
					}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public boolean updateUser(int userid, String password, String email) {
		try(Connection con = DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt = 
				con.prepareStatement(prop.getProperty("updateQuery"))){ 
					pstmt.setString(1, password);
					pstmt.setString(2, email);
					pstmt.setInt(3,userid);
					int count = pstmt.executeUpdate();
					if(count>0) {
						return true;
					}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteUser(int userid, String password) {
		try(Connection con = DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt = 
				con.prepareStatement(prop.getProperty("deleteQuery"))){ 
					pstmt.setInt(1,userid);
					pstmt.setString(2, password);
					int count = pstmt.executeUpdate();
					if(count>0) {
						return true;
					}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	@Override
	public boolean insertUser(UserBean user) {
		try(Connection con = DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt = 
				con.prepareStatement(prop.getProperty("insertQuery"))){
		pstmt.setInt(1, user.getUserid());
	    pstmt.setString(2, user.getUsername());
		pstmt.setString(3, user.getPassword());
		pstmt.setString(4, user.getEmail());
		
		int count = pstmt.executeUpdate();
		if(count>0) {
		return true;
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	}

  
