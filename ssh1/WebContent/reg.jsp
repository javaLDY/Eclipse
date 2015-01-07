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
<script src="<%=request.getContextPath() %>/js/checknum.js"></script>
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
        <div id="log" style="margin-top:10px;">
			<form id="loginForm">
        	<div id="ctopd">用户注册</div>
			<div id="cmopd">
				<ul>
					<li><strong class="ltt">登录名：</strong><input type="text" name="LoginName" id="loginname" class="ltx" /></li>
					<li><strong class="ltt">登录密码：</strong><input type="text" name="LoginPass" class="ltx" /></li>
					<li><strong class="ltt">确认密码：</strong><input type="text" name="LoginPass1" class="ltx" /></li>
					<li><strong class="ltt">密码保护问题：</strong><input type="text" name="LogProQuestion" class="ltx" /></li>
					<li><strong class="ltt">您的答案：</strong><input type="text" name="LogAnswer" class="ltx" /></li>
					<li><strong class="ltt">出生日期：</strong><input type="text" name="Birthday" class="ltx" /></li>
					<li><strong class="ltt">性 别：</strong><input type="text" name="password2" class="ltx" /></li>
					<li><strong class="ltt">昵 称：</strong><input type="text" name="FalseName" class="ltx" /></li>
					<li><strong class="ltt">密保邮箱：</strong><input type="text" name="ProEmail" class="ltx" /></li>
					<li><strong class="ltt">验证码：</strong><input type="text" name="CheckNum" id="checknum" maxlength="4" class="lty" /><img src="<%=request.getContextPath() %>/validCode.jsp" id="validcode" onclick="return volidimage()"/></li>
					<li><strong class="ltt">&nbsp;</strong><input type="checkbox" name="agreecode" class="ltc" />同意服务条款</li>
				</ul>
			</div>
			<div id="cfopd">
				<input type="submit" class="btn_sub" value="登 录" onclick="return regcheck()" />
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
