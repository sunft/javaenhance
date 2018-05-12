package cn.sunft.day3.aopframwork;

import java.io.InputStream;
import java.util.Collection;

/**
 * ²âÊÔ¼òÒ×AOP¿ò¼Ü
 * @author sunft
 *
 */
public class AopFrameworkTest {

	public static void main(String[] args) {
		InputStream inStream = AopFrameworkTest.class
				.getResourceAsStream("config.properties");
		Object bean = new BeanFactory(inStream).getBean("sunft");
		System.out.println(bean.getClass().getName());
		
		((Collection)bean).clear();
	}

}
