<%--
  Created by IntelliJ IDEA.
  User: ysf
  Date: 2020/3/17
  Time: 15:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--<form action="<%=request.getContextPath()%>/day2/url/test">--%>
    <%--encodeUrl方法：提交按钮只创建一次session对象（客户端禁用cookie,防止多次提交到服务器，再重新创建session对象）--%>
    <form action="<%=response.encodeURL(request.getContextPath()+"/day2/url/test")%>">
        用户名：<input type="text" name="username" placeholder="输入用户名"><br>
               <input type="submit" value="登录">
    </form>
</body>
</html>
