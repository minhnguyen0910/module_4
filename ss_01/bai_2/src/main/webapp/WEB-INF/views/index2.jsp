<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 3/27/2023
  Time: 1:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/dictionary/search/">
    <span>nhập</span>
    <input type="text" name="tiengViet" value="${name}">
    <button type="submit">Kết quả</button>
    <p>${result}</p>
</form>

</body>
</html>
