package day4.upload;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;

@WebServlet("/day4/upload/file")
@MultipartConfig //必须加
public class FileUpload extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         req.setCharacterEncoding("utf-8");
         //获取上传文件
        Part p=req.getPart("myfile");
        //获取所有
        req.getParts();
        String tmp=p.getHeader("Content-Disposition");
        String fileName=tmp.split("\"")[3];//分割数组，获取下标为3的元素
        //保存
        p.write("C:\\Users\\ysf\\Desktop\\JavaWeb\\upload\\"+fileName);
        System.out.println(tmp);
        //重定向
        resp.sendRedirect(req.getContextPath()+"/day4/file_upload/file_upload.jsp");
    }
}
