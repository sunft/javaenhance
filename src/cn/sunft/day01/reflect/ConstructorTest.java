package cn.sunft.day01.reflect;

import java.lang.reflect.Constructor;

public class ConstructorTest {

	public static void main(String[] args) throws Exception {
		//new String(new StringBuffer("abc"))
		//��ȡָ�������Ĺ�����
		Constructor constructor1 = 
				String.class.getConstructor(StringBuffer.class);
		//�����ʱ��,��Ҫ����һ��StringBuffer��ʵ��
		String str1 = (String) 
				constructor1.newInstance(new StringBuffer("abc"));
		System.out.println(str1.charAt(2));//c
	}

}



