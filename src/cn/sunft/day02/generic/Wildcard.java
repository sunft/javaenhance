package cn.sunft.day02.generic;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ���Է����е�ͨ���
 * @author sunft
 *
 */
public class Wildcard {

	public static void main(String[] args) throws Exception {
		Collection<Integer> collection = new ArrayList<Integer>();
		collection.add(1);
		printCollection(collection);
		
		//forName�����ķ���ֵ��Class<?>
		Class<?> clazz = Class.forName("java.lang.String");
	}

	/**
	 * ���淽���е�?��ʾʲô���Ͷ����Խ���
	 * @param collection
	 */
	public static void printCollection(Collection<?> collection) {
		//���ܵ��������������صķ���
		//collection.add(1);
		//���Ե����������޹صķ���
		System.out.println(collection.size());
		for (Object obj : collection) {
			System.out.println(obj);
		}
	}
}
