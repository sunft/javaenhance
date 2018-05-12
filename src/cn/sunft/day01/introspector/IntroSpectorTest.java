package cn.sunft.day01.introspector;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

/**
 * 测试内省
 * @author sunft
 *
 */
public class IntroSpectorTest {

	public static void main(String[] args) throws Exception {
		JavaBean jb1 = new JavaBean(3, 5);
		
		String propertyName = "x";
		//1、反射:"x" --> "X" --> "getX" --> MethodGetX --> 获取属性
		//2、通过内省方式:MethodGetX --> 获取属性
		//读方法
		PropertyDescriptor pd = 
			new PropertyDescriptor(propertyName, jb1.getClass());
		Method methodGetX = pd.getReadMethod();
		Object retVal = methodGetX.invoke(jb1);
		System.out.println(retVal);
		
		//写方法
		Method methodSetX = pd.getWriteMethod();
		methodSetX.invoke(jb1, 7);
		System.out.println(jb1.getX());
	}

}

