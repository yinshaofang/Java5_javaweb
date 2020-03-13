package day2.转发与重定向;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet2 extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("我是Servlet2..");
        //getParameter()获取客户端的name值， getAttribute()获取是setAttribute()
        System.out.println("Servlet2收到参数为：" + req.getAttribute("hello"));

        //服务器端出现500
        //int num=1/0;
        //响应给客户端的信息
        resp.setContentType("text/html;charset=utf8");
        resp.getWriter().write("这是Servlet2发来的响应信息！！");
    }
}
