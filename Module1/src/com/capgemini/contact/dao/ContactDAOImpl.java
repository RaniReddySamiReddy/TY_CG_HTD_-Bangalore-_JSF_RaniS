package com.capgemini.contact.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.capgemini.contact.bean.ContactBean;

public class ContactDAOImpl implements ContactDAO {

	public List<String> getAllContactNames(){

		String dburl = "jdbc:mysql://localhost:3306/contactfile?user=root&password=root";
		String query = "select NAME from contact";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			conn = DriverManager.getConnection(dburl);

			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);

			ArrayList<String> result = new ArrayList<String>();

			while(rs.next()) {
				String name = rs.getString("name");
				result.add(name);

			}
			return result;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(stmt!=null) {
					stmt.close();
				}
				if(rs!=null) {
					rs.close();
				}

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}


	public ContactBean searchForContact(String name) {
		String dburl = "jdbc:mysql://localhost:3306/contactfile?user=root&password=root";
		String query = "select * from contact where NAME=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(dburl);
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();

			if(rs.next()) {
				ContactBean bean = new ContactBean();

				bean.setName(rs.getString("name"));
				bean.setNumber(rs.getInt("number"));
				bean.setGroups(rs.getString("groups"));
				return bean;

			}else {
				return null;
			}

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
				if(rs!=null) {
					rs.close();
				}

			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}
	}

	@Override
	public boolean addContact(String name) {
		String dburl = "jdbc:mysql://localhost:3306/contactfile?user=root&password=root";
		String query = "insert into contact where NAME=? number=? groups=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(dburl);
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();

			if(rs.next()) {
				ContactBean bean = new ContactBean();

				bean.setName(rs.getString("name"));
				bean.setNumber(rs.getInt("number"));
				bean.setGroups(rs.getString("groups"));
				return bean;

			}else {
				return false;
			}

		} catch (Exception e) {
			e.printStackTrace();
			return null != null;
		}finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
				if(rs!=null) {
					rs.close();
				}

			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}
	}
}