<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">



<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"  > 
<meta http-equiv="content-style-type" content="text/css" />
<link rel="stylesheet" type="text/css" href="/response.css"/>


<title><%-- トピック名 --%>コメントページ</title>

</head>

<body>

<div class="back" >


	<h1><%-- スレッド名 --%>コメントページ</h1>
	
	<hr />
	
	<form action="ResponseServlet" method="post" >
	<!-- トピック表示欄 -->
	<table border="1">
	
		<tr><td><%-- スレッド番号 --%><input type="text" name="t_id" value="1" /></td></tr>
		<tr><td><%-- スレッド名 --%></td></tr>
		<tr><td><%-- スレッド内容 --%></td></tr>
		<tr><td><%-- 戻るリンク（スレッドへ） --%></td></tr>
		
	</table>
	<hr />
	<!-- トピック表示欄終了 -->
	
	<p>${message}</p>
	
	<!-- コメント追加記入欄 -->
	
		<table border="1">
		
			<tr>
				<th>ニックネーム</th>
				<td><input type="text" name="r_name" size="20" /></td>
			</tr>

 			<tr>
				<th>コメント</th>
				<td><textarea name="r_coment" rows="10" cols="40"></textarea></td>
 			</tr>
	 	</table>
 
 		<input type="submit" name="btn" value="投稿" />
 		
	</form>
	<hr />
	<!-- コメント追加記入欄　終了 -->
	
	
	
	<!-- コメント投稿内容欄 -->
	
	<c:if test="${not empty  comentList}">
	
		<div id="bg_main" class="response" >
	
			<c:forEach var="coment" items="{comentList}">
	
				<table border="1">
	
					<tr>
						<th>ニックネーム</th>
						<td>${comet.getName()}</td>
					</tr>
	
					<tr>
						<th>コメント</th>
						<td>${comet.getComent() }</td>
					</tr>
	
				</table>
	
			</c:forEach>
		</div>
	</c:if>
	
	
	<!-- コメント投稿内容欄終了 -->
</div>


</body>
</html>