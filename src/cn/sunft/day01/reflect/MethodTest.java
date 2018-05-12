package cn.sunft.day01.reflect;

import java.lang.reflect.Method;

public class MethodTest {
	
	public static void main(String[] args) throws Exception {
		String str1 = "abc";
		
		//str.charAt(1)
		Method methodCharAt = String.class.getMethod("charAt", int.class);
		System.out.println(methodCharAt.invoke(str1, 1));//b
		//����һ������Ϊnullʱ,��ʾ�÷���ʱ��̬����
		//System.out.println(methodCharAt.invoke(null, 1));
		//JDK1.4�е�д��
		System.out.println(methodCharAt
				.invoke(str1, new Object[]{2}));//c
	}
	
}


