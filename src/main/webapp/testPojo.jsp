<%--
  Created by IntelliJ IDEA.
  User: yzm
  Date: 2021/5/18
  Time: 19:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <form action="getParam3.do" method="get">
        <p>姓名：<input type="text" name="pname"></p>
        <p>年龄：<input type="text" name="page"></p>
        <p>性别：
            <input type="radio" name="gender" value="1">男
            <input type="radio" name="gender" value="0">女
        </p>
        <p>爱好：
            <input type="checkbox" name="hobby" value="1">篮球
            <input type="checkbox" name="hobby" value="2">足球
            <input type="checkbox" name="hobby" value="3">乒乓球
        </p>
        <p>生日：<input type="text" name="birthdate"></p>

        宠物list：
        <p>宠物1：
            名字：<input type="text" name="pets[0].name">类型：<input type="text" name="pets[0].pet">
        </p>
        <p>宠物2：
            名字：<input type="text" name="pets[1].name">类型：<input type="text" name="pets[1].pet">
        </p>

        宠物Map：
        <p>宠物1：
            名字：<input type="text" name="petMap['a'].name">类型：<input type="text" name="petMap['a'].pet">
        </p>
        <p>宠物2：
            名字：<input type="text" name="petMap['b'].name">类型：<input type="text" name="petMap['b'].pet">
        </p>


        宠物：
        <p>
            名字：<input type="text" name="pet.name">类型：<input type="text" name="pet.pet">
        </p>
        <input type="submit">
    </form>
</body>
</html>
