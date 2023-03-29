<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 3/27/2023
  Time: 1:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Settings</h1>
<form:form action="/email/form" method="post" modelAttribute="setting">
    <table>
        <tr>
            <th>Language</th>
            <td><form:select path="language">
                <form:options items="${language}"></form:options>
            </form:select>

            </td>
            </td>
        </tr>
        <tr>
            <th>Size</th>
            <td><span>Show</span><form:select path="size">
                <form:options items="${size}"></form:options>
            </form:select><span>emails per page</span>
            </td>
        </tr>
        <tr>
            <th>Spams filter</th>
            <td><form:checkbox path="spamFilter" value="true"></form:checkbox><span>enable spam filter</span></td>
        </tr>
        <tr>
            <th>Signature</th>
            <td><form:input type="text" path="signature"/></td>
        </tr>
        <tr>
            <th></th>
            <td>
                <button type="submit">Update</button>
                <input type="reset" value="Cancel">
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
