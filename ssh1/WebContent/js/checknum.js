function volidimage(){
	document.getElementById("validcode").src="validCode.jsp?r="+Math.random();
}
function regcheck(){
	var loginname = document.getElementById("loginname").value;
	if((loginname==null)||(loginname.length<1)){
		alert("注册名称不能为空");
		document.getElementById("loginname").focus();
		return;
	}
	var loginpass = document.getElementById("loginpass").value;
	if((loginpass!=null)||(loginpass.length<1)){
		alert("密码不能为空");
		document.getElementById("loginpass").focus();
		return;
	}
	documnet.forms[0].submit();
}