package cn.sunft.day02.generic;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 测试泛型中的通配符
 * @author sunft
 *
 */
public class Wildcard {

	public static void main(String[] args) throws Exception {
		Collection<Integer> collection = new ArrayList<Integer>();
		collection.add(1);
		printCollection(collection);
		
		//forName方法的返回值是Class<?>
		Class<?> clazz = Class.forName("java.lang.String");
	}

	/**
	 * 下面方法中的?表示什么类型都可以接收
	 * @param collection
	 */
	public static void printCollection(Collection<?> collection) {
		//不能调用与具体类型相关的方法
		//collection.add(1);
		//可以调用与类型无关的方法
		System.out.println(collection.size());
		for (Object obj : collection) {
			System.out.println(obj);
		}
	}
}
