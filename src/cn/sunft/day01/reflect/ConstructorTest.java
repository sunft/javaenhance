package cn.sunft.day01.reflect;

import java.lang.reflect.Constructor;

public class ConstructorTest {

	public static void main(String[] args) throws Exception {
		//new String(new StringBuffer("abc"))
		//获取指定参数的构造器
		Constructor constructor1 = 
				String.class.getConstructor(StringBuffer.class);
		//构造的时候,需要传入一个StringBuffer的实例
		String str1 = (String) 
				constructor1.newInstance(new StringBuffer("abc"));
		System.out.println(str1.charAt(2));//c
	}

}



