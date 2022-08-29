<%@ page pageEncoding="UTF-8" contentType="text/html;charset=utf-8"%>
<html>
 <head>
  <title>회원가입</title>
 </head>
 <body>
  <h1>회원가입</h1>
  <form action = "signup.do"method="POST">
   <p>아이디 : <input type="text" name="user_id" /></p>
   <p>비밀번호 : <input type="text" name="password" /></p>
   <p>이름 : <input type="text" name="name" /></p>
   <p>이메일 : <input type="text" name="email" /></p>
   <p>생년월일 : <input type="date" name="birth" /></p>
   <p><input type="submit" value="가입" />
  </form>
 </body>
</html>