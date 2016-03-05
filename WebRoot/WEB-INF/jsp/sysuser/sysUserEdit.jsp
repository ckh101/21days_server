<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title></title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="${pageContext.request.contextPath}/javascript/jquery-1.6.2.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/javascript/21days.js"></script>
	<%@include file="../common/functionTag.jsp" %>
	<style type="text/css">
	body{
		background: #FFF
	}
	</style>
	<script type="text/javascript">
				  	function cancel(){
				  		location.href="sysUser/toList";
				  	}
				  	
  	</script>
  </head>
    
  
  <body>
   	<table cellpadding="5">
						<tr id='checkUserName'></tr>				
						<tr>
							<td>用 户 名：<input id="username" name="username" type="text" size="26" maxlength="10" value='${user.userName }'></td>
							<td>密&nbsp;&nbsp;&nbsp;&nbsp;码：<input id="password1" name="password1" type="password" size="26" maxlength="20" value='${user.password }'></td>				
							</tr>
						<tr>
						<c:choose>
							<c:when test="${user.sex eq 2}">
							<td>性 &nbsp;&nbsp;&nbsp;别：<input  id="sex" name="sex" type="radio" value="1" >男<input  type="radio" id="sex" name="sex" value="2" checked>女</td>
							</c:when>
							<c:otherwise>
							<td>性 &nbsp;&nbsp;&nbsp;别：<input  id="sex" name="sex" type="radio" value="1" checked>男<input  type="radio" id="sex" name="sex" value="2" >女</td>
							</c:otherwise>
						</c:choose>
							<td>联系电话：<input id="tel" name="tel" type="text" size="24" maxlength="11" value="${user.phone }" ></td>
						</tr>
						<tr>
							<td>角色：<select id="role" name="role" >
								<c:choose>
									<c:when test="${user.descn eq '系统管理员'}">
										<option value="ROLE_ADMIN" selected>
											系统管理员
										</option>
										<option value="ROLE_USER">
											普通管理员
										</option>
									</c:when>
									<c:otherwise>
										<option value="ROLE_USER" selected>
											普通管理员
										</option>
									</c:otherwise>
								</c:choose>
								</select>
							</td>
							<td>&nbsp;&nbsp;真实姓名：<input id="realname" name="realname" type="text" size="50" maxlength="50" value="${user.realName }"></td>
						</tr>
						<tr>
							<td>&nbsp;&nbsp;E_mail：<input id="mail" name="mail" type="text" size="50" maxlength="50" value="${user.emali }"></td>
							<td>联系地址：<input id="lxdz" name="lxdz" type="text" size="50" maxlength="50" value="${user.address}"></td>
						</tr>
						<tr>
						<td align="center"><input name="Submit" type="button" value="保存" onclick="save()">&nbsp;&nbsp;<input name="Reset" type="button" value="取消" onclick="cancel()">
						</td>
						</tr>
				</table>
				
  </body>
  <script type="text/javascript">
  var domainName='${pageContext.request.contextPath}';
  var userId='${requestScope.user.userId}';
  
  function save(){
	  var username=$('#username').val();
	  var password=$('#password1').val();
	  var sex=$('input[name="sex"]:checked').val(); 
	  var tel=$('#tel').val();
	  var role=$('#role').val();
	  var realname=$('#realname').val();
	  var mail=$('#mail').val();
	  var lxdz=$('#lxdz').val();
		  if(!checkEmpty(username,"用户名不能为空!")){
			  return false;
		  }
		  if(!checkEmpty(password,"密码不能为空!")){
			  return false;
		  }
		  if(!checkEmpty(tel,"电话号码不能为空！")){
			  return false;
		  }
		  if(!checkEmpty(realname,"真实姓名不能为空!")){
			return false;  
		  }
		  if(!checkEmpty(mail,"邮箱地址不能为空!")){
			  return false;
		  }
		  if(!checkEmpty(lxdz,"联系地址不能为空!")){
			  return false;
		  }
		  if(!checkEmail(mail,"邮箱地址格式不正确!")){
			  return false;
		  }
		 if(!checkTel(tel,"请输入正确的电话号码！")){
			 return false;
		 }
	  var params={
			    id:userId,
				name:username,
				pwd:password,
				sex:sex,
				tel:tel,
				role:role,
				realname:realname,
				mail:mail,
				lxdz:lxdz
		  };
	  jQuery.ajax({
			url:domainName+'/sysUser/saveUser',
			type: 'post',
			data:params,          
			success: function(response){
				var obj1 = eval("("+response+")");
				var infoStr = obj1.info;
				var successStr=obj1.success;
				if(successStr==false){
					$('#checkUserName').html('<font id="checkUserName" color="red">'+infoStr+'</font>');
					
				}
				else{
					location.href="sysUser/toList";
				}
				
				
			 },	
		    error: function(response){
		    	alert("服务器异常，操作失败！")
		    	return false;
		    }		  
		 });
  }
  function checkEmpty(value,info){
		if(value==null||value==''){
			alert(info);
			return false;
		}
		return true;
	}
  function checkEmail(value,info){
		var Expression4=/^[\w-]+(\.[\w-]+)*@[\w-]+(\.[\w-]+)+$/; //匹配email
		var objExp4=new RegExp(Expression4);
		if(objExp4.test(value)!=true){
			alert(info);
			return false;
			
		}
		return true;
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
		return true;
	}
</script>
</html>
