package cn.sunft.day02.generic;

import java.util.Collection;
import java.util.Date;
import java.util.Vector;

public class GenericMethodExercise {

	public static void main(String[] args) {
		Object obj = "abc";
		String x1 = autoConvert(obj);
		
		//ע��copy1��copy2������,�Լ��������ͽ��͵Ĳ��
		Collection<String> collection = copy1(new Vector<String>(), new String[10]);
		Object[] objs =copy2(new Date[10], new String[10]);
		System.out.println(collection);
		System.out.println(objs);
		//�����ƶϾ߱�������
		//copy1(new Vector<Date>(), new String[10]);
	}

	/**
	 * �Զ�ת��
	 * @param obj
	 * @return
	 */
	public static <T> T autoConvert(Object obj) {
		return (T)obj;
	}
	
	/**
	 * �������
	 * @param a
	 * @param obj
	 */
	public static <T> void fillArray(T[] a, T obj) {
		for(int i = 0; i < a.length; i ++) {
			a[i] = obj;
		}
	}
	
	/**
	 * ʹ��ͨ����ķ�ʽ��ӡ
	 * @param collection
	 */
	public static void printCollection(Collection<?> collection) {
		System.out.println(collection.size());
		for(Object obj : collection) {
			System.out.println(obj);
		}
	}
	
	/**
	 * ʹ�÷��͵ķ�ʽ��ӡ
	 * @param collection
	 */
	public static <T> void printlnCollection2(Collection<T> collection) {
		System.out.println(collection.size());
		for(Object obj : collection){
			System.out.println(obj);
		}
		//collection.add(e);
	}
	
	/**
	 * �������е����ݸ��Ƶ�������
	 * @param dest
	 * @param source
	 */
	public static <T> Collection<T> copy1(Collection<T> dest, T[] source) {
		for(T a : source) {
			dest.add(a);
		}
		
		return dest;
	}
	
	/**
	 * �������е����ݸ��Ƶ�������
	 * @param dest
	 * @param src
	 */
	public static <T> T[] copy2(T[] dest, T[] src) {
		for(int i = 0; i < src.length; i ++) {
			dest[i] = src[i];
		}
		
		return dest;
	}
}



