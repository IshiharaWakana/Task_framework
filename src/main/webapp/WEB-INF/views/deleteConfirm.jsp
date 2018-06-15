<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>削除確認画面</title>
<link href="css/commons.css" rel="stylesheet">
</head>
<body>
<p>このデータでよろしいですか？</p>

<form:form action="deleteConfirm" method="post">
  <fieldset>
    <div>
      <label>ID</label>
      <form:input path="id" value="${fn:escapeXml(deleteUser.id)}" readonly />
    </div>
    <div>
      <label>名前</label>
      <form:input path="name" value="${fn:escapeXml(deleteUser.name)}" readonly />
    </div>
    <div>
      <label>TEL</label>
      <form:input path="tel" value="${fn:escapeXml(deleteUser.telephone)}" readonly />
    </div>
  </fieldset>
  <div>
    <form:input path="button" value="削除" />
    <form:input path="button" value="戻る" onclick="location.href='delete'; return false;" />
  </div>
</form:form>
<div>
  <a href="menu.jsp">メニューに戻る</a>
</div>
</body>
</html>
