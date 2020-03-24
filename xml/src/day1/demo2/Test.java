package day1.demo2;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.FileOutputStream;
import java.util.List;

public class Test {
    public static void main(String[] args) throws Exception {
        //add();
        //delete();
        update();
    }
      //修改
    private static void update() throws Exception{
        SAXReader reader= new SAXReader();
        Document doc=reader.read(Test.class.getClassLoader().getResourceAsStream("scores.xml"));
        Element root=doc.getRootElement();

        Element s2= (Element) root.elements().get(1);
        //修改
        s2.element("name").setText("段康");
        s2.element("gender").setText("男");

        OutputFormat fmt=OutputFormat.createPrettyPrint();
        String path="xml/src/scores.xml";
        XMLWriter writer =new XMLWriter(new FileOutputStream(path),fmt);
        writer.write(doc);
        writer.close();
    }


    //删除
    private static void delete() throws Exception{
        SAXReader reader= new SAXReader();
        Document doc=reader.read(Test.class.getClassLoader().getResourceAsStream("scores.xml"));
        Element root=doc.getRootElement();

        Element s2= (Element) root.elements().get(1);
        //删除
        s2.elements().remove(0);//删除下标为0

        Element score=s2.element("score");
        s2.remove(score);

        OutputFormat fmt=OutputFormat.createPrettyPrint();
        String path="xml/src/scores.xml";
        XMLWriter writer =new XMLWriter(new FileOutputStream(path),fmt);
        writer.write(doc);
        writer.close();
    }

    //增加
    private static void add() throws Exception {
        SAXReader reader= new SAXReader();
        Document doc=reader.read(Test.class.getClassLoader().getResourceAsStream("scores.xml"));
        Element root=doc.getRootElement();
        Element stu=root.element("stu");
        List<Element> list =stu.elements();

        //创建一个子节点
        Element sid= DocumentHelper.createElement("sid");
        sid.setText("编号:01");
        //添加集合中
        list.add(0,sid);

        OutputFormat fmt=OutputFormat.createPrettyPrint();
        String path="xml/src/scores.xml";
        XMLWriter writer =new XMLWriter(new FileOutputStream(path),fmt);
        writer.write(doc);
        writer.close();
    }
}
