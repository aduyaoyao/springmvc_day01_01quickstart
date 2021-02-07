<%--
  Created by IntelliJ IDEA.
  User: 杜瑶
  Date: 2019/7/21
  Time: 16:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--&lt;%&ndash;请求参数的绑定&ndash;%&gt;--%>
    <%--<a href="param/testParam?username=hehe&password=123456">请求参数的绑定</a>--%>



    <%--javabean的封装--%>
    <%--<form action="param/saveAccount" method="">--%>
        <%--姓名：<input type="text" name="username"><br>--%>
        <%--密码：<input type="text" name="password"><br>--%>
        <%--金额：<input type="text" name="money"><br>--%>
        <%--用户姓名：<input type="text" name="user.uname"><br>--%>
        <%--用户金额：<input type="text" name="user.age"><br>--%>
        <%--<input type="submit" value="提交"><br>--%>
    <%--</form>--%>


    <%--&lt;%&ndash;将数据封装在Account类中，类中存在list集合和map的集合&ndash;%&gt;--%>
    <%--<form action="param/saveAccount" method="">--%>
        <%--姓名：<input type="text" name="username"><br>--%>
        <%--密码：<input type="text" name="password"><br>--%>
        <%--金额：<input type="text" name="money"><br>--%>

        <%--用户姓名：<input type="text" name="list[0].uname"><br>--%>
        <%--用户金额：<input type="text" name="list[0].age"><br>--%>

        <%--用户姓名：<input type="text" name="map['one'].uname"><br>--%>
        <%--用户金额：<input type="text" name="map['one'].age"><br>--%>
        <%--<input type="submit" value="提交"><br>--%>
    <%--</form>--%>


    <%--&lt;%&ndash;自定义类型转换&ndash;%&gt;--%>
    <%--<form action="param/saveUser" method="">--%>
        <%--姓名：<input type="text" name="uname"><br>--%>
        <%--年：<input type="text" name="age"><br>--%>
        <%--生日：<input type="text" name="date"><br>--%>

        <%--<input type="submit" value="提交"><br>--%>
    <%--</form>--%>

    <a href="param/testServlet">Servlet原生的api</a>
</body>
</html>
