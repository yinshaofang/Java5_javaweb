package day1.demo1;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.FileOutputStream;
import java.util.List;

public class Test {
    public static void main(String[] args) throws Exception {
        //parse("d1.xml");
        createXML();
    }


      //创建XML
    private static void createXML() throws Exception {
          Document doc = DocumentHelper.createDocument();

          //增加根节点
          Element phones=doc.addElement("phones");

          //增加子节点
          Element p1=phones.addElement("phone");
          Element name1=p1.addElement("name");
          Element size1=p1.addElement("size");

          Element p2=phones.addElement("phone");
          Element name2=p2.addElement("name");
          Element size2=p2.addElement("size");

          //给子节点添加属性
          p1.addAttribute("id","01");
          name1.setText("iPhone6");
          size1.setText("4.7寸");

          p2.addAttribute("id","02");
          name2.setText("iPhone6 Plus");
          size2.setText("5.5寸");

          //生成xml
        OutputFormat fmt=OutputFormat.createPrettyPrint();
        XMLWriter writer =new XMLWriter(new FileOutputStream("phones.xml"),fmt);
        writer.write(doc);
        writer.close();

    }

    //解析
    private static void parse(String name) throws DocumentException {
        //1、创建解析器
        SAXReader r =new SAXReader();
        //读取类所在路径
        Document doc =r.read(Test.class.getResourceAsStream(name));
        System.out.println(doc.asXML());//作为字符串输出

        //获取根节点
        Element root =doc.getRootElement();
        //获取子节点
        List<Element> childs=root.elements();

        //获取节点下标签为stu的全部子节点
        System.out.println(root.elements("stu"));
        System.out.println("********************************************");

        //获取第一个stu
        System.out.println(root.element("stu"));
        Element first=childs.get(0);
        System.out.println("获取stu标签中属性为name的值:" + first.attributeValue("name"));//张三
        System.out.println("获取stu标签名为:" + first.getName());//stu
        System.out.println("获取stu标签中间的内容:" + first.element("age").getTextTrim());
    }


}
