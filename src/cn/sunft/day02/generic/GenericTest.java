package cn.sunft.day02.generic;

import java.util.ArrayList;

public class GenericTest {

	public static void main(String[] args) throws Exception {
		ArrayList<String> collection2 = new ArrayList<String>();
		collection2.add("abc");
		
		ArrayList<Integer> collection3 = new ArrayList<Integer>();
		//下面打印true,表示是同一份字节码,编译完之后类型自动擦除
		System.out.println(collection2.getClass() == collection3.getClass());
		//利用反射突破泛型的类型限制
		collection3.getClass().getMethod("add", Object.class)
			.invoke(collection3, "abc");
		System.out.println(collection3.get(0));
	}

}






