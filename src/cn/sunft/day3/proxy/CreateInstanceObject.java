package cn.sunft.day3.proxy;

import java.lang.reflect.Constructor;
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
public class CreateInstanceObject {

	public static void main(String[] args) throws Exception {
		Class clazzProxy1 = Proxy.getProxyClass(
				Collection.class.getClassLoader(), Collection.class);
		// 没有无参数的构造器,因此会报错
		// Object obj = clazzProxy1.newInstance();

		// 获取带有一个参数的构造器
		Constructor constructor = clazzProxy1
				.getConstructor(InvocationHandler.class);

		// 在方法中定义类
		class MyInvocationHandler1 implements InvocationHandler {

			@Override
			public Object invoke(Object proxy, Method method, Object[] args)
					throws Throwable {
				return null;
			}

		}

		// 构造器必须接收一个InvocationHandler对象
		Collection proxy1 = (Collection) constructor
				.newInstance(new MyInvocationHandler1());
		System.out.println(proxy1);
		proxy1.clear();// 调用无返回值的方法成功
		// proxy1.size(); //调用有返回值的方法报错

		// 直接使用匿名内部类的方式
		Collection proxy2 = (Collection) constructor
				.newInstance(new InvocationHandler() {

					@Override
					public Object invoke(Object proxy, Method method,
							Object[] args) throws Throwable {
						// TODO Auto-generated method stub
						return null;
					}
				});
		
		//将上面的两个步骤合二为一
		Collection proxy3 = (Collection) Proxy.newProxyInstance(
				Collection.class.getClassLoader(),
				new Class[] {Collection.class}, 
				new InvocationHandler() {
					//指定目标
					List target = new ArrayList();
					
					/**
					 * proxy:当前使用的代理对象
					 * method:当前调用的代理对象中的方法
					 * args:当前调用的方法接收的参数
					 */
					@Override
					public Object invoke(Object proxy, Method method,
							Object[] args) throws Throwable {
						long beginTime = System.currentTimeMillis();
						//将对象换成实际的对象进行调用
						Object retVal = method.invoke(target, args);
						long endTime = System.currentTimeMillis();
						System.out.println(method.getName() 
								+ " running time of " + (endTime - beginTime));
						//代理对象和实际对象获取的返回值都是该值
						return retVal;
					}
				} );
		
		//获取实际的对象的返回对象
		Object obj = proxy3.add("zxx");
		proxy3.add("lhm");
		proxy3.add("bxd");
		System.out.println(proxy3.size());
		System.out.println(proxy3.getClass().getName());
	}

}




