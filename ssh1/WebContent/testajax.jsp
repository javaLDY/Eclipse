<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-1.9.1.js"></script>
<script type="text/javascript">
  $(document).ready(function(){
	  $("#loginid").blur(function(){
			$.ajax({
				type : "POST",
				ansync : false,
				url : "<%=request.getContextPath()%>/JquerySelectServlet" ,
			    data : {usercode:$("#loginid").val()},
				//dataType : "json",
				success : function(msg){
					$("#stuname").val(msg);
				},
				error : function(){
					alert("请求出错");
				}
			});
			
		});
  });
	
</script>
</head>
<body>
	<form action="">
		<div>
			学号:<input type="text" name="Id" id="loginid"/>
			姓名:<input type="text" name="stuname" id="stuname"/>
			<input type="button" id="submit1"/>
		</div>
	</form>
</body>
</html>