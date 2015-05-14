package com.shinowit.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shinowit.dao.BasicDao;
import com.shinowit.model.UserInfo;

/**
 * Servlet implementation class RegServlet
 */
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		
		UserInfo user = new UserInfo();
		user.setName(name);
		user.setPass(pass);
		
		BasicDao dao = new BasicDao();
		boolean result = dao.userinsert(user);
		
		if(result==true){
			System.out.println("注册成功");
		}
	}

}
