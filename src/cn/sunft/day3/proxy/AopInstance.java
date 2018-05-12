package cn.sunft.day3.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * ����ʵ������
 * 
 * @author sunft
 * 
 */
public class AopInstance {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		
		//ʵ�ʵĶ���
		final List target = new ArrayList();
		//���������������϶�Ϊһ
		Collection proxy3 = (Collection) getProxy(target, new MyAdvice());
		
		//��ȡʵ�ʵĶ���ķ��ض���
		Object obj = proxy3.add("zxx");
		proxy3.add("lhm");
		proxy3.add("bxd");
		System.out.println(proxy3.size());
		System.out.println(proxy3.getClass().getName());
	}

	/**
	 * ���ش���
	 * @param target
	 * @return
	 */
	private static Object getProxy(final Object target, final Advice advice) {
		Object proxy3 = Proxy.newProxyInstance(
				target.getClass().getClassLoader(),
				//��targetʵ����ͬ�Ľӿ�
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
				} );
		return proxy3;
	}
}






