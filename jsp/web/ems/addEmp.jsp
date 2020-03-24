<%--
  Created by IntelliJ IDEA.
  User: ysf
  Date: 2020/3/19
  Time: 14:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>增加员工</title>
</head>
<body>
    <h1>添加员工</h1>
    <hr>
    <form action="${pageContext.request.contextPath}/add.emp" method="post">
        <fieldset>
            <legend>添加员工信息</legend>
            <label for="uname">员工姓名:</label>
            <input type="text" id="uname" name="name" placeholder="请输入姓名"><br>
            <label for="usal">员工工资:</label>
            <input type="number" id="usal" name="salary" placeholder="请输入薪资"><br>
            <label >员工性别:</label>
            <input type="radio" name="gender" value="男">男&nbsp;&nbsp;
            <input type="radio" name="gender" value="女">女<br>
            <label for="uedu">员工学历:</label>
            <select id="uedu" name="edu">
               <option value="-1">--请选择--</option>
               <option>大专</option>
               <option>本科</option>
               <option>研究生</option>
               <option>博士</option>
            </select><br>
            <label>兴趣爱好:</label>
            <input type="checkbox" name="hobbies" value="旅游">旅游&nbsp;&nbsp;
            <input type="checkbox" name="hobbies" value="电影">电影&nbsp;&nbsp;
            <input type="checkbox" name="hobbies" value="游戏">游戏&nbsp;&nbsp;
            <input type="checkbox" name="hobbies" value="篮球">篮球<br>
            <input type="submit" value="添加">&nbsp;&nbsp;
            <input type="reset" value="重填"><br>
        </fieldset>
    </form>
</body>
</html>
