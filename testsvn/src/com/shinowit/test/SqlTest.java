package com.shinowit.test;

import java.io.IOException;
import java.io.Writer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import com.shinowit.model.TeacherModel;

public class SqlTest extends SimpleTagSupport{

	private String dreiver;
	
	private String url;
	
	private String user;
	
	private String pass;
	
	private String sql;
	
	private Connection conn;
	
	private PreparedStatement pstmt;
	
	private ResultSet rs;
	@Override
	public void doTag() throws JspException, IOException {
		TeacherModel tea =null;
		try {
			Class.forName(dreiver);
			try {
				conn = DriverManager.getConnection(url,user,pass);
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				Writer out = getJspContext().getOut();
				out.write("<table border='1 solid red' width=400>");
				out.write("<tr>");
				out.write("<th>编码</th>");
				out.write("<th>姓名</th>");
				out.write("</tr>");
				while(rs.next()){
					tea = new TeacherModel();
					tea.setTeacherId(rs.getInt("teacher_id"));
					tea.setTeacherName(rs.getString("name"));
						out.write("<tr>");
						out.write("<td style='color:red'>");
						out.write("-_-"+tea.getTeacherId());
						out.write("</td>");
						out.write("<td style='color:red'>");
						out.write(tea.getTeacherName());
						out.write("</td>");
						out.write("</tr>");
				}
				out.write("</table>");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally{
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}


	public String getDreiver() {
		return dreiver;
	}


	public void setDreiver(String dreiver) {
		this.dreiver = dreiver;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public String getSql() {
		return sql;
	}


	public void setSql(String sql) {
		this.sql = sql;
	}

	
	
}
