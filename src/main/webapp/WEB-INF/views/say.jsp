<%@ page language="java" pageEncoding="UTF-8"%>
<%    
String path = request.getContextPath();    
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";    
pageContext.setAttribute("basePath",basePath);    
%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<title>Say</title>
		<link rel="stylesheet" href="c/demo.css">
	<script src="${basePath}s/jquery-1.11.0.js"></script>
	<script src="${basePath}s/bootstrap.js"></script>
	<link rel="stylesheet" href="${basePath}c/bootstrap.css">
	<script src="${basePath}s/demo.js"></script>
</head>
<body>
你好，${person.username}！
<ul class="pager">
  <li><a href="#">Previous</a></li>
  <li><a href="#">Next</a></li>
</ul>
</body>
</html>
