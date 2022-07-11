package com.varxyz.jv300.mod010;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AddUserDao {
	private static AddUserDao instance = new AddUserDao();

	NameingService nameingService = NameingService.getInstance();
	DataSource datasource = (DataSource) nameingService.getAttribute("dataSource");
	User user = new User();
	
	public static AddUserDao getInstance() {	
		return instance;
	}

	public void insertUser(User user) {
		String sql = "INSERT INTO Signup (name, ssn, phone, userId, passwd)" + "VALUES(?, ?, ?, ?, ?)";
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			try {
				con = datasource.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, user.getUserName());
				pstmt.setString(2, user.getSsn());
				pstmt.setString(3, user.getPhone());
				pstmt.setString(4, user.getUserId());
				pstmt.setString(5, user.getPasswd());
				pstmt.executeUpdate();

			} finally {
				datasource.close(pstmt, con);
			}

			System.out.println("NEW User in");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean login(String userId, String passwd) {
		String sql = "SELECT userId, passwd FROM Signup WHERE userId = ?";
		boolean result = false;
		try {
			Connection con = null;
			PreparedStatement pstmt = null;;
			ResultSet rs = null;;
			try {
				con = datasource.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, userId);
				rs = pstmt.executeQuery();
				User user = new User();
				while(rs.next()) {
					user.setUserId(rs.getString("userId"));
					user.setPasswd(rs.getString("passwd"));
					if(userId.equals(user.getUserId()) && passwd.equals(user.getPasswd())) {
						result = true;
					}
					else {
						result = false;
					}
				}
				

			} finally {
				datasource.close(rs, pstmt, con);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}
	   public boolean isValidUser(String userId, String passwd) {
	       String sql = "SELECT userId, passwd FROM Signup WHERE userId = ?";
	       boolean result = false;
	        try {
	           Connection con = null;
	           PreparedStatement  pstmt = null;
	           ResultSet rs = null;
	           try {
	              con = datasource.getConnection();
	              pstmt = con.prepareStatement(sql);
	              pstmt.setString(1,  userId);
	              rs = pstmt.executeQuery();
	              
	              
	              while(rs.next()) {
	            	  user.setUserId(rs.getString("userId"));
	            	  user.setPasswd(rs.getString("passwd"));
	              }
	              if(userId.equals(user.getUserId()) && passwd.equals(user.getPasswd())) {
	            	  result =  true;
	              }else {
	            	  result =  false;
	              }
	           } finally{
	              datasource.close(rs, pstmt,con);
	           }
	        } catch (Exception e) {
	           e.printStackTrace();
	        }
	      return result;
	   }
	   
	   public void userupdate(String userId, String passwd) {
		   String sql = "Update Signup set userId = ? , passwd = ? WHERE passwd = ?";
		   boolean result = false;
		   try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con = datasource.getConnection();
				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					user.setUserId(userId);
					user.setPasswd(passwd);
				}
				 if(userId.equals(user.getUserId()) && passwd.equals(user.getPasswd())) {
	            	  result =  true;
	              }else {
	            	  result =  false;
	              }
	           } finally{
	              datasource.close(rs, pstmt,con);
	           }
	        } catch (Exception e) {
	           e.printStackTrace();
	        }
	   }
}
