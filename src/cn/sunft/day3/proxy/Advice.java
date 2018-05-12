package cn.sunft.day3.proxy;

import java.lang.reflect.Method;

/**
 * 模拟Spring中的通知接口
 * @author sunft
 *
 */
public interface Advice {
	
	void beforeMethod(Method method);
	
	void afterMethod(Method method);
	
}
