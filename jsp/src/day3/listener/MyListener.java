package day3.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MyListener implements ServletContextListener,HttpSessionListener,ServletRequestListener{
    @Override
    public void contextInitialized(ServletContextEvent e) {
         e.getServletContext();
        System.out.println("application对象被创建..");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("application对象被销毁..");
    }


    @Override
    public void sessionCreated(HttpSessionEvent e1) {
            e1.getSession();
           System.out.println("session对象被创建..");//可能执行多次

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        System.out.println("session对象被销毁..");
    }

    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        System.out.println("request对象被创建..");
    }
    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
        System.out.println("request对象被销毁..");
    }
}
