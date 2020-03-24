package day1;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

public class Test {
    public static void main(String[] args) {
        String n="{\"name\":\"admin\"}";
        //toJSONString() 把Java对象转为JSON格式字符串
        String jstr= JSON.toJSONString(new User("zhangs"));
        System.out.println("Java对象转为JSON格式字符串:"+jstr);

        //parseObject() 把JSON格式字符串转为JAVA对象
        User u =JSON.parseObject(jstr,new TypeReference<User>(){});//new TypeReference<User>(){} 匿名内部类  必须加泛型
        System.out.println("把JSON格式字符串转为JAVA对象：" + u);
    }
}
