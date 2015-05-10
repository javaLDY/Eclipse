<%@page import="org.apache.tomcat.util.http.Cookies"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	
	String name = request.getParameter("name");
	String pass = request.getParameter("pass");
	if(!pass.equals("admin")){
		Cookie cookie = new Cookie(pass,new Date().toString());
		response.addCookie(cookie);
		cookie.setMaxAge(24 * 3600);
		out.println(name+"测试密码"+pass+"日期是");
	}

	Cookie[] cookie = request.getCookies();
	
	if(cookie.length>5){
		out.println(cookie.length);
		out.println("你一测试5次不成功，被拉入黑名单");
	}
	
%>
</body>
</html>