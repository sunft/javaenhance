package cn.sunft.day01.reflect;

import java.util.Arrays;

/**
 * ������Object�Ĺ�ϵ���䷴������
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
		
		//����������JDK8ֱ�ӱ������ݵ�����
		//System.out.println(a1.getClass() == a4.getClass());
		//System.out.println(a1.getClass() == a3.getClass());
		System.out.println(a1.getClass().getName());
		System.out.println(a1.getClass().getSuperclass().getName());
		System.out.println(a4.getClass().getSuperclass().getName());
		
		Object aObj1 = a1;
		Object aObj2 = a4;
		//����
		//Object[] aObj3 = a1;
		Object[] aObj4 = a3;
		Object[] aObj5 = a4;
		
		System.out.println(a1);
		System.out.println(a4);
		//ע�⹤�����ʹ��
		System.out.println(Arrays.asList(a1));
		System.out.println(Arrays.asList(a4));
	}
	
}


