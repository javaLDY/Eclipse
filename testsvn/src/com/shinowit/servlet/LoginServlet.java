package com.shinowit.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.jni.User;

import com.shinowit.dao.BasicDao;
import com.shinowit.model.UserInfo;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		
		UserInfo user = new UserInfo();
		user.setName(name);
		user.setPass(pass);
		
		BasicDao dao = new BasicDao();
		List<UserInfo> result  =dao.userlist(user);
		if(result.size()>0){
			HttpSession session = request.getSession();
			session.setAttribute("username", name);
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		}
	}

}
