<%--
  Created by IntelliJ IDEA.
  User: yzm
  Date: 2021/5/18
  Time: 9:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <form action="testRest/10" method="POST">
            <input  type="hidden" name="_method" value="PUT">
            <input type="submit" value="testPUT">
        </form>
        <br/>
        <form action="testRest/10" method="POST">
            <input  type="hidden" name="_method" value="DELETE">
            <input type="submit" value="testDELETE">
        </form>
        <br/>
        <form action="testRest/10" method="POST">
            <input type="submit" value="testPOST">
        </form>
        <br/>
        <form action="testRest/10" method="GET">
            <input type="submit" value="testGET">
        </form>
</body>
</html>
