<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 3/27/2023
  Time: 1:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Calculator</h1>
<hr>
<form action="/calculator/" method="post">
    <input type="number" name="fistNumber" value="${first}" step="any">
    <select name="calculation">
        <option value="+">+</option>
        <option value="-">-</option>
        <option value="*">*</option>
        <option value="/">/</option>
    </select>
    <input type="number" name="secondNumber" value="${second}" step="any">
    <button type="submit">=</button>
    <p>${mess}</p>
    <span>${result}</span>

</form>
</body>
</html>
