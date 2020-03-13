package day1.demo2.乱码;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

public class Test extends HttpServlet{


    protected void 字节流响应出现乱码(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        OutputStream out =resp.getOutputStream();
        //12 原因：服务器和浏览器默认是gbk
        System.out.println("服务器已收到".getBytes().length);
        //如果服务器设置了utf-8，则告诉浏览器以utf-8格式解析，否则出现乱码
        resp.setHeader("content-type","text/html;charset=utf-8");
        out.write("服务器已收到".getBytes("utf8"));
    }

    protected void 字符流响应出现乱码(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //原因：服务器默认采用是iso-8859-1编码格式，把字符流转为多个字节，存储在响应缓冲流中

        //方法一：
        //服务器端以utf-8替换iso-8859-1编码格式，把字符流转为多个字节，存储在响应缓冲流中
        //resp.setCharacterEncoding("utf8");
        //告诉浏览器以utf-8格式解析
        //resp.setHeader("content-type","text/html;charset=utf-8");

        //方法二：推荐
        resp.setContentType("text/html;charset=utf8");
        PrintWriter out =resp.getWriter();
        out.write("这是服务器");
        out.write("1231213");
    }

    protected void post请求服务器端出现乱码(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //post请求出现乱码原因：服务器以iso-8859-1格式解析客户端（utf-8）提交的数据，出现乱码
        // 服务器必须设置格式为utf-8
        req.setCharacterEncoding("utf8");
        System.out.println("name="+req.getParameter("username"));

    }

    protected void service1(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("用户名："+req.getParameter("username")+",年龄："+req.getParameter("pass"));
    }
}
