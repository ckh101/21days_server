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
    
    <title></title>
    <meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
<link href="css/style1.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="javascript/js.js"></script>
<base target="frameBord" />
</head>

<body id="index">
<h1>推送管理</h1>
<ul id="globalNav">
	<li><a href="notification/toList">Notification</a></li>
	<li><a href="session/toList">Session</a></li>
	<!-- <li><a href="user/toList">User</a></li> -->
	<li><a href="home/homePage">Home</a></li>
</ul>
<iframe id="frameBord" name="frameBord" frameborder="0" width="100%" height="100%" src="androidpnIndex.jsp"></iframe>
</body>
</html>
