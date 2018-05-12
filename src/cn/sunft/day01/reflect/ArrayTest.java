package cn.sunft.day01.reflect;

import java.util.Arrays;

/**
 * 数组与Object的关系及其反射类型
 * @author sunft
 *
 */
public class ArrayTest {
	
	public static void main(String[] args) {
		int[] a1 = new int[]{1, 2, 3};
		int[] a2 = new int[4];
		int[][] a3 = new int[2][3];
		String[] a4 = new String[]{"a", "b", "c"};
		
		//true
		System.out.println(a1.getClass() == a2.getClass());
		
		//下面两行在JDK8直接报不兼容的类型
		//System.out.println(a1.getClass() == a4.getClass());
		//System.out.println(a1.getClass() == a3.getClass());
		System.out.println(a1.getClass().getName());
		System.out.println(a1.getClass().getSuperclass().getName());
		System.out.println(a4.getClass().getSuperclass().getName());
		
		Object aObj1 = a1;
		Object aObj2 = a4;
		//报错
		//Object[] aObj3 = a1;
		Object[] aObj4 = a3;
		Object[] aObj5 = a4;
		
		System.out.println(a1);
		System.out.println(a4);
		//注意工具类的使用
		System.out.println(Arrays.asList(a1));
		System.out.println(Arrays.asList(a4));
	}
	
}


