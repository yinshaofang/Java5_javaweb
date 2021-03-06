package day4.validcode;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

@WebServlet("/day4/validcode/*")
public class Test extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         String path=req.getRequestURI();
         if (path.contains("show")){
             getImageAndSend(req,resp);
         }else if(path.contains("check")){
             //检查验证码是否正确
         }else{
            resp.sendRedirect(req.getContextPath()+"/day4/valid_code/code.jsp");
         }
    }

    private void getImageAndSend(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //创建随机对象
        Random r =new Random();

        //1.创建一张图片
        BufferedImage img =new BufferedImage(70,30,BufferedImage.TYPE_INT_RGB);

        //2. 创建画笔
        Graphics g=img.getGraphics();

        //3.创建背景
        g.fillRect(0,0,70,30);

        //4.设置画笔颜色 (256,256,256)
        g.setColor(new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256)));

        //5.设置字体 样式  大小
        g.setFont(new Font("宋体",Font.ITALIC+Font.BOLD,18));

        //6.随机产生字符
        String code=getCode(r);
        req.getSession().setAttribute("code",code);

        //7.将生成的随机数写入画板
        g.drawString(code,5,20);

        //8.画4条干扰线
        int x1,y1;//起点
        int x2,y2;//终点
        for (int i=0;i<4;i++){
            x1=r.nextInt(50);
            x2=r.nextInt(50);
            y1=r.nextInt(25);
            y2=r.nextInt(25);
            g.drawLine(x1,y1,x2,y2);
        }

        //9.发送图片
        ImageIO.write(img,"JPEG",resp.getOutputStream());
    }

    private String getCode(Random r) {
        String code="";
        for(int i=0;i<4;i++){
            int c=r.nextInt(3);
            if(c==0){
                code+=(char)('0'+r.nextInt(10));
            }else if(c==1){
                code+=(char)('a'+r.nextInt(26));
            }else{
                code+=(char)('A'+r.nextInt(26));
            }
        }

        System.out.println("产生验证码:" + code);
        return code;
    }
}
