<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>AJAX处理Json数据返回页面案例</title>
<link rel="stylesheet" href="${pageContext.servletContext.contextPath }/css/index_like.css"/>
<script type="text/javascript" src="${pageContext.servletContext.contextPath }/js/jquery1.12.4.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#btn").click(function(){
			$.ajax({
				url:"testJson",
				type:"POST",
				data:{},
				dataType:"json",
				success:function(msg){
					
					var tb="<table class='pure-table pure-table-bordered'>"
					//标题头
					tb += "<tr><th>ID</th><th>LASTNAME</th><th>EMAIL</th><th>GENDER</th><th>DEPARTMENTID</th><th>DEPARTMENTNAMT</th></tr>";
					for(var i in msg){
						var emp = msg[i];
						tb += "<tr><td>"+emp.id+"</td><td>"+emp.lastName+"</td><td>"+emp.email+"</td><td>"+emp.gender+"</td><td>"+emp.department.id+"</td><td>"+emp.department.departmentName+"</td></tr>"
					}
					tb += "</table>"
					$("#tb").append(tb);
				}
			});
		});
	})
</script>
</head>
<body>
	<center>
		<h2>AJAX处理Json数据返回页面案例</h2>
		<hr>
		<input id="btn" type="button" value="点我获取数据哟" />
		<div id="tb"></div>
	</center>
	<a href="index.jsp">返回</a>
</body>
</html>