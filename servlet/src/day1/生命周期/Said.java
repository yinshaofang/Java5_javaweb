package day1.生命周期;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

//servlet对象是单例   tomcat服务器是一个容器 里面可以装很多servlet对象
public class Said extends HttpServlet {
    @Override  //对象产生时只调用一次初始化
    public void init() throws ServletException {
        System.out.println("servlet对象调用init()方法....");
    }

    @Override //调用多次service方法
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("servlet对象调用service方法....");
        //获取web.xml中的黑名单
        //获取ServletConfig对象
        ServletConfig config =this.getServletConfig();
        System.out.println(config.getInitParameter("blackIP1"));
        Enumeration<String> e =config.getInitParameterNames();
        while (e.hasMoreElements()){
            String name=e.nextElement();
            String value=config.getInitParameter(name);
            System.out.println(name + "=" + value);
        }
        System.out.println("用户IP：" + req.getRemoteAddr());

    }

    @Override
    public void destroy() {
        System.out.println("---------servlet对象销毁-----------");
    }
}
