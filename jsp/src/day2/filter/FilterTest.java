package day2.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class FilterTest implements Filter{
    FilterConfig cfg;
    @Override //服务器启动，自动产生Filter实例对象，并调用init
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器的init方法被执行。。");
        this.cfg=filterConfig;

    }

    @Override//处理过滤      HttpServletRequest是ServletRequest子接口
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        System.out.println("do filter被执行...");
        String ecode =cfg.getInitParameter("encode");
        System.out.println("编码设置为：" + ecode);

        //过滤器解决编码  post
        req.setCharacterEncoding(ecode);
        HttpServletRequest request = (HttpServletRequest) req;

        String name=(String)request.getSession().getAttribute("username");
        //判断是否登录
        if(name==null){
            //返回登录页面
            req.getRequestDispatcher("/day2/filter/login.jsp").forward(req,resp);
        }else{
            //已登录
            chain.doFilter(req,resp);//必须通过一个或多个过滤器，才能访问Servlet
        }
    }

    @Override
    public void destroy() {
        System.out.println("============过滤器被销毁=============");
    }
}
