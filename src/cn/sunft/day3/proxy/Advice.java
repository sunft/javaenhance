package cn.sunft.day3.proxy;

import java.lang.reflect.Method;

/**
 * ģ��Spring�е�֪ͨ�ӿ�
 * @author sunft
 *
 */
public interface Advice {
	
	void beforeMethod(Method method);
	
	void afterMethod(Method method);
	
}
