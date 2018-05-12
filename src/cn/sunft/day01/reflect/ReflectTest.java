package cn.sunft.day01.reflect;

public class ReflectTest {
	
	/**
	 * @param atgs
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] atgs) throws ClassNotFoundException {
		String str1 = "abc";
		@SuppressWarnings("unchecked")
		Class<String> cls1 = (Class<String>) str1.getClass();
		Class<String> cls2 = String.class;
		@SuppressWarnings("unchecked")
		Class<String> cls3 = (Class<String>) Class.forName("java.lang.String");
		System.out.println(cls1 == cls2);//true
		System.out.println(cls1 == cls3);//true
		
		//判断是否是原始类型
		System.out.println(cls1.isPrimitive());//false
		System.out.println(int.class.isPrimitive());//true
		System.out.println(void.class.isPrimitive());//true
		System.out.println(int.class == Integer.class);//false
		//Integer中的TYPE属性代表的是int的字节码
		System.out.println(int.class == Integer.TYPE);//true
		System.out.println(void.class == Void.TYPE);  //true
		System.out.println(int[].class.isPrimitive());//false
		System.out.println(byte[].class.isArray());//true
		
	}
	
}


