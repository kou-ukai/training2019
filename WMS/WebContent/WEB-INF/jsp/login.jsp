<%@page import="com.sun.xml.internal.ws.util.StringUtils"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>倉庫管理システム</title>
</head>
<body>
	<form action="./Login">
		<div>
			<label>ログイン</label>
		</div>
		<div>
			<label id="errorMessage" style="color: red;"><%=request.getAttribute("message").toString()%></label>
		</div>
		<div>
			<label>ユーザID</label> <input type="text" name="userId" />
		</div>
		<div>
			<label>パスワード</label> <input type="text" name="password" />
		</div>
		<div>
			<input type="submit" name="login" value="ログイン" />
		</div>
	</form>
</body>
</html>