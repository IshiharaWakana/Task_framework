<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン画面</title>
<link href="css/commons.css" rel="stylesheet">
</head>
<body>
<c:if test="${not empty errmsg}">
  <p class="error">${fn:escapeXml(errmsg)}</p>
</c:if>

<form: form action="post" modelAttribute="login"/>
  <fieldset>
    <div>
      <label>ID</label>
      <form:input path="id" />
    </div>
    <div>
      <label>PASS</label>
      <form:password path="password" />
    </div>
  </fieldset>
  <form:button name="login">ログイン"</form:button>
</form:form action>
<div>
  <a href="index.jsp">TOP画面に戻る</a>
</div>
</body>
</html>
