
function checkEmpty(value,info){
	if(value==null||value==''){
		alert(info);
		return false;
	}
}
function checkEmail(value,info){
	var Expression4=/^[\w-]+(\.[\w-]+)*@[\w-]+(\.[\w-]+)+$/; //匹配email
	var objExp4=new RegExp(Expression4);
	if(objExp4.test(value)!=true){
		alert(info);
		return false;
		
	}
}
funciton checkPwd(value,info){
	var Expression2=/^[A-Za-z0-9]+$/; 	//匹配密码
	var objExp2=new RegExp(Expression2);
	if(objExp2.test(value)!=true){
		alert(info);
		return false;
	}
}
function checkName(value,info){
	var Expression1=/^\w+$/; //匹配用户名
	var objExp1=new RegExp(Expression1); 
	if(objExp1.test(value)!=true){
		alert(info);
		return false;
	}
}
function checkTel(value,info){
	var Expression3=/^\d+$/; 
	var objExp3=new RegExp(Expression3);
	if(value.length<9||value.length>11){
		alert("输入有误，电话号码长度为9-11位！");
		return false;
	}
	if(objExp3.test(value)!=true){
		alert(info);
		return false;
	}
}
