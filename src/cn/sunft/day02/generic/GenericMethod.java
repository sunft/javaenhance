package cn.sunft.day02.generic;

public class GenericMethod {

	public static void main(String[] args) {
		//根据两个参数取交集
		add(3, 5);
		//这里类型只能是Number,不能是Double
		Number x1 = add(3.5, 3);
		//这里推断出来的类型是Object
		Object x2 = add(3, "abc");
		
		//交换数组中的元素
		swap(new String[]{"abc", "xyz", "itcast"}, 1, 2);
		//报错,泛型的实际类型只能是引用类型
		//swap(new int[]{1, 2, 3, 4, 5}, 3, 4);
	}
	
	private static <T> void swap(T[] a, int i, int j) {
		T tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	
	public static <T> T add(T x, T y) {
		return null;
	}
	
	/**
	 * 定义泛型异常
	 * @throws T
	 */
	public static <T extends Exception, K> void sayHello() throws T {
		try{
			
		}catch(Exception e) {
			throw (T)e;
		}
	}

}



