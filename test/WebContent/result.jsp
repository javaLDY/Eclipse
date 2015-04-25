<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div width="200px" height="200px" style="border: 1px red solid">
登录名:<%=request.getParameter("loginname") %>
登录密码:<%=request.getParameter("loginpass") %>
性别:<%=request.getParameter("sex") %>
最喜欢的颜色:<%=request.getParameter("color") %>
国籍:<%=request.getParameter("country") %>
</div>
</body>
</html>