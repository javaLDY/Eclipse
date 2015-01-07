var ss = $.noConflict();
ss(document).ready(function(){
	ss("#btn1").click(function(){
		var xmlhttp;
		if (window.XMLHttpRequest)
		  {
		  xmlhttp=new XMLHttpRequest();
		  }
		else
		  {
		  xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
		  }
		xmlhttp.onreadystatechange=function()
		  {
		  if (xmlhttp.readyState==4 && xmlhttp.status==200)
		    {
		    document.getElementById("stuname").innerHTML=xmlhttp.responseText;
		    }
		  };
		xmlhttp.open("POST","/ajax/demo_get.asp",true);
		xmlhttp.send();
		//sdss("p").hide(1000);
		//ss("div").css("color","red").slideUp(2000).slideDown(2000);
		//ss("p").css("background-color","red");
		//alert("Text:"+ss("#p1").text("fuck......."));
//		ss("#p1").remove();
//		ss("#p2").empty();
	});
//	ss("#btn2").click(function(){
//		alert("HTML"+ss("#p2").html("hello"+"<b>asdfsdfsdf</b>"));
//	});
//	ss("#btn1").click(function(){
//		alert("val"+ss("#btn2").val("push me"));
//	});
	});