<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザ登録</title>
</head>
<body>

	<h1>ユーザ登録画面</h1>
	
	<p>ユーザ名は、5文字以内で登録してください</p>
	<p>Passwordは英数字で10文字以内で登録してください</p>
	
	<form action="Registration" method="post" >
	
		<p>
			<input type="text" name="name" value="" />
		</p>
	
		<p>
			<input type="text" name="password" value="" />
			<input type="submit" value="登録" />
		</p>
	
	</form>
	${message }
	<p><a href="login" >ログイン画面に戻る</a></p>
	
</body>
</html>