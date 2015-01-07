package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.SelectDao;
import entity.UserInfo;

public class JquerySelectServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		Integer usercode = Integer.valueOf(request.getParameter("usercode"));
		SelectDao selectdao = new SelectDao();
		List<UserInfo> userlist = selectdao.singleselect(usercode);
		String username = null;
		for(UserInfo userinfo : userlist){
			username = userinfo.getLoginName();
		}
		PrintWriter out = response.getWriter();
		out.print(username);
//		if(username!=null){
//			request.getSession().setAttribute("username", username);
//			request.getRequestDispatcher("./test.jsp").forward(request, response);
//		}
	}

}
