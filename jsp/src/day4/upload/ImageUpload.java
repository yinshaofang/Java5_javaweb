package day4.upload;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.util.Date;

@WebServlet("/day4/upload/image")
@MultipartConfig
public class ImageUpload extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        //获取上传文件
        Part p=req.getPart("myfile");
        //获取所有
        req.getParts();
        String tmp=p.getHeader("Content-Disposition");
        String fileName=tmp.split("\"")[3];//分割数组，获取下标为3的元素
        //设置路径
        String path=this.getServletContext().getRealPath("/"+fileName);//  /代表是根目录下
        System.out.println("文件的真实路径:" + path);
        // 把图片保存jsp项目的根目录下
        p.write(path);

        //把路径设置到session  客户端不能直接访问服务器
        //图片加载不出来？重定向：客户端向服务器端一次请求，服务器发现路径的值是一致，不触发io响应流
        //图片上传成功页面加载不了-->方法：1、服务器端：再重定向（再次刷新），加个时间参数id 可以让浏览器刷新
                                      //2、js通过random生成一个随机数来改变src值，让服务器响应
        req.getSession().setAttribute("src",req.getContextPath()+"/"+fileName+"?id="+new Date().getTime());
        //重定向
        resp.sendRedirect(req.getContextPath()+"/day4/img_upload/img_upload.jsp");
    }
}
