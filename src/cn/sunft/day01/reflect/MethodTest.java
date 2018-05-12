package cn.sunft.day01.reflect;

import java.lang.reflect.Method;

public class MethodTest {
	
	public static void main(String[] args) throws Exception {
		String str1 = "abc";
		
		//str.charAt(1)
		Method methodCharAt = String.class.getMethod("charAt", int.class);
		System.out.println(methodCharAt.invoke(str1, 1));//b
		//当第一个参数为null时,表示该方法时静态方法
		//System.out.println(methodCharAt.invoke(null, 1));
		//JDK1.4中的写法
		System.out.println(methodCharAt
				.invoke(str1, new Object[]{2}));//c
	}
	
}


