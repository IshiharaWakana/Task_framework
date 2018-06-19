<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>検索結果画面</title>
<link href="/css/commons.css" rel="stylesheet">
</head>
<body>

検索結果

<ul class="thumbnail">

    <c:forEach items="${userlist}" var="user">
<li>
<dl class="clearFix">
<dt class="photo"><a href="#">
<img src="#" alt="Photo" width="140" height="100">
</a></dt>

<dt class="title">
<strong>
	<a href="#">${fn:escapeXml(user.userId)}</a>
</strong>
</dt>

<dd>
${fn:escapeXml(user.userName)}
${fn:escapeXml(user.telephone)}
</dd>

</dl>
</li>
	</c:forEach>

</ul>
<div>
  <a href="menu">メニューに戻る</a>
</div>
</body>
</html>
