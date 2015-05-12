package com.shinowit.test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.shinowit.model.TeacherModel;

public class TestListener implements ServletContextListener{

	private String driver = "com.mysql.jdbc.Driver";
	
	private String url = "jdbc:mysql://localhost:3306/ssh";
	
	private String user = "root";
	
	private String pass = "shinow";
	
	private Connection conn;
	
	private PreparedStatement pstmt;
	
	private ResultSet re;
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,user,pass);
			String sql = "select * from teacher ";
			pstmt = conn.prepareStatement(sql);
			re = pstmt.executeQuery();
			
			while(re.next()){
				TeacherModel tea = new TeacherModel();
				tea.setTeacherId(re.getInt("teacher_id"));
				tea.setTeacherName(re.getString("name"));
				System.out.println("教师编码:"+tea.getTeacherId()+"教师名字:"+tea.getTeacherName());
				
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
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
		}
	}

}
