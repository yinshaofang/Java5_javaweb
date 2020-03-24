<%--
  Created by IntelliJ IDEA.
  User: ysf
  Date: 2020/3/23
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script>
        //判断邮箱格式是否正确
        function f() {
            var email=info.email.value;
            if(/^.+@.+\.[a-zA-Z]{2,4}$/.test(email)){
                //1112sss@qq.com
                return true;
            }
            alert("邮箱格式不正确！");
            return false;
        }
    </script>
</head>
<body>
<%--注册页面：让myConfig优先进行转发--%>
   <form id="info" method="post" action="${pageContext.request.contextPath}/regist.do" onsubmit="return f();">
     <fieldset>
         <legend>用户注册</legend>
         <label for="name">用户名:</label>
         <input type="text" name="username" id="name" placeholder="请输入用户名" required><br>
         <label for="pass">密码:</label>
         <input type="password" name="password" id="pass" placeholder="请输入用户密码" required><br>
         <label for="myemail">邮箱:</label>
         <input type="text" name="email" id="myemail" placeholder="请输入用户邮箱" required><br>
         <input type="submit" value="注册">
     </fieldset>
   </form>
    <%--从请求对象中获取msg--%>
   <span style="color: red">${requestScope.msg}</span>
</body>
</html>
