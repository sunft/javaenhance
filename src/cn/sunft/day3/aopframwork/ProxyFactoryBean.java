package cn.sunft.day3.aopframwork;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import cn.sunft.day3.proxy.Advice;

/**
 * ����Bean
 * @author sunft
 *
 */
public class ProxyFactoryBean {

	private Advice advice;
	private Object target;

	public Advice getAdvice() {
		return advice;
	}

	public void setAdvice(Advice advice) {
		this.advice = advice;
	}

	public Object getTarget() {
		return target;
	}

	public void setTarget(Object target) {
		this.target = target;
	}

	public Object getProxy() {
		Object proxy3 = Proxy.newProxyInstance(target.getClass()
				.getClassLoader(),
				// ��targetʵ����ͬ�Ľӿ�
				target.getClass().getInterfaces(), 
				new InvocationHandler() {

					/**
					 * proxy:��ǰʹ�õĴ������ 
					 * method:��ǰ���õĴ�������еķ��� 
					 * args:��ǰ���õķ������յĲ���
					 */
					@Override
					public Object invoke(Object proxy, Method method,
							Object[] args) throws Throwable {
						advice.beforeMethod(method);
						Object retVal = method.invoke(target, args);
						advice.afterMethod(method);
						return retVal;
					}
				});
		return proxy3;
	}

}
