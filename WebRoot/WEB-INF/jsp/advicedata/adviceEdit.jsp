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
	<style type="text/css">
	body{
		background: #FFF
	}
	</style>
	<script type="text/javascript">
				  	function cancel(){
				  		location.href="serverAdvices/toList";
				  	}
  	</script>
  </head>
  
  <body>
      	<table cellpadding="5">
						<tr id='checkChange'></tr>	  				
						<tr>
							<td>类型：<select name="type" id="type">
									<option value="0" selected>
										老虎型
									</option>
									<option value="1">
										孔雀型
									</option>
									<option value="2">
										考拉型
									</option>
									<option value="3">
										猫头鹰型
									</option>
									<option value="4">
										变色龙型
									</option>
								</select> 
							</td>
							<td>改变：<input id="change" name="change" type="text" value="${ad.name }"></td>				
							</tr>
						<tr>
							<td>第一阶段计划：<input id="part1" name="part1" type="text" value="${ad.part1 }"></td>		
						</tr>
						<tr>
							<td>第二阶段计划：<input id="part2" name="part2" type="text" value="${ad.part2 }"></td>		
						</tr>
						<tr>
							<td>第三阶段计划：<input id="part3" name="part3" type="text" value="${ad.part3 }"></td>		
						</tr>
						<tr>
						<td align="center"><input name="Submit" type="button" value="保存" onclick="save()">&nbsp;&nbsp;<input name="Reset" type="button" value="取消" onclick="cancel()">
						</td>
						</tr>
				</table>
  </body>
  <script type="text/javascript">
  var domainName='${pageContext.request.contextPath}';
  var id='${requestScope.ad.adId}';
  var animal='${requestScope.ad.type}';
  
  jQuery(document).ready(function(){
	 
	  if(animal=='0'){
	
		  $("#type").val("0"); 

	  }
		if(animal=='1'){
			 $("#type").val("1");	  
		}
		if(animal=='2'){
			 $("#type").val("2");	
		}
		if(animal=='3'){
			 $("#type").val("3");	
		}
		if(animal=='4'){
			 $("#type").val("4");	
		}

  });
  function save(){
	  var type=$('#type').val();
	  var change=$('#change').val();
	  var part1=$('#part1').val(); 
	  var part2=$('#part2').val();
	  var part3=$('#part3').val();
	  if(!checkEmpty(change,"内容不能为空!")){
		  return false;
	  }
	  if(!checkEmpty(part1,"第一阶段计划不能为空!")){
		  return false;
	  }
	  if(!checkEmpty(part2,"第二阶段计划不能为空！")){
		  return false;
	  }
	  if(!checkEmpty(part3,"第三阶段不能为空!")){
		return false;  
	  }
	  var params={
			    id:id,
			    type:type,
				part1:part1,
				part2:part2,
				part3:part3,
				change:change
		  };
	  jQuery.ajax({
			url:domainName+'/serverAdvices/saveAdvice',
			type: 'post',
			data:params,          
			success: function(response){
				var obj1 = eval("("+response+")");
				var infoStr = obj1.info;
				var successStr=obj1.success;
				if(successStr==false){
					$('#checkChange').html('<font id="checkUserName" color="red">'+infoStr+'</font>');
					
				}
				else{
					location.href="serverAdvices/toList";
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
  </script>
</html>
