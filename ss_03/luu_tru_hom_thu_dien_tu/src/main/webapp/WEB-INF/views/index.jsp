<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <style>
        th {
            width: 200px;
        }
    </style>
</head>
<body>

<h1>Settings</h1>
<hr>
<form:form action="/email/form" method="post" modelAttribute="setting">
    <table style="font-size: 20px" class="table table-dark table-striped">
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
            <td><form:textarea type="text" path="signature"/></td>
        </tr>
        <tr>
            <th></th>
            <td>
                <button type="submit" class="btn btn-outline-warning">Update</button>
                <input type="reset" value="Cancel" class="btn btn-outline-warning">
            </td>
        </tr>
    </table>
</form:form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
</body>
</html>