<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<style>
		fieldset{
			width : 300px;
		}
		legend{
			font-weight : bold;
		}
	</style>
	
	<title>Login</title>
</head>
<body>
	<form action="login.do" method="post">
		<fieldset>
			<legend>Login</legend>
			<table>
				<tr>
					<th>ID</th>
					<td><input type="text" id="user_id" name="userId" placeholder="ID를 입력해주세요"></td>
				</tr>
				<tr>
					<th>PW</th>
					<td><input type="password" id="user_pw" name="pwd" placeholder="PWD를 입력해주세요"></td>
				</tr>
			</table>
			<button type="button" onclick="window.location.href='signUpPage.do'">회원가입</button>
			<button type="submit">로그인</button>
			<button type="reset">reset</button>
		</fieldset>
	</form>	
</body>
</html>