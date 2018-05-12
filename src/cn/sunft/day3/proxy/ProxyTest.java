package cn.sunft.day3.proxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.lang.reflect.Proxy;
import java.util.Collection;

public class ProxyTest {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Class clazzProxy1 = 
				Proxy.getProxyClass(Collection.class.getClassLoader(), 
						Collection.class);
		System.out.println(clazzProxy1.getName());
		
		System.out.println("begin constructors list:");
		Constructor[] constructors = clazzProxy1.getConstructors();
		for (Constructor constructor : constructors) {
			String name = constructor.getName();
			StringBuilder sb = new StringBuilder(name);
			sb.append('(');
			Class[] clazzParams = constructor.getParameterTypes();
			for (Class clazzParam : clazzParams) {
				sb.append(clazzParam.getName()).append(',');
			}
			if(clazzParams != null && clazzParams.length != 00) {				
				//删除最后一个字符
				sb.deleteCharAt(sb.length() - 1);
			}
			Parameter[] params = constructor.getParameters();
			for (Parameter parameter : params) {
				System.out.println(parameter.getModifiers() + ":" + parameter.getName());
			}
			sb.append(')');
			System.out.println(sb.toString());
		}
		
		System.out.println("begin methods list:--------");
		Method[] methods = clazzProxy1.getMethods();
		for (Method method : methods) {
			String name = method.getName();
			StringBuilder sb = new StringBuilder(name);
			sb.append('(');
			Class[] clazzParams = method.getParameterTypes();
			for (Class clazzParam : clazzParams) {
				sb.append(clazzParam.getName()).append(',');
			}
			if(clazzParams != null && clazzParams.length != 00) {				
				//删除最后一个字符
				sb.deleteCharAt(sb.length() - 1);
			}
			Parameter[] params = method.getParameters();
			for (Parameter parameter : params) {
				System.out.println(parameter.getModifiers() + 
						":" + parameter.getName());
			}
			sb.append(')');
			System.out.println(sb.toString());
		}
	}
	
}



