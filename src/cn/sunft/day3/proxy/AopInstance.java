package cn.sunft.day3.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 创建实例对象
 * 
 * @author sunft
 * 
 */
public class AopInstance {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		
		//实际的对象
		final List target = new ArrayList();
		//将上面的两个步骤合二为一
		Collection proxy3 = (Collection) getProxy(target, new MyAdvice());
		
		//获取实际的对象的返回对象
		Object obj = proxy3.add("zxx");
		proxy3.add("lhm");
		proxy3.add("bxd");
		System.out.println(proxy3.size());
		System.out.println(proxy3.getClass().getName());
	}

	/**
	 * 返回代理
	 * @param target
	 * @return
	 */
	private static Object getProxy(final Object target, final Advice advice) {
		Object proxy3 = Proxy.newProxyInstance(
				target.getClass().getClassLoader(),
				//与target实现相同的接口
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
				} );
		return proxy3;
	}
}






