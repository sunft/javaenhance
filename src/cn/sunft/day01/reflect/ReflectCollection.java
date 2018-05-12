package cn.sunft.day01.reflect;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Collection;
import java.util.Properties;

/**
 * 
 * @author sunft
 *
 */
public class ReflectCollection {

	public static void main(String[] args) throws Exception {
		//InputStream ips = new FileInputStream("config.properties");
		
		//配置文件需要放在当前包目录下
		//InputStream ips = ReflectCollection.class
			//.getResourceAsStream("resources/config.properties");
		//绝对路径的方式
		InputStream ips = ReflectCollection.class
				.getResourceAsStream(
		"/cn/sunft/day01/reflect/resources/config.properties");
		
		//在classpath所在的根目录下查找文件
		//注意这里的文件需要直接放在classpath指定的目录下,
		//另外目录最前面不要加/,通过这种方式文件通常不需要修改
//		InputStream ips = ReflectCollection.class
//				.getClassLoader()
//		.getResourceAsStream("cn/sunft/day01/reflect/config.properties");
		
		Properties props = new Properties();
		props.load(ips);
		ips.close();
		String className = props.getProperty("className");
		//这里默认会调用无参数的构造方法
		Collection collections = (Collection) Class.forName(className)
				.newInstance();
		
		ReflectPoint pt1 = new ReflectPoint(3, 3);
		ReflectPoint pt2 = new ReflectPoint(5, 5);
		ReflectPoint pt3 = new ReflectPoint(3, 3);
		
		collections.add(pt1);
		collections.add(pt2);
		collections.add(pt3);
		collections.add(pt1);
		
		System.out.println(collections.size());
	}

}


