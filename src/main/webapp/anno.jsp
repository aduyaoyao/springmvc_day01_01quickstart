<%--
  Created by IntelliJ IDEA.
  User: 杜瑶
  Date: 2019/7/21
  Time: 20:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--常用的注解--%>
    <a href="anno/testRequestParam?username=hehe">RequestParam</a>

    <br>
    <form action="anno/testRequestBody" method="post">
    姓名：<input type="text" name="username"><br>
    年：<input type="text" name="age"><br>
    <input type="submit" value="提交"><br>
    </form>

    <a href="anno/testPathVariable/10">PathVariable</a>

    <br>
    <a href="anno/testRequestHeader">RequestHeader</a>

    <a href="anno/testCookieValue">CookieValue</a>


    <form action="anno/testModeAttribute" method="post">
        姓名：<input type="text" name="uname"><br>
        年：<input type="text" name="age"><br>
        <input type="submit" value="提交"><br>
    </form>

    <a href="anno/testSessionAttributes">SessionAttributes</a>
    <a href="anno/testget">Sessionget</a>
    <a href="anno/testdelete">Sessiondelete</a>
</body>
</html>
