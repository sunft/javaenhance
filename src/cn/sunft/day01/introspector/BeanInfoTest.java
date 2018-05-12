package cn.sunft.day01.introspector;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

public class BeanInfoTest {

	public static void main(String[] args) throws Exception {
		JavaBean jb1 = new JavaBean(3, 5);

		String propertyName = "x";
		// 1、反射:"x" --> "X" --> "getX" --> MethodGetX --> 获取属性
		// 2、通过内省方式:MethodGetX --> 获取属性
		// 读方法
		PropertyDescriptor pd = new PropertyDescriptor(propertyName,
				jb1.getClass());
		Method methodGetX = pd.getReadMethod();
		Object retVal = methodGetX.invoke(jb1);
		System.out.println(retVal);

		// 写方法
		//Method methodSetX = pd.getWriteMethod();
		//methodSetX.invoke(jb1, 7);
		//System.out.println(jb1.getX());
		
		//------使用BeanInfo的方式实现
		
		//获取Bean的信息
		BeanInfo beanInfo = Introspector.getBeanInfo(jb1.getClass());
		//获取所有的属性描述
		PropertyDescriptor[] pds = beanInfo.getPropertyDescriptors();
		for(PropertyDescriptor pde : pds) {
			if(propertyName.equals(pd.getName())) {
				Method methodGetX1 = pde.getReadMethod();
				retVal = methodGetX1.invoke(jb1);
				break;
			}
		}
		
		System.out.println(jb1.getX());
	}

}
