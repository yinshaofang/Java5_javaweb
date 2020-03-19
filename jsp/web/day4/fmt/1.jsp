<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: ysf
  Date: 2020/3/19
  Time: 11:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
     <%--jstl日期格式--%>
     <%--获取年月日--%>
     <fmt:formatDate value="${now}" type="date"></fmt:formatDate>
     <%--获取年月日时分秒--%>
     <fmt:formatDate value="${now}" type="both"></fmt:formatDate>
     <fmt:formatDate value="${now}" type="time"></fmt:formatDate>
     <%--自定义格式--%>
     <fmt:formatDate value="${now}" pattern="yyyy/MM/dd HH:mm:ss"></fmt:formatDate>

</body>
</html>
