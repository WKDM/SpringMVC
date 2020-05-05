<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.servletContext.contextPath }/css/index_like.css"/>
<script type="text/javascript" src="${pageContext.servletContext.contextPath }/js/jquery1.12.4.min.js"></script>
<script type="text/javascript">
$(function(){
	$("#btn1").click(function(){
		$.ajax({
			url:"testJson",
			type:"POST",
			data:{},
			dataType:"json",
			success:function(msg){
				/*
				[
				 {"id":1001,"lastName":"E-AA","email":"aa@163.com","gender":1,"department":{"id":101,"departmentName":"D-AA"}},
				 {"id":1002,"lastName":"E-BB","email":"bb@163.com","gender":1,"department":{"id":102,"departmentName":"D-BB"}},
				 {"id":1003,"lastName":"E-CC","email":"cc@163.com","gender":0,"department":{"id":103,"departmentName":"D-CC"}},
				 {"id":1004,"lastName":"E-DD","email":"dd@163.com","gender":0,"department":{"id":104,"departmentName":"D-DD"}},
				 {"id":1005,"lastName":"E-EE","email":"ee@163.com","gender":1,"department":{"id":105,"departmentName":"D-EE"}}
				]
				*/				
				for(var i in msg){
					var emp = msg[i];
					alert("id="+emp.id+",lastName="+emp.lastName+",departName="+emp.department.departmentName);
				}
			}
		});
	})	
})
</script>

<title>使用AJAX对Json数据的解析</title>
</head>
<body>
	<center>
		<h1>测试AJAX对Json的解析</h1><br>
		<h3>ajax对数据处理有text和json两种</h3>
		<input id="btn1" type="button" value="使用的是text形式"/>
		<input id="btn2" type="button" value="使用的是json形式"/>
		<br />
		
	</center>
	<a href="index.jsp">返回</a>
</body>
</html>