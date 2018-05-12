package cn.sunft.day3.proxy;

import java.lang.reflect.Constructor;
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
public class CreateInstanceObject {

	public static void main(String[] args) throws Exception {
		Class clazzProxy1 = Proxy.getProxyClass(
				Collection.class.getClassLoader(), Collection.class);
		// û���޲����Ĺ�����,��˻ᱨ��
		// Object obj = clazzProxy1.newInstance();

		// ��ȡ����һ�������Ĺ�����
		Constructor constructor = clazzProxy1
				.getConstructor(InvocationHandler.class);

		// �ڷ����ж�����
		class MyInvocationHandler1 implements InvocationHandler {

			@Override
			public Object invoke(Object proxy, Method method, Object[] args)
					throws Throwable {
				return null;
			}

		}

		// �������������һ��InvocationHandler����
		Collection proxy1 = (Collection) constructor
				.newInstance(new MyInvocationHandler1());
		System.out.println(proxy1);
		proxy1.clear();// �����޷���ֵ�ķ����ɹ�
		// proxy1.size(); //�����з���ֵ�ķ�������

		// ֱ��ʹ�������ڲ���ķ�ʽ
		Collection proxy2 = (Collection) constructor
				.newInstance(new InvocationHandler() {

					@Override
					public Object invoke(Object proxy, Method method,
							Object[] args) throws Throwable {
						// TODO Auto-generated method stub
						return null;
					}
				});
		
		//���������������϶�Ϊһ
		Collection proxy3 = (Collection) Proxy.newProxyInstance(
				Collection.class.getClassLoader(),
				new Class[] {Collection.class}, 
				new InvocationHandler() {
					//ָ��Ŀ��
					List target = new ArrayList();
					
					/**
					 * proxy:��ǰʹ�õĴ������
					 * method:��ǰ���õĴ�������еķ���
					 * args:��ǰ���õķ������յĲ���
					 */
					@Override
					public Object invoke(Object proxy, Method method,
							Object[] args) throws Throwable {
						long beginTime = System.currentTimeMillis();
						//�����󻻳�ʵ�ʵĶ�����е���
						Object retVal = method.invoke(target, args);
						long endTime = System.currentTimeMillis();
						System.out.println(method.getName() 
								+ " running time of " + (endTime - beginTime));
						//��������ʵ�ʶ����ȡ�ķ���ֵ���Ǹ�ֵ
						return retVal;
					}
				} );
		
		//��ȡʵ�ʵĶ���ķ��ض���
		Object obj = proxy3.add("zxx");
		proxy3.add("lhm");
		proxy3.add("bxd");
		System.out.println(proxy3.size());
		System.out.println(proxy3.getClass().getName());
	}

}




