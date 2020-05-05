<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery1.12.4.min.js"></script>
<script type="text/javascript">
	function test(){
		$.ajax({
			url:"testAJAX_DELETE",//请求地址
			type:"DELETE",//传输方式
			data:{id:1001},//传递的参数
			dataType:"json",//（json接受）返回结果类型
			success:function (obj){
				alert(obj)
			}
		})
	}
</script>
</head>
<body>
	<a href="testREST/1001">测是Get</a>
	
	<form action="testREST" method="POST">
		<input type="submit" value="测试POST"/>
	</form>
	
	<form action="testREST" method="POST">
		<input type="hidden" name="_method" value="PUT"/>
		<input type="submit" value="测试PUT"/>
	</form>
	<form action="testREST/1001" method="POST">
		<input type="hidden" name="_method" value="DELETE"/>
		<input type="submit" value="测试DELETE"/>
	</form>
	
	<input type = "button" value="测试Ajax" onclick="test()" />	
</body>
</html>