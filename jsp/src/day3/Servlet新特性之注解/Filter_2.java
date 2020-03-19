package day3.Servlet新特性之注解;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/day3/ann/servletdemo")
public class Filter_2 implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("我是过滤器2----begin---");
        chain.doFilter(req,resp);
        System.out.println("我是过滤器2----end---");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
