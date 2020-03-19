package day2.filter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ProductList extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("调用service获取购物车信息");
        //转发到具体页面上    /WEB-INF文件夹  不能直接被客户端访问
        req.getRequestDispatcher("/WEB-INF/productList.jsp").forward(req,resp);
    }
}
