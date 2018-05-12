package cn.sunft.day02.classloader;

import java.util.Date;

public class ClassLoaderTest {

	public static void main(String[] args) throws Exception {
		String classLoaderName1 = ClassLoaderTest.class
				.getClassLoader().getClass()
				.getName();
		//sun.misc.Launcher$AppClassLoader
		System.out.println(classLoaderName1);
		//null
		System.out.println(System.class.getClassLoader());
		
		ClassLoader loader = ClassLoaderTest.class.getClassLoader();
		while(loader != null) {
			System.out.println(loader.getClass().getName());
			loader = loader.getParent();
		}
		
		System.out.println(loader);
		
		//自定义的类加载器挂在系统类加载器
		//加载类的时候是由于AppClassLoader去加载
		Class clazz = new MyClassLoader("F:\\code\\MyeclipseProjects\\javaenhance\\sunftlib")
			.loadClass("cn.sunft.day02.classloader.ClassLoaderAttachment");
		
		Date d1 = (Date) clazz.newInstance();
		System.out.println(d1);
		
	}

}




