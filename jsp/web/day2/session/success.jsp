<%--
  Created by IntelliJ IDEA.
  User: ysf
  Date: 2020/3/17
  Time: 11:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--jsp本质上是一个servlet  转发时，request和session都是同一个--%>
    <%="req对象中的值："+request.getAttribute("u")%><br>
    <%="session对象中的值："+session.getAttribute("u")%><br>

    <%--jsp中没有重定向概念 模拟重定向--%>
    <a href="<%=request.getContextPath()%>/day2/session/add.jsp">打开新页面</a>
</body>
</html>
