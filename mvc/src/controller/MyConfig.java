package controller;

import mvc.annotation.Configuration;
import mvc.config.ResourceHandlerRegistry;
import mvc.config.WebConfigurer;

//mvc小框架原理:如果在浏览器上输入/hello.do,转发器优先转发到/WEB-INF/pages/hello.jsp
//转发器作用：只是进行转发（优先级最高），不做任何的业务处理
@Configuration //mvc小框架中规定的注解
public class MyConfig extends WebConfigurer{

    @Override
    public void addViewControllers(ResourceHandlerRegistry rg) {
          //map集合
        rg.addViewController("hello","/hello")
          //转发到登录页面
        .addViewController("login","/login");
    }
}

