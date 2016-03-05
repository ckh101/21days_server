<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html >
<head>
<title></title>

<%@include file="../common/sortcss.jsp" %>
<%@include file="../common/functionTag.jsp" %>
<script type="text/javascript" src="<c:url value='javascripts/jquery.tablesorter.js'/>"></script>
</head>

<body>

<h1>Sessions</h1>

<table class="tablesorter" id="mottoTable">
	<thead>
		<tr>
			<th nowrap="nowrap">Username</th>
			<th nowrap="nowrap">Resource</th>
			<th nowrap="nowrap">Status</th>
			<th nowrap="nowrap">Presence</th>
			<th nowrap="nowrap">Client IP</th>
			<th nowrap="nowrap">Created</th>			
		</tr>
	</thead>
	<tbody>
		<c:forEach var="sess" items="${requestScope.sessionList}">
			<tr>
				<td nowrap="nowrap" align="center"><c:out value="${sess.username}" /></td>
				<td nowrap="nowrap" align="center"><c:out value="${sess.resource}" /></td>
				<td nowrap="nowrap" align="center"><c:out value="${sess.status}" /></td>
				<td nowrap="nowrap" align="center">
					<c:choose>
					<c:when test="${sess.presence eq 'Online'}">
						<img src="../images/user-online.png" />
					</c:when>
					<c:when test="${sess.presence eq 'Offline'}">
						<img src="../images/user-offline.png" />
					</c:when>
					<c:otherwise>
						<img src="../images/user-away.png" />
					</c:otherwise>
					</c:choose>
					<c:out value="${sess.presence}" />
				</td>
				<td nowrap="nowrap" align="center"><c:out value="${sess.clientIP}" /></td>
				<td nowrap="nowrap" align="center"><fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${sess.createdDate}" /></td>
			</tr>
		</c:forEach>
	</tbody>
</table>


</body>
</html>
