<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="result.jsp" method="post">
		姓名:<input name="loginname" type="text"/></br>
		密码:<input name="loginpass" type="text"/></br>
		性别:<input name="sex" type="radio" value="男"/><input name="sex" type="radio" value="女"/></br>
		最喜欢的颜色:<input type="checkbox" name="color" value="红"/><input type="checkbox" name="color" value="黄"/></br>
		国籍:
		<select name="country">
			<option>中国</option>
			<option>英国</option>
			<option>美国</option>
		</select>
		<input type="submit" value="提交"/><input type="reset" value="重置"/>
	</form>

</body>
</html>