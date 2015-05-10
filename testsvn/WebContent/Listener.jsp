<%@page import="com.shinowit.model.TeacherModel"%>
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
		TeacherModel tea = (TeacherModel)session.getAttribute("tea");
	%>
	老师编码:<%=tea.getTeacherId() %>
	老师姓名:<%=tea.getTeacherName() %>
</body>
</html>