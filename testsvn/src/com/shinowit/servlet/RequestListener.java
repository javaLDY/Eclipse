package com.shinowit.servlet;

import java.util.List;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.shinowit.dao.BasicDao;
import com.shinowit.model.logininfo;

@WebListener
public class RequestListener implements ServletRequestListener{

	@Override
	public void requestDestroyed(ServletRequestEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void requestInitialized(ServletRequestEvent arg0) {
		HttpServletRequest request = (HttpServletRequest)arg0.getServletRequest();
		HttpSession session = request.getSession();
		String name = (String) session.getAttribute("username");
		String ip = request.getRemoteAddr();//用户的ip地址
		String page = request.getRequestURI();//用户访问的地址
		String sessionid = session.getId();
		
		logininfo login = new logininfo();
		login.setId(sessionid);
		login.setIp(ip);
		login.setPage(page);
		login.setUsername(name);
		BasicDao dao = new BasicDao();
		List<logininfo> result = dao.loginlist(sessionid);
		
			dao.logininfoinsert(login);
		
	}

}
