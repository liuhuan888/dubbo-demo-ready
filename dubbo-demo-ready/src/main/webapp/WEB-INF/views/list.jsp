<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/index2.css">
</head>
<body>
	<form action="list" method="post">
		发表时间:<input type="date" name="start" value="${start}">-<input type="date" name="end" value="${end}">
		<select name="field">
			<option value="null">请选择</option>
			<option value="created" <c:if test="${field=='created'}">selected="selected"</c:if>>发表时间</option>
			<option value="user_id" <c:if test="${field=='user_id'}">selected="selected"</c:if>>作者</option>
			<option value="commentCnt" <c:if test="${field=='commentCnt'}">selected="selected"</c:if>>评论数量</option>
		</select>
		<input type="hidden" name="pageNum" id="pageNUm">
		<input type="submit" value="查询">
	</form>
	<table>
		<tr>
			<td>标题</td>
			<td>所属栏目</td>
			<td>所属分类</td>
			<td>作者</td>
			<td>点击次数</td>
			<td>文章状态</td>
			<td>发布时间</td>
			<td>更新时间</td>
			<td>评论数量</td>
		</tr>
		<c:forEach items="${pageInfo.list}" var="a">
			<tr>
				<td>${a.title}</td>
				<td>${a.channelName}</td>
				<td>${a.categoryName}</td>
				<td>${a.nickname}</td>
				<td>${a.hits}</td>
				<td>
					<c:if test="${a.status==0}">未审核</c:if>
					<c:if test="${a.status==1}">审核通过</c:if>
					<c:if test="${a.status==2}">草稿</c:if>
					<c:if test="${a.status==-1}">审核未通过</c:if>
				</td>
				<td>${a.created}</td>
				<td>${a.updated}</td>
				<td>${a.commentCnt}</td>
			</tr>
		</c:forEach>
		<tr>
			<Td colspan="10">
				<button onclick="fenye(1)">首页</button>
				<button onclick="fenye(${pageInfo.prePage==0?1:pageInfo.prePage})">上一页</button>
				<button onclick="fenye(${pageInfo.nextPage==0?pageInfo.pages:pageInfo.nextPage})">下一页</button>
				<button onclick="fenye(${pageInfo.pages})">尾页</button>
				第${pageInfo.pageNum}/${pageInfo.pages},共${pageInfo.total}条
			</Td>
		</tr>
	</table>
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
	function fenye(pageNum) {
		$("#pageNUm").val(pageNum);
		$("form").submit();
	}
</script>
</body>
</html>