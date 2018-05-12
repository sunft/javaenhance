package cn.sunft.day3.proxy;

import java.lang.reflect.Method;

/**
 * Spring中的通知实现类
 * @author sunft
 *
 */
public class MyAdvice implements Advice {

	private long beginTime = 0;
	
	/**
	 * 前置方法
	 */
	@Override
	public void beforeMethod(Method method) {
		System.out.println("begin===================");
		beginTime = System.currentTimeMillis();
	}

	/**
	 * 后置方法
	 */
	@Override
	public void afterMethod(Method method) {
		System.out.println("end===================");
		long endTime = System.currentTimeMillis();
		System.out.println(method.getName() + 
				" running time of " 
				+ (endTime - this.beginTime));
	}

}





