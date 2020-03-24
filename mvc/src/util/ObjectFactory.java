package util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class ObjectFactory {
	//创建一个Map集合
	//key:实例名字
	//value：是一个对象，通过配置文件等号右边内容产生的一个实例对象
	static Map<String,Object> objs = new HashMap<String, Object>();
	static {
		//读取objects文件
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(ObjectFactory.class.getClassLoader().getResourceAsStream("objects.properties")));
			String s;
			while ((s=br.readLine())!=null) {
//				System.out.println(s);
				//将读取的文件转换为数组
				String[] split = s.split("=");
				//通过路径获取类对象
				Class<?> name = Class.forName(split[1]);
				//通过类对象获取实例对象
				Object o = name.newInstance();
				//添加到Map集合中
				objs.put(split[0], o);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Object getObject(String s) {
		return objs.get(s);
	}
}
