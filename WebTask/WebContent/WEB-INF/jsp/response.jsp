<%@page import="jp.co.cis.bbs.model.ThreadBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/response.css"/>


<title>コメントページ</title>

</head>

<body>


<header> 
	<h1><span>コメントページ</span></h1>
	
</header>






<main>


    
    <section class="side">
        <h3>(( 各メニュー ))</h3>
		<p>削除したいコメント</p>
		<p>コメントの名前変更</p>
		<p>コメントの内容変更</p>
		<p><a href="aa">トピックに戻る</a></p>
    </section>
    
    <section class="main_content">
    <form action="ResponseServlet" method="post" >
	<!-- トピック表示欄 -->
	

		<p><input type="hidden" name="id" value="${id}" /></p>
		
	
	<hr />
	<!-- トピック表示欄終了 -->
	
	<p>${message}</p>
	
	<h2>コメントの追加欄</h2>
	<div class="box11">
		<p>名前:<input type="text" name="r_name" value="" /></p>
		<p>コメント内容</p>
		<p><textarea name="r_coment" rows="5" cols="60"></textarea></p>
		<p><input type="submit" value="  画像添付  " class="btn-flat-simple" />
		   <input type="submit" value="  動画添付  " class="btn-flat-simple" />
		   <input type="submit" name="btn" value="   投稿   " class="btn-flat-simple" />
		</p>
 	</div>
 	
 	</form>
 	
 	<c:if test="${not empty  comentList}">
 	<h2>コメント投稿欄</h2>

			<c:forEach var="coment" items="${comentList}">
				
				
				
				<div class="box11">
					<p><div class="id">NO.${coment.r_id}</div></p>
					<p>
						ニックネーム:${coment.r_name}
					</p>

					<p>
						${coment.r_coment }
					</p>

				</div>

			</c:forEach>
	</c:if>
	
    </section>
</main>

<footer>
<hr />
<p><a href="aa">トピックに戻る</a></p>
</footer>

</body>

</html>