<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><%-- トピック名 --%>コメントページ</title>
</head>
<body>
	<h1><%-- トピック名 --%>コメントページ</h1>
	
	<hr />
	
	
	
	<table border="1">
		<tr><td><%-- トピック番号 --%></td></tr>
		<tr><td><%-- トピック名 --%></td></tr>
		<tr><td><%-- トピック名内容 --%></td></tr>
		<tr><td><%-- 戻るリンク（トピックへ） --%></td></tr>
	</table>
	
	
	<%-- formタグ追加 --%>
	<table border="2">
		<tr><td><%=request.getAttribute("comentNum") %></td></tr>
		
		<tr><td><%=request.getAttribute("userName") %></td></tr>
		
		
		
		<tr>
			<td>
			<input type="text" name="coment" value="" />
			</td>
		<tr>
		
		<tr>
			<td>写真投稿</td>
			<td>動画投稿</td>
		</tr>
		
		<tr>
			<td>
			<input type="submit" value="投稿"/>
			</td>
		</tr>
		
	</table>
	<%-- formタグ終了 --%>
	
	
	<%-- コメント投稿内容欄 --%>
	<%ArrayList<String> comentList=new ArrayList<>(); %>
	
	<%for(int i=0;i<comentList.size();i++){ %>
	
	<table border="3">
	
	<tr><td>コメントNO</td></tr>
	
	<tr><td>ユーザーname</td></tr>
	
	<tr><td>コメント内容</td></tr>
	
	</table>

	<%} %>
	
</body>
</html>