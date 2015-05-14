package com.shinowit.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.shinowit.impl.UserImple;
import com.shinowit.model.UserInfo;
import com.shinowit.model.logininfo;

public class BasicDao implements UserImple{

	private String url = "jdbc:mysql://localhost:3306/ssh";
	
	private String user1 = "root";
	
	private String pass = "shinow";
	
	private Connection conn;
	
	private PreparedStatement pstmt;

	private ResultSet re;
	
	private Connection getConnection() throws SQLException {
		Connection conn;
		conn = DriverManager.getConnection(url, user1, pass);
		return conn;
	}
	
	private void close(ResultSet re,Connection conn,PreparedStatement pstmt){
		if(re!=null){
		try {
			re.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}try {
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}else{
		try {
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	}
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public boolean userinsert(UserInfo user) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet re = null;
		boolean result = false;
		try {
			conn = getConnection();
			String sql = "insert into userinfo(name,pass) values(?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getName());
			pstmt.setString(2, user.getPass());
			int a =pstmt.executeUpdate();
			if(a>0){
				result =true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			close(re,conn,pstmt);
		}
		return result;
	}

	

	@Override
	public List<UserInfo> userlist(UserInfo user) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet re = null;
		List<UserInfo> result = new ArrayList<UserInfo>();
		try {
			conn = getConnection();
			String sql = "select * from userinfo where name=? and pass=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getName());
			pstmt.setString(2, user.getPass());
			re = pstmt.executeQuery();
			while(re.next()){
				UserInfo user1 = new UserInfo();
				user1.setName(re.getString("name"));
				user1.setPass(re.getString("pass"));
				result.add(user1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			close(re,conn,pstmt);
		}
		return result;
	}

	@Override
	public boolean logininfoinsert(logininfo login) {
		// TODO Auto-generated method stub
		return false;
	}

}
