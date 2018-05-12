package cn.sunft.day01.introspector;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;

import cn.sunft.day01.reflect.ReflectPoint;

/**
 * 对BeanUtils进行测试,详细用法可以参见beanutils的API
 * @author sunft
 *
 */
public class BeanUtilsTest {

	public static void main(String[] args) throws Exception {
		ReflectPoint pt1 = new ReflectPoint(3, 5);
		
		//BeanUtils设置和返回都是String
		System.out.println(BeanUtils.getProperty(pt1, "x"));
		//java.lang.String
		System.out.println(BeanUtils.getProperty(pt1, "x").getClass().getName());
		System.out.println(pt1.getX());
		BeanUtils.setProperty(pt1, "x", "9");
		System.out.println(pt1.getX());
		//BeanUtils支持属性的级联操作,一级一级点下去
		BeanUtils.setProperty(pt1, "birthday.time", 100000L);
		System.out.println(BeanUtils.getProperty(pt1, "birthday.time"));
		System.out.println(pt1.getBirthday().getTime());
		//设置Map的值
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "KaKaLuoTe");
		map.put("age", "18");
		BeanUtils.setProperty(map, "name", "sunft");
		System.out.println(map);
		
		//使用PropertyUtils参数类型必须匹配,否则会报错
		PropertyUtils.setProperty(pt1, "x", 9);
		System.out.println(PropertyUtils.getProperty(pt1, "x"));
		//java.lang.Integer
		System.out.println(PropertyUtils.getProperty(pt1, "x").getClass().getName());
	}

}


