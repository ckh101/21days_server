<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>系统管理员</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
<script type="text/javascript" src="${pageContext.request.contextPath}/javascript/jquery-1.6.2.min.js"></script>
	<script type="text/javascript">
	 var domainName='${pageContext.request.contextPath}';
		function selectPagesize(field){
		location.href = "sysUser/toList?offset="+field.value;
		}
		function search(){
			var srch=$('#srch').val();
			location.href = "sysUser/toList?srch="+srch;
		}
		function selectAll(){  
		    if ($("#SelectAll").attr("checked")) {  
		        $(":checkbox").attr("checked", true);  
		    } else {  
		        $(":checkbox").attr("checked", false);  
		    }  
		}  
		function deleteUser(){
			var id=document.getElementsByName("item");
			var count = 0;
			for ( var i = 0; i < id.length; i++) {
				if (id[i].checked) {
					count++;
				}
			}
			if(count==0){
				alert("请先选择！！！");
				return false;
			}
			var idVal = "";
			for ( var i = 0; i < id.length; i++) {
				if (id[i].checked) {
					idVal +=id[i].value+",";
				}
			}
			var ret = idVal.substring(0,idVal.length-1);
			var param={
					ids:ret
			};
			if(confirm("确认要删除？")){
				jQuery.ajax({
					url:domainName+'/sysUser/deleteUser',
					type: 'post',
					data:param,          
					success: function(response){
							location.href="sysUser/toList";
					 },	
				    error: function(response){
				    	alert("服务器异常，操作失败！")
				    	return false;
				    }		  
				 });
			}
			
		}
	</script>
	<style type="text/css">
	 body{
	 	background: #FFF
	 }
	</style>
	<%@include file="../common/functionTag.jsp" %>
  </head>
  	
  <body>
  	<table cellpadding="5">
							  				
						<tr>
							<td><input id="srch" name="srch" type="text" ></td>
							<td><input type="button" value="查询" onclick="search()"></td>
						</tr>
						
	</table>
   <table width="100%" border="0" align="center" cellpadding=5 cellspacing=1 bgcolor=#000000>
    		<tr align="center" bgcolor=#cccccc>
    			<c:if test="${role eq'ROLE_ADMIN' }">
    			<td width="5%"><input type="checkbox" class="chkBorder" id="SelectAll" onclick="selectAll()"/></td>
    			</c:if>
    			<td width="10%">用户名</td>
    			<td width="5%">性别</td>
    			<td width="10%">身份</td>
    			<td width="10%">联系电话</td>
    			<td width="20%">联系地址</td>
    			<td width="15%">邮箱地址</td>
    			<td width="20%">注册时间</td>
    			<td width="10%">编辑</td>
    		</tr>
    		 <c:forEach items="${userList}" var="user">
    		 <tr align="center">
    		 	<c:if test="${role eq'ROLE_ADMIN' }">
    				<td bgcolor="#FFFFFF"><input type="checkbox" class="chkBorder" name="item" value='${user.userId }'/></td>
    			</c:if>
    			<td bgcolor="#FFFFFF">${user.userName}</td>
    			<c:if test="${user.sex eq 1}">
			       	<td bgcolor="#FFFFFF" >男</td>
			    </c:if>
			    <c:if test="${user.sex eq 2}">
			       	<td  bgcolor="#FFFFFF">女</td>
			     </c:if>
			     <td bgcolor="#FFFFFF">${user.descn}</td>
			     <td  bgcolor="#FFFFFF">${user.phone}</td>
			     <td  bgcolor="#FFFFFF">${user.address}</td>
			     <td bgcolor="#FFFFFF">${user.emali}</td>
			     <td bgcolor="#FFFFFF"><fmt:formatDate pattern="yyyy-MM-dd" value="${user.registetime}" /></td>
			     <c:choose>
			     <c:when test="${role eq'ROLE_ADMIN' or username eq user.userName}">
				     <td bgcolor="#FFFFFF"><input type="image" src="${pageContext.request.contextPath}/images/edit.png" style="width:50;height:30" onclick="javascript:document.getElementById('${user.userName}').click()"/>
						<a id="${user.userName}" href="sysUser/sysUserEdit?userId=${user.userId}"></a>
					 </td>
				 </c:when>
				 <c:otherwise>
				 	<td bgcolor="#FFFFFF"><input type="image" src="${pageContext.request.contextPath}/images/edit.png" style="width:50;height:30" />
					 </td>
				 </c:otherwise>
				 </c:choose>
			</tr>
    		 </c:forEach>
   </table>
   			 <table  border="0" cellspacing="0" cellpadding="0" align="center">
     			 <tr>
        			
        			<td >
        				<a href="sysUser/toList?offset=0">首页</a>
						<a href="sysUser/toList?offset=${(currentPage-2 lt 0 ? 0 : (currentPage-2))*pagesize}">前页</a>
						<select name="pagesize" onchange="selectPagesize(this)" >
	
						<c:forEach begin="1" end="${maxPage}" step="1" var="i">
						<option value="${(i-1)*pagesize}" <c:if test="${(i-1)*pagesize eq offset}">selected</c:if> >第${i}页</option>
						</c:forEach>
					</select>
						<a href="sysUser/toList?offset=${(currentPage ge maxPage ? (maxPage-1):(currentPage+1))*pagesize }">下页</a>
						<a href="sysUser/toList?offset=${(maxPage-1) * pagesize}">尾页</a>
					</td>
					<c:if test="${role eq 'ROLE_ADMIN'}">
						<td><input name="delete" type="button" value="删除" onclick="deleteUser()"></td>
					</c:if>
				</tr>
			</table>
	
  </body>
 
  
</html>
