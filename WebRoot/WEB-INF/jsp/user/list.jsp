<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8"contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html class="html">
<head>
<meta http-equiv="X-UA-Compatible" content="IE=9,chrome=1" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
	
	<%@include file="../common/sortcss.jsp" %>
	<%@include file="../common/functionTag.jsp" %>

<script type="text/javascript" src="<c:url value='../javascripts/jquery.tablesorter.js'/>"></script>
</head>

<body>

<h1>Users</h1>

<table   class="tablesorter" id="mottoTable">
	<thead>
		<tr>
			<th nowrap="nowrap">Online</th>
			<th nowrap="nowrap">Username</th>
			<th nowrap="nowrap">Name</th>
			<th nowrap="nowrap">Email</th>
			<th nowrap="nowrap">Created</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${requestScope.userList}" var="v" varStatus="n">
			<tr>
				<td nowrap="nowrap" align="center">
				<c:choose>
				<c:when test="${v.online eq true}">
					<img src="../images/user-online.png" />
				</c:when>
				<c:otherwise>
					<img src="../images/user-offline.png" />
				</c:otherwise>
				</c:choose>
				</td>
				<td nowrap="nowrap"><c:out value="${v.username}" /></td>
				<td nowrap="nowrap"><c:out value="${v.name}" /></td>
				<td nowrap="nowrap"><c:out value="${v.email}" /></td>
				<td nowrap="nowrap" align="center"><fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${v.createTime}" /></td>
			</tr>
		</c:forEach>
	</tbody>
</table>


</body>
</html>
