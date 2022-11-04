<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main page</title>
</head>
<body>
	<h1>[${user.name }]님 반갑습니다.</h1>
	<p>id : ${user.userId }</p>
	<p>deptCd : ${user.deptCd }</p>
	<p>email : ${user.email }</p>
	<p>job : ${user.job }</p>
	<p>phone : ${user.phone }</p>
</body>
</html>