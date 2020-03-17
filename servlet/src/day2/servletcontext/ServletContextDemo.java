package day2.servletcontext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Enumeration;

/**
 * 1、一个应用只有一个ServletContext全局对象，可以管理多个Servlet对象，实现多个Servlet对象共享数据
 * 2、Servlet对象之间相互独立的，不会共享数据，如果在转发时，可以通过HttpRequest对象(前提是一次请求)，设置和获取属性
 * 3、ServletContext作用域：全局  相比Request对象，作用域是一次请求
 * 4、生命周期：tomcat启动就产生，Tomcat关闭就销毁
 */



public class ServletContextDemo extends HttpServlet{

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //String name;  //**服务器端的servlet对象来同时服务多个客户端时，尽量不要设置属性，多线程前提下，共享属性**

        //获取ServletContext对象
        ServletContext ctx=this.getServletContext();

        //作用1:获取应用路径  /servlet
        System.out.println(ctx.getContextPath());
        System.out.println(req.getContextPath());//理解为request对象通过获取ServletContext全局对象，来获取getContextPath()

        //作用2:获取全局参数
        //注意：在web.xml中配置全局参数，Tomcat启动时扫描web.xml文件，把这些参数放到ServletContext对象中
        Enumeration<String> e=ctx.getInitParameterNames();
        while (e.hasMoreElements()){
            String key=e.nextElement();//获取key值
            System.out.println("名字:" + key + ",值：" + ctx.getInitParameter(key));
        }

        //作用3:作为域对象  作用域是全局的
        //1.重定向中的数据设置
        resp.sendRedirect(ctx.getContextPath()+"/day2/context/scdemo?name=admin&age=22");

        //2、设置
        String[] arr={"username","password"};
        ctx.setAttribute("user",arr);
        String[] users=(String[]) ctx.getAttribute("user");
        for(String u:users){
            System.out.println(u);

        }
        //删除指定
        ctx.removeAttribute("sss");

        //作用4 读取资源文件  最终在web上的目录  \WEB-INF\classes\1.txt
        String path =ctx.getRealPath("\\WEB-INF\\classes\\1.txt");
        System.out.println("文件最终路径:"+path);

        InputStream is =ctx.getResourceAsStream("\\WEB-INF\\classes\\1.txt");
        InputStreamReader isr=new InputStreamReader(is);
        BufferedReader br=new BufferedReader(isr);
        System.out.println(br.readLine());// 按行读取

    }
}
