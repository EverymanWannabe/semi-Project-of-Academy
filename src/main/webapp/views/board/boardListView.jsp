<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MOOSA 소통해요</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    <!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
	<!-- Popper JS -->
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
	<!-- Latest compiled JavaScript -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

	<%@include file = "/views/common/header.jsp" %>
	
	<div class="board-outer">
		<br>
		
		<h2 align="center">게시판</h2>
		<br><br>
		
		<c:if test="${loginUser!=null }">
			<div align="center">
				<a href="" class="btn">글작성</a>
			</div>
		</c:if>
		
		<table class="list-area" align="center" border="1">
			<thead>
				<tr>
					<th width="50">글번호</th>
					<th width="50">카테고리</th>
					<th width="50">제목</th>
					<th width="50">작성일</th>
					<th width="50">작성자</th>
					<th width="50">조회수</th>
					<th width="50">좋아요</th>
				</tr>
			</thead>
			
			<tbody>
				<c:choose>
					<c:when test="${empty list }">
						<tr>
							<td>조회된 게시글이 없습니다.</td>
						</tr>
					</c:when>
					<c:otherwise> <%-- 가져온 리스트 반복문으로 넣을예정 --%>
						<tr>
							<c:forEach var="b" items="${list }">
								<td>${b.boardNo }</td>
								<td>${b.categoryName }</td>
								<td>${b.boardTitle }</td>
								<td>${b.createDate }</td>
								<td>${b.userId }</td>
								<td>${b.count }</td>
								<td>${b.likes }</td>
							</c:forEach>
						</tr>
					</c:otherwise>
				</c:choose>
			</tbody>
		</table>
	
	</div>
	
	<script>
		 $(function(){ //게시글 상세보기로
			$(".list-area>tbody>tr").click(function(){
				var bno = $(this).children().first().text();
				location.href="detail.bo?bno="+$(this).children().first().text();
			});
		});  
	</script>
	

</body>
</html>
















