<%@ page language="java" pageEncoding="UTF-8"%>
<%    
String path = request.getContextPath();    
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";    
pageContext.setAttribute("basePath",basePath);    
%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<title>index</title>
	<!--
	<script src="s/jquery-ui-1.10.4.js"></script>
	<link rel="stylesheet" href="c/ui-lightness/jquery-ui-1.10.4.css">
	-->
	<link rel="stylesheet" href="c/demo.css">
	<script src="${basePath}s/jquery-1.11.0.js"></script>
	<script src="${basePath}s/bootstrap.js"></script>
	<link rel="stylesheet" href="${basePath}c/bootstrap.css">
	<script src="${basePath}s/demo.js"></script>
</head>
<body>

<div class="page-header text-center">
  <h1>WAT DEMO</h1>
</div>
<div id="loginDialog" class="hero-unit text-center">
<form class="hero-unit text-left login-from" action="person/login" method="POST">
  <fieldset>
    <legend>User login</legend>
		<section>
			<label for="loginUsername">username</label>
			<input id="loginUsername" type="text" name="username" placeholder="Input your username">
		</section>
		<section>
			<label for="loginPassword">password</label>
			<input id="loginPassword" type="password" name="password" placeholder="Input your password">
		</section>
		<section>
			<button type="submit" class="btn">Submit</button>
		</section>
  </fieldset>
</form>
</div>
</body>
</html>
