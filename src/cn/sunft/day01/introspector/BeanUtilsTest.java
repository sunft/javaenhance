package cn.sunft.day01.introspector;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;

import cn.sunft.day01.reflect.ReflectPoint;

/**
 * ��BeanUtils���в���,��ϸ�÷����Բμ�beanutils��API
 * @author sunft
 *
 */
public class BeanUtilsTest {

	public static void main(String[] args) throws Exception {
		ReflectPoint pt1 = new ReflectPoint(3, 5);
		
		//BeanUtils���úͷ��ض���String
		System.out.println(BeanUtils.getProperty(pt1, "x"));
		//java.lang.String
		System.out.println(BeanUtils.getProperty(pt1, "x").getClass().getName());
		System.out.println(pt1.getX());
		BeanUtils.setProperty(pt1, "x", "9");
		System.out.println(pt1.getX());
		//BeanUtils֧�����Եļ�������,һ��һ������ȥ
		BeanUtils.setProperty(pt1, "birthday.time", 100000L);
		System.out.println(BeanUtils.getProperty(pt1, "birthday.time"));
		System.out.println(pt1.getBirthday().getTime());
		//����Map��ֵ
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "KaKaLuoTe");
		map.put("age", "18");
		BeanUtils.setProperty(map, "name", "sunft");
		System.out.println(map);
		
		//ʹ��PropertyUtils�������ͱ���ƥ��,����ᱨ��
		PropertyUtils.setProperty(pt1, "x", 9);
		System.out.println(PropertyUtils.getProperty(pt1, "x"));
		//java.lang.Integer
		System.out.println(PropertyUtils.getProperty(pt1, "x").getClass().getName());
	}

}


