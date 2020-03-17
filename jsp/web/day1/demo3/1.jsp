<%--
  Created by IntelliJ IDEA.
  User: ysf
  Date: 2020/3/16
  Time: 15:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>this is 1.jsp</h1>
<%
  int i=20;
%>
<%--include指令 只编译一次和执行--%>
<%--<%@ include file="2.jsp" %>--%>

<%--include动作 一次请求 共享一个request对象 在编译上多次执行--%>
<jsp:include page="2.jsp"></jsp:include>
<%--获取2.jsp中的结果--%>
<%=request.getAttribute("name")%>
<%--i=20--%>
<%=i%>

</body>
</html>
