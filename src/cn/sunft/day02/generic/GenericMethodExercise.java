package cn.sunft.day02.generic;

import java.util.Collection;
import java.util.Date;
import java.util.Vector;

public class GenericMethodExercise {

	public static void main(String[] args) {
		Object obj = "abc";
		String x1 = autoConvert(obj);
		
		//注意copy1和copy2的区别,以及泛型类型解释的差别
		Collection<String> collection = copy1(new Vector<String>(), new String[10]);
		Object[] objs =copy2(new Date[10], new String[10]);
		System.out.println(collection);
		System.out.println(objs);
		//类型推断具备传播性
		//copy1(new Vector<Date>(), new String[10]);
	}

	/**
	 * 自动转换
	 * @param obj
	 * @return
	 */
	public static <T> T autoConvert(Object obj) {
		return (T)obj;
	}
	
	/**
	 * 填充数组
	 * @param a
	 * @param obj
	 */
	public static <T> void fillArray(T[] a, T obj) {
		for(int i = 0; i < a.length; i ++) {
			a[i] = obj;
		}
	}
	
	/**
	 * 使用通配符的方式打印
	 * @param collection
	 */
	public static void printCollection(Collection<?> collection) {
		System.out.println(collection.size());
		for(Object obj : collection) {
			System.out.println(obj);
		}
	}
	
	/**
	 * 使用泛型的方式打印
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
	 * 将数组中的数据复制到集合中
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
	 * 将数组中的数据复制到数组中
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



