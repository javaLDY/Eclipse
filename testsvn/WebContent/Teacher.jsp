<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.tag.org/mytag" prefix="tea"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<tea:teacher user="root" url="jdbc:mysql://localhost:3306/ssh" pass="shinow" sql="select * from teacher" dreiver="com.mysql.jdbc.Driver"/>
	<table>
		<tr>
			<td>编号</td>
			<td>姓名</td>
		</tr>
	</table>
</body>
</html>