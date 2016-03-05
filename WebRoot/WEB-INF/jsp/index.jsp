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
    <title>21天养成习惯后台管理系统</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
		<%@include file="./common/functionTag.jsp" %>
	 <link rel="shortcut icon" href="${pageContext.request.contextPath}/images/favicon.ico">
	<link href="css/style.css" rel="stylesheet" type="text/css" />
	<script type="text/javascript" src="javascript/jquery.min.js"></script>
	<script type="text/javascript" src="javascript/js.js"></script>
<script type="text/javascript">
$(function(){
	//setMenuHeight
	$('.menu').height($(window).height()-51-27-26);
	$('.sidebar').height($(window).height()-51-27-26);
	$('.page').height($(window).height()-51-27-26);
	$('.page iframe').width($(window).width()-15-168);
	
	//menu on and off
	$('.btn').click(function(){
		$('.menu').toggle();
		
		if($(".menu").is(":hidden")){
			$('.page iframe').width($(window).width()-15+5);
			}else{
			$('.page iframe').width($(window).width()-15-168);
				}
		});
		
	//
	$('.subMenu a[href="#"]').click(function(){
		$(this).next('ul').toggle();
		return false;
		});
})
</script>

</head>


<body>
<div id="wrap">
	<div id="header">
    <div class="logo fleft"></div>
    <a class="logout fright" href="${pageContext.request.contextPath}/j_spring_security_logout"> </a>
    <div class="clear"></div>
    <div class="subnav">
    	<span class="userInfo">你好，管理员${user }，今天是${date }</span>
    	<div class="subnavLeft fleft"></div>
        <div class="fleft"></div>
        <div class="subnavRight fright"></div>
    </div>
    </div><!--#header -->
    <div id="content">
    <div class="space"></div>
    <div class="menu fleft">
    	<ul>
        	<li class="subMenuTitle"><a href="images/index_bg.png" target="right">后台管理模块</a></li>
            <li class="subMenu"><a href="#">管理员</a>
            	<ul>
            		<c:if test="${role eq 'ROLE_ADMIN'}">
                		<li><a href="sysUser/sysUserEdit" target="right">增加管理员</a></li>
                	</c:if>
                    <li><a href="sysUser/toList?offset=0" target="right">管理管理员</a></li>
                </ul>
            </li>
            <li class="subMenu"><a href="home/homePage" target="right">推送管理</a></li>
            <li class="subMenu"><a href="#" target="right">数据管理</a>
            	<ul>
            		<c:if test="${role eq 'ROLE_ADMIN'}">
                    	<li><a href="serverAdvices/toAdviceEdit" target="right">增加数据</a></li>
                    </c:if>
                    <li><a href="serverAdvices/toList?offset=0" target="right">管理数据</a></li>
                </ul>
            </li>
        </ul>
    </div>
    <div class="sidebar fleft"><div class="btn"></div></div>
    <div class="page">
    <iframe width="100%" scrolling="auto" height="100%" frameborder="false" allowtransparency="true" style="border: medium none;" src="images/index_bg.png" id="rightMain" name="right"></iframe>
    </div>
    </div><!--#content -->
    <div class="clear"></div>
    <div id="footer"></div><!--#footer -->
   
    
</div><!--#wrap -->
</body>

</html>
