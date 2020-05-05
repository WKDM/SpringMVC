<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>上传图片</title>
<link rel="stylesheet" href="${pageContext.servletContext.contextPath }/css/index_like.css"/>
<script type="text/javascript" src="${pageContext.servletContext.contextPath }/js/jquery1.12.4.min.js"></script>
</head>
<body>
	<center>
		<h3>上传照片</h3>
		<form action="up" method="POST" enctype="multipart/form-data">
			头像：<input type="file" name="photo" />
			描述：<input type="text" name="desc" />
			<input type="submit" value="上传" />
		</form>
	</center>
</body>
</html>