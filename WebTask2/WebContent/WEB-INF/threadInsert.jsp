<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>BBS</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/bulma/0.7.4/css/bulma.min.css">
<link rel="stylesheet" href="threadInsert.css">
</head>
<body>
	<h1>掲示板登録画面</h1>
	<hr />
	<hr />
	<p class="direct">掲示板のタイトルを入力して登録ボタンを押してください</p>
	<form action="insert" method="get">
		<table>

			<tr>
				<td>掲示板タイトル</td>
				<td><input type="text" name="title" value="" /></td>
			</tr>
			<tr>
				<td class="insert" colspan="2"><input type="submit" value="登録" /></td>
			</tr>
		</table>
	</form>
	<c:if test="${not empty message }">
		<p class="message">${message }</p>
	</c:if>
	<a href="aa">掲示板一覧に戻る</a>

</body>
</html>