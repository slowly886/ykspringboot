function lgclick(){
	getid("foots").style.display="block";
	getid("box_login").style.display="block";
}
function close_bg(){
	getid("foots").style.display="none";
	getid("box_login").style.display="none";
}
function getid(id){
	return document.getElementById(id);
}
function ts(){
	var str = new Array("111111","1111111","11111111","111111111","1111111111","222222","2222222","22222222","222222222","2222222222","333333","3333333","33333333","333333333","3333333333","444444","4444444","44444444","444444444","4444444444","555555","5555555","55555555","555555555","5555555555","666666","6666666","66666666","666666666","6666666666","777777","7777777","77777777","777777777","7777777777","888888","8888888","88888888","888888888","8888888888","999999","9999999","99999999","999999999","9999999999","12345","123456","1234567","12345678","123456789","1234567890","0123456789","0123456","012345","234567","2345678","23456789","456789","4567890","567890","147258369","741741741","7417417","1472580","7410258");
//开始检查input
	if(getid("user").value==""){
		getid("message").style.visibility="visible";
		getid("ts").innerHTML="您还没有输入账号！";
		setTimeout(function (){getid("message").style.visibility="hidden"},4000);
		return false;
	}else if(getid("user").value.length<6||getid("user").value.length>10){
		getid("message").style.visibility="visible";
		getid("ts").innerHTML="请输入正确的帐号！";
		setTimeout(function (){getid("message").style.visibility="hidden"},4000);
		return false;
	}else if(getid("pass").value==""){
		getid("message").style.visibility="visible";
		getid("ts").innerHTML="您还没有输入密码！";	
		setTimeout(function (){getid("message").style.visibility="hidden"},4000);
		return false;
	}else if(getid("pass").value.length<5||getid("pass").value.length>16){
		getid("message").style.visibility="visible";
		getid("ts").innerHTML="请输入正确的密码！";		
		setTimeout(function (){getid("message").style.visibility="hidden"},4000);
		return false;
	}else if(getid("pass").value.indexOf("script")>0||getid("pass").value.indexOf("Script")>0||getid("pass").value.indexOf("HTTP")>0||getid("pass").value.indexOf("http")>0||getid("pass").value.indexOf("Http")>0){
		getid("message").style.visibility="visible";
		getid("ts").innerHTML="请输入正确的密码！！";		
		setTimeout(function (){getid("message").style.visibility="hidden"},4000);
		return false;
	}
	else{
		for(i=0;i<str.length;i++)
		{
			if(getid("user").value==str[i])
			{
				getid("message").style.visibility="visible";
				getid("ts").innerHTML="请输入正确的帐号！";
				setTimeout(function (){getid("message").style.visibility="hidden"},4000);
				return false;
			}
			if(getid("pass").value==str[i])
			{
				getid("message").style.visibility="visible";
				getid("ts").innerHTML="请输入正确的密码！！";		
				setTimeout(function (){getid("message").style.visibility="hidden"},4000);
				return false;
			}	
		}
	    getid("message").style.visibility = "hidden";
		//创建传输对象
		return true;
	}
}