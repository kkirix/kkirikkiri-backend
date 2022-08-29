<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 화면</title>
</head>
<body>
	<h1>로그인</h1>
	<form action = "userlogin.do" method="POST">
		<p>아이디 : <input type="text" name="user_id" /></p>
		<p>비밀번호 : <input type="text" name="password" /></p>
		<p><input type="submit" value="로그인" />
		<button type = "button" onclick = "location.href = 'signup.do'">회원가입</button>
  	</form>
</body>
</html>