<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登録結果確認画面</title>
<link href="css/commons.css" rel="stylesheet">
</head>
<body>
<p>実行者：${fn:escapeXml(user.admin_name)}</p>
<p>正常に登録されました</p>
<form action="select">
  <form:input path="id" />
  <form:input path="submit" />
</form>
<div>
  <a href="menu">メニューに戻る</a>
</div>
</body>
</html>
