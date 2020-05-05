<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>展示员工信息</title>
<link rel="stylesheet" href="${pageContext.servletContext.contextPath }/css/index_like.css"/>
<script type="text/javascript" src="${pageContext.servletContext.contextPath }/js/jquery1.12.4.min.js"></script>
<script type="text/javascript">
	$(function(){
		$(".del").click(function(){
			if(confirm("确认删除吗？")){
				//$("form").attr("action",this.href).submit();
				$("form").attr("action",$(this).attr("href")).submit();//设置form的action属性，属性值为：获取的.del中的href属性	.submit是提交form表单
				return false;
			}			
			return false;//将超链接的默认行为取消，取消href="emp/${emp.id }"的直接跳转，而使用form中的POST
		});
	});//预加载函数或文档就绪函数
</script>
</head>
<body>
	<table  class="pure-table pure-table-bordered">
		<tr>
			<th>ID</th>
			<th>LASTNAME</th>
			<th>EMAIL</th>
			<th>GENDER</th>
			<th>DEPARTMENTNAME</th>
			<th>OTION(<a href="emp">add添加</a>)</th>
		</tr>
		<c:forEach items="${emps }" var="emp"><!-- 使用forEache 循环列表emps，别名为emp -->
			<tr>
				<td>${emp.id }</td>
				<td>${emp.lastName }</td>
				<td>${emp.email }</td>
				<td>${emp.gender==0?'女':'男' }</td>
				<td>${emp.department.departmentName }</td>
				<td>
					<a href="emp/${emp.id }">UPDATE</a><!--${emp.id}以id为参数，传递  -->
					<a class="del" href="emp/${emp.id }">DELETE</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<form method="POST">
		<input type="hidden" name="_method" value="DELETE" />
	</form>
</body>
</html>