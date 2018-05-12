package cn.sunft.day3.aopframwork;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import cn.sunft.day3.proxy.Advice;

/**
 * Bean����,�����˴����ش������,û������ֱ�ӷ���ֻ�Ƕ���
 * @author sunft
 *
 */
public class BeanFactory {

	Properties props = new Properties();
	
	public BeanFactory(InputStream inStream) {
		try {
			props.load(inStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Object getBean(String name) {
		String className = props.getProperty(name);
		Class clazz = null;
		Object bean = null;
		try {
			clazz = Class.forName(className);
			bean = clazz.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/**
		 * ��������˴���,�ͷ��ش���
		 */
		if(bean instanceof ProxyFactoryBean) {
			Object proxy = null;
			ProxyFactoryBean proxyFactoryBean =
					(ProxyFactoryBean) bean;
			try {
				Advice advice = (Advice) Class
					.forName(props.getProperty((name + ".advice")))
					.newInstance();
				Object target = Class
					.forName(props.getProperty((name + ".target")))
					.newInstance();
				proxyFactoryBean.setAdvice(advice);
				proxyFactoryBean.setTarget(target);
				proxy = proxyFactoryBean.getProxy();
			} catch (Exception e) {
				e.printStackTrace();
			} 
			
			return proxy;
		}
		
		//û�����ô���,����ԭ���Ķ���
		return bean;
	}
	
}


