package day3.listener;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class Test extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("测试监听器...");
        HttpSession session =req.getSession();//创建session对象
        //销毁session对象
        //session.invalidate();
        session.setMaxInactiveInterval(15);
    }
}
