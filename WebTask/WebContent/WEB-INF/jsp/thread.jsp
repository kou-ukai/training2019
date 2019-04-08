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
<link rel="stylesheet" href="css/threadlist.css">
</head>
<body>
	<h1>CISBBS</h1>
	<hr />

	<c:if test="${not empty message }">
		<p>${message }</p>
	</c:if>
	<form action="bb" method="get">
		<c:if test="${not empty threadList }">
			<c:forEach var="thread" items="${threadList }">
				<div class="card">
					<a href="bbb"> </a>
					<div class="card-content">
						<div class="media-content">

							<p class="title is-4">
								<input type="hidden" name="id" value=thread.id /> ${thread.title }
							</p>
						</div>
						<div class="content">
							<time>${thread.time }</time>
						</div>
					</div>
				</div>
			</c:forEach>
		</c:if>
	</form>

	<form action="aa" method="post">
		<input type="submit" value="新しく掲示板を作る" />
	</form>
</body>
</html>