<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>启奥留言板设计案例</title>
<link href="CSS/style.css" rel="stylesheet" type="text/css" />
<script src="<%=request.getContextPath() %>/Images/jquery.js"></script>
<script src="<%=request.getContextPath() %>/Images/myjs.js"></script>
</head>

<body>
	<div id="main">
    	<div id="header">
        	<img src="<%=request.getContextPath() %>/Images/logo.gif" alt="启奥留言板设计案例" />
            <div>
            	<a href="login.jsp">登陆</a>&nbsp;&nbsp;&nbsp;
                <a href="reg.jsp">注册</a>
            </div>
        </div>
        <div id="log">
			<form id="loginForm">
        	<div id="ctopd">编辑留言</div>
			<div id="cmopd">
				<ul>
					<li><strong class="lts">姓名：</strong><input type="text" name="username" class="lty" /></li>
					<li><strong class="lts">邮箱：</strong><input type="text" name="password" class="ltx" /></li>
					<li><strong class="lts">回复：</strong><textarea class="ltxs"></textarea></li>
				</ul>
			</div>
			<div id="cfopd">
				<input type="submit" class="btn_sub" value="提 交" />
				<input type="button" class="btn_res" value="返 回" />
			</div>
			</form>
        </div>
		<div id="footer">
			<img src="<%=request.getContextPath() %>/Images/logof.gif" alt="唐山市启奥职业培训学校" />
		</div>
    </div>
</body>
</html>
