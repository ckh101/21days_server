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
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="${pageContext.request.contextPath}/javascript/jquery-1.6.2.min.js"></script>
	<%@include file="../common/functionTag.jsp" %>
 <style type="text/css">
 	body{
 		background: #FFF
 	}
 </style>
 <script type="text/javascript">
 var domainName='${pageContext.request.contextPath}';
		function selectPagesize(field){
		location.href = "serverAdvices/toList?offset="+field.value;
		}
		function selectAll(){  
		    if ($("#SelectAll").attr("checked")) {  
		        $(":checkbox").attr("checked", true);  
		    } else {  
		        $(":checkbox").attr("checked", false);  
		    }  
		}  
		function deleteAdvice(){
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
					url:domainName+'/serverAdvices/deleteAdvice',
					type: 'post',
					data:param,          
					success: function(response){
							location.href="serverAdvices/toList";
					 },	
				    error: function(response){
				    	alert("服务器异常，操作失败！")
				    	return false;
				    }		  
				 });
			}
		}
	</script>
  </head>
  
  <body>
    <table width="100%" border="0" align="center" cellpadding=5 cellspacing=1 bgcolor=#000000>
    		<tr align="center" bgcolor=#cccccc>
    		<c:if test="${role eq 'ROLE_ADMIN'}">
    			<td width="5%"><input type="checkbox" class="chkBorder" id="SelectAll" onclick="selectAll()"/></td>
    		</c:if>
    			<td width="10%">类型</td>
    			<td width="5%">改变</td>
    			<td width="10%">第一阶段计划</td>
    			<td width="10%">第二阶段计划</td>
    			<td width="20%">第三阶段计划</td>
    			<c:if test="${role eq 'ROLE_ADMIN'}">
    				<td width="10%">编辑</td>
    			</c:if>
    		</tr>
    		<c:forEach items="${adviceList}" var="advice">
    		 <tr align="center">
    			<c:if test="${role eq'ROLE_ADMIN' }">
    				<td bgcolor="#FFFFFF"><input type="checkbox" class="chkBorder" name="item" value='${advice.adId }'/></td>
    			</c:if>
    			<c:if test="${advice.type eq 0 }">
    				<td bgcolor="#FFFFFF">老虎型</td>
    			</c:if>
    			<c:if test="${advice.type eq 1 }">
    				<td bgcolor="#FFFFFF">孔雀型</td>
    			</c:if>
    			<c:if test="${advice.type eq 2 }">
    				<td bgcolor="#FFFFFF">考拉型</td>
    			</c:if>
    			<c:if test="${advice.type eq 3 }">
    				<td bgcolor="#FFFFFF">猫头鹰型</td>
    			</c:if>
    			<c:if test="${advice.type eq 4 }">
    				<td bgcolor="#FFFFFF">变色龙型</td>
    			</c:if>
    			<td bgcolor="#FFFFFF">${advice.name}</td>
    			<td bgcolor="#FFFFFF">${advice.part1}</td>
    			<td bgcolor="#FFFFFF">${advice.part2}</td>
    			<td bgcolor="#FFFFFF">${advice.part3}</td>
    			<c:if test="${role eq 'ROLE_ADMIN'}">
	    			<td bgcolor="#FFFFFF"><input type="image" src="${pageContext.request.contextPath}/images/edit.png" style="width:50;height:30" onclick="javascript:document.getElementById('${advice.adId}').click()"/>
						<a id="${advice.adId}" href="serverAdvices/toAdviceEdit?id=${advice.adId}"></a></td>
				</c:if>
    		
    		 </tr>
    		 </c:forEach>
    	
   </table>
   			 <table  border="0" cellspacing="0" cellpadding="0" align="center">
     			 <tr>
        			<td >
        				<a href="MemberListServlet?offset=0">首页</a>
						<a href="MemberListServlet?offset=${(currentPage-2 lt 0 ? 0 : (currentPage-2))*pagesize}">前页</a>
						<select name="pagesize" onchange="selectPagesize(this)" >
	
						<c:forEach begin="1" end="${maxPage}" step="1" var="i">
						<option value="${(i-1)*pagesize}" <c:if test="${(i-1)*pagesize eq offset}">selected</c:if> >第${i}页</option>
						</c:forEach>
					</select>
						<a href="MemberListServlet?offset=${(currentPage ge maxPage ? (maxPage-1):(currentPage+1))*pagesize }">下页</a>
						<a href="MemberListServlet?offset=${(maxPage-1) * pagesize}">尾页</a>
					</td>
					<c:if test="${role eq 'ROLE_ADMIN'}">
					<td><input name="delete" type="button" value="删除" onclick="deleteAdvice()"></td>
					</c:if>
				</tr>
				
			</table>
  </body>
</html>
