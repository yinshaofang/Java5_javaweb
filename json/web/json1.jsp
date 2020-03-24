<%--
  Created by IntelliJ IDEA.
  User: ysf
  Date: 2020/3/20
  Time: 16:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script>
        function f1() {
           var stu={
               "name":"张三",
               "age":23,
               "gender":"男"
           };
           console.log(typeof stu,stu,stu["name"],stu['age'],stu.gender);
        }
        function f2() {
            var stu={
                "name":{"firstName":"Jim","lastName":"Green"},
                "age":24
            };
            //获取值
            console.log(stu["name"]["firstName"],stu.name.lastName);
        }
        function f3() {
            var stu={
                "name":"admin",
                "age":26,
                "gender":"女"
            };
            var user={
                "id":"01",
                "stu":stu
            };
            console.log(user["stu"]["age"])
        }
        function f4() {
            var stu=[{"name":"李四","age":22},{"name":"Tom","age":24}];
            //在数组中访问json对象
            console.log(stu[0].name,stu[1]["name"]);
        }
         //后台给前台传入字符串 前台可以转成json
        function f5() {
            var user="{\"name\":\"admin\",\"age\":20}";
            console.log(typeof user,user)
            //string转成json   注意:js中推荐使用，1、json安全  2、语法严格
            var u1=JSON.parse(user);
           // var u2=eval("("+user+")");//1、拼接字符串  2、语法松散   3、不安全
            console.log(typeof u1,u1);
            //console.log(typeof u2,u2);
            //语法不严格
            eval("alert('hello')");//解析出字符串 还执行脚本 不安全
            //JSON.parse("alert('hello')");
        }

    </script>
</head>
<body>
   <button onclick="f1();">json用法1</button><br>
   <button onclick="f2();">json用法2</button><br>
   <button onclick="f3();">json用法3</button><br>
   <button onclick="f4();">json用法4</button><br>
   <button onclick="f5();">json用法5:string转为json对象</button><br>
</body>
</html>
