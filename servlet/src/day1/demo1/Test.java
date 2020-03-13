package day1.demo1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Test extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //解决乱码
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter pw =resp.getWriter();
        pw.write(req.getRemoteAddr()+",端口号："+req.getRemotePort()+"访问");
    }
}
