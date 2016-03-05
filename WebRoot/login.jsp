<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>21天习惯养成习惯后台登陆</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link href="css/login.css" rel="stylesheet" type="text/css" />
	 <link rel="shortcut icon" href="${pageContext.request.contextPath}/images/favicon.ico">
	 
  </head>
  
 <body>
	 <div id="wrap">
		<div id="header"> </div>
	    <div id="content-wrap">
	    	<div class="space"></div>
		   	  	<form action="${pageContext.request.contextPath}/j_spring_security_check" method="post">
			   	  <div class="content">
			   	  <div class="field">
			   	  <c:choose>
			   	  	<c:when test="${!empty error }"><font color="red" id="errorinfo">${error}</font></c:when>
			   	  	<c:otherwise>
					<c:if test="${! empty sessionScope.SPRING_SECURITY_LAST_EXCEPTION.message }"><font color="red" id="errorinfo">用户名或密码错误，请重新输入</font></c:if>
			   	  	</c:otherwise>
			   	  </c:choose>
			   	  </div>
			        <div class="field"><label>账　户：</label><input class="username" name="j_username" type="text"/></div>
					<div class="field"><label>密　码：</label><input class="password" name="j_password" type="password"/><br/></div>
			        <div class="field"><label>验证码：</label><input class="password" name="j_captcha" type="text" /><div class="code"><img id="captchaImg" src="<c:url value="images/jcaptcha.jpg"/>" onclick="this.src='images/jcaptcha.jpg?now=' + new Date().getTime()" style="width:90px; height:35px;" alt="看不清，点击换一张"/><br/><span><font color="#436EEE">请输入校验码，大小写不区分,如看不清,请点击图片换一张</font></span></div><br/></div>
			        <div class="btn">
			        <input name="" type="submit" class="login-btn" value="" />
			        <input name="" type="reset"  class="reset-btn" value=""/>
			        </div>
			      </div>
		      	</form>
	    </div>
	    <div id="footer"> </div>
	</div>
  </body>
</html>
