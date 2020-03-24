<%--
  Created by IntelliJ IDEA.
  User: ysf
  Date: 2020/3/19
  Time: 15:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>修改员工页面</title>
</head>
<body>
<h1>修改员工</h1>
<hr>
<form action="${pageContext.request.contextPath}/modify.emp" method="post">
    <fieldset>
        <legend>修改员工信息</legend>
        <label for="uid">员工编号:</label>
        <input type="text" id="uid" name="id" value="${emp.id}" readonly><br>
        <label for="uname">员工姓名:</label>
        <input type="text" id="uname" name="name" value="${emp.name}"><br>
        <label for="usal">员工工资:</label>
        <input type="number" id="usal" name="salary" value="${emp.salary}"><br>
        <label >员工性别:</label>
        <input type="radio" name="gender" <c:if test="${emp.gender=='男'}">checked</c:if> value="男">男&nbsp;&nbsp;
        <input type="radio" name="gender" <c:if test="${emp.gender=='女'}">checked</c:if> value="女">女<br>
        <label for="uedu">员工学历:</label>
        <select id="uedu" name="edu">
            <option value="-1">--请选择--</option>
            <option <c:if test="${emp.edu=='大专'}">selected</c:if>>大专</option>
            <option <c:if test="${emp.edu=='本科'}">selected</c:if>>本科</option>
            <option <c:if test="${emp.edu=='研究生'}">selected</c:if>>研究生</option>
            <option <c:if test="${emp.edu=='博士'}">selected</c:if>>博士</option>
        </select><br>
        <label>兴趣爱好:</label>
        <input type="checkbox" name="hobbies" <c:if test="${emp.hobbies.contains('旅游')}">checked</c:if> value="旅游">旅游&nbsp;&nbsp;
        <input type="checkbox" name="hobbies" <c:if test="${emp.hobbies.contains('电影')}">checked</c:if> value="电影">电影&nbsp;&nbsp;
        <input type="checkbox" name="hobbies" <c:if test="${emp.hobbies.contains('游戏')}">checked</c:if> value="游戏">游戏&nbsp;&nbsp;
        <input type="checkbox" name="hobbies" <c:if test="${emp.hobbies.contains('篮球')}">checked</c:if> value="篮球">篮球<br>

        <input type="submit" value="添加">&nbsp;&nbsp;
        <input type="reset" value="重填"><br>
    </fieldset>
</form>
</body>
</html>
