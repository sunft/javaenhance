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
		
		//�Զ���������������ϵͳ�������
		//�������ʱ��������AppClassLoaderȥ����
		Class clazz = new MyClassLoader("F:\\code\\MyeclipseProjects\\javaenhance\\sunftlib")
			.loadClass("cn.sunft.day02.classloader.ClassLoaderAttachment");
		
		Date d1 = (Date) clazz.newInstance();
		System.out.println(d1);
		
	}

}




