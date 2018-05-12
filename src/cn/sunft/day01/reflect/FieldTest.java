package cn.sunft.day01.reflect;

import java.lang.reflect.Field;

/**
 * 测试反射中的Field
 * @author sunft
 *
 */
public class FieldTest {

	public static void main(String[] args) throws Exception {
		ReflectPoint pt1 = new ReflectPoint(3, 5);
		//这种方式只能获取public修饰的属性
		Field fieldY = pt1.getClass().getField("y");
		//fieldY的值是多少？是5,错!fieldY不是对象身上的变量,
		//而是类上,要用它去取某个对象上对应的值
		System.out.println(fieldY.get(pt1));
		
		//私有的属性
		Field fieldX = pt1.getClass().getDeclaredField("x");
		fieldX.setAccessible(true);//设置访问为true
		System.out.println(fieldX.get(pt1));
		
		//修改值
		changeStringValue(pt1);
		//打印新的值
		System.out.println(pt1);
	}

	/**
	 * 将对象中所有的类型为字符串的属性中的所有b字母替换成a
	 * @param obj
	 * @throws Exception
	 */
	private static void changeStringValue(Object obj) throws Exception {
		Field[] fields = obj.getClass().getFields();
		for(Field field : fields) {
			//if(field.getType().equals(String.class)) {
			//字节码在内存中只有一份,因此可以使用==比较;
			//只要比较字节码,都只需要使用==比较即可
			if(field.getType() == String.class) {
				String oldValue = (String)field.get(obj);
				//将旧值中所有的b替换成a
				String newValue = oldValue.replace('b', 'a');
				//给obj对象的field对象设置newValue的值
				field.set(obj, newValue);
			}
			
		}
	}

}




