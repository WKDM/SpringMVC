<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.servletContext.contextPath }/css/index_like.css"/>
<script type="text/javascript" src="${pageContext.servletContext.contextPath }/js/jquery1.12.4.min.js"></script>
</head>
<body>
	<center>
		<h2><a href="test">测试代码是否能执行</a></h2><br>			
	</center>
		<hr>
		<ul>
			<li><h3><span>1、</span></span><a href="ajax_json.jsp">使用AJAX对Json数据的解析</a></h3></li>
			<li><h3><span>2、</span></span><a href="ajax_json_handle.jsp" style="color:red">AJAX处理Json数据返回页面案例</a></h3></li>
			<li><h3><span>3、</span></span><a href="downloadphoto.jsp">图片下载</a></h3></li>
			<li><h3><span>4、</span></span><a href="upload.jsp">图片上传</a></h3></li>
		</ul>	
</body>
</html>