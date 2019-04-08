<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/response.css"/>


<title><%-- トピック名 --%>コメントページ</title>

</head>

<body>



	<header>
	<h1><span><%-- スレッド名 --%>コメントページ</span></h1>
	<div class="box1"><p>趣味　趣味　趣味　趣味　趣味　趣味　趣味　趣味</p></div>
	</header>

<div id="contents">
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
	<div class="box4">
		<p>名前:<input type="text" name="name" value="" /></p>
		<p>コメント内容</p>
		<p><textarea name="r_coment" rows="10" cols="40"></textarea></p>
		<p><input type="submit" value="  画像添付  " class="btn-flat-simple" />
			<input type="submit" value="  動画添付  " class="btn-flat-simple" />
			<input type="submit" value="   投稿   " class="btn-flat-simple" />
		</p>
 	</div>

	</form>
	<!-- コメント追加記入欄　終了 -->



	<!-- コメント投稿内容欄 -->

	<c:if test="${not empty  comentList}">

			<c:forEach var="coment" items="{comentList}">

				<div class="box11">

					<p>
						ニックネーム:${comet.getName()}
					</p>

					<p>
						${comet.getComent() }
					</p>

				</div>

			</c:forEach>
	</c:if>


	<!-- コメント投稿内容欄終了 -->
</div>


</body>
</html>