<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="<%=request.getContextPath() %>/RegServlet" method="post">
		姓名：<input name="name" type="text"/></br></br></br>
		密码：<input name="pass" type="text"/></br></br></br>
		<input value="提交" type="submit"/></br></br></br>	
	</form>
</body>
</html>