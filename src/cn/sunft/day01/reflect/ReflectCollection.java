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
		
		//�����ļ���Ҫ���ڵ�ǰ��Ŀ¼��
		//InputStream ips = ReflectCollection.class
			//.getResourceAsStream("resources/config.properties");
		//����·���ķ�ʽ
		InputStream ips = ReflectCollection.class
				.getResourceAsStream(
		"/cn/sunft/day01/reflect/resources/config.properties");
		
		//��classpath���ڵĸ�Ŀ¼�²����ļ�
		//ע��������ļ���Ҫֱ�ӷ���classpathָ����Ŀ¼��,
		//����Ŀ¼��ǰ�治Ҫ��/,ͨ�����ַ�ʽ�ļ�ͨ������Ҫ�޸�
//		InputStream ips = ReflectCollection.class
//				.getClassLoader()
//		.getResourceAsStream("cn/sunft/day01/reflect/config.properties");
		
		Properties props = new Properties();
		props.load(ips);
		ips.close();
		String className = props.getProperty("className");
		//����Ĭ�ϻ�����޲����Ĺ��췽��
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


