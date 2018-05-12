package cn.sunft.day3.aopframwork;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import cn.sunft.day3.proxy.Advice;

/**
 * 代理Bean
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
				// 与target实现相同的接口
				target.getClass().getInterfaces(), 
				new InvocationHandler() {

					/**
					 * proxy:当前使用的代理对象 
					 * method:当前调用的代理对象中的方法 
					 * args:当前调用的方法接收的参数
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
