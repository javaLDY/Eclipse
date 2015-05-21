<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="insertfun" uri="http://www.liu.insertfunction" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/insertfunction.jsp" method="post">
		测试<input name="test" type="text" value="${param.name}"/>
		<input type="submit" value="提交"/>
	</form>
	<table border="1" bgcolor="aaaaadd">
		<tr>
			<td><p>表达式</p></td>
			<td><p>表达式结果</p></td>
		</tr>
		<tr>
			<td>"param.test"</td>
			<td>${param.test}</td>
		</tr>
		<tr>
			<td>"/${insertfun:reverse(param.test) }"</td>
			<td>${insertfun:reverse(param.test) }</td>
		</tr>
		<tr>
			<td>"/${insertfun:length(param.test)}"</td>
			<td>${insertfun:length(param.test)}</td>
		</tr>
	</table>
</body>
</html>