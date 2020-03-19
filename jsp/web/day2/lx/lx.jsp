<%--
  Created by IntelliJ IDEA.
  User: ysf
  Date: 2020/3/17
  Time: 10:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="<%=request.getContextPath()%>/jquery.js"></script>
    <script src="<%=request.getContextPath()%>/jquery.cookie.js"></script>
    <script>
        function get() {
            var key=$("#key").val();
            var value=$.cookie(key);
            msg.innerHTML=value;
        }
        function set() {
            var key=$("#key").val();
            var value=$("#value").val();
            $.cookie(key,value);
        }
    </script>
</head>
<body>
   <input type="text" id="key" placeholder="请输入key"><br>
   <input type="text" id="value" placeholder="请输入value"><br>
    <button onclick="get();">获取</button>
    <button onclick="set();">设置</button><br>
    <span id="msg" style="color: red"></span>
</body>
</html>
