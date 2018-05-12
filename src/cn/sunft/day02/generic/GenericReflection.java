package cn.sunft.day02.generic;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.Vector;

/**
 * 通过反射获得泛型的实际类型参数
 * @author sunft
 *
 */
public class GenericReflection {

	public static void main(String[] args) throws Exception {
		Vector<Date> v1 = new Vector<Date>();
		Method applyMethod = GenericReflection.class.getMethod("applyVector", Vector.class);
		//获取applyVector方法的泛型参数类型
		Type[] types = applyMethod.getGenericParameterTypes();
		ParameterizedType pType = (ParameterizedType) types[0];
		//打印原始类型  class java.util.Vector
		System.out.println(pType.getRawType());
		//java.util.Vector<java.util.Date>
		System.out.println(pType.getTypeName());
		//null
		System.out.println(pType.getOwnerType());
		//打印实际泛型参数类型   class java.util.Date
		System.out.println(pType.getActualTypeArguments()[0]);
	}
	
	public static void applyVector(Vector<Date> v1) {
		
	}

}



