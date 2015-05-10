package com.shinowit.test;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name="TestServlet",urlPatterns="/TestServlet")
public class TestServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		response.setCharacterEncoding("uft-8");
		String name = request.getParameter("name");
		PrintStream out = new PrintStream(response.getOutputStream());
		if(name.equals("admin")){
			out.print("测试成功");
		}else{
			out.print("测试失败");
		}
	}

}
