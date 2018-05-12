package cn.sunft.day01.reflect;

import java.lang.reflect.Array;

public class ArrayReflectTest {

	public static void main(String[] args) {
		String[] a4 = new String[]{"a", "b", "c"};
		printObject(a4);
		
		printObject("xyz");
	}

	private static void printObject(Object obj) {
		Class clazz = obj.getClass();
		if(clazz.isArray()) {
			int len = Array.getLength(obj);
			for(int i = 0; i < len; i ++) {
				System.out.println(Array.get(obj, i));
			}
		} else {
			System.out.println(obj);
		}
	}

}

