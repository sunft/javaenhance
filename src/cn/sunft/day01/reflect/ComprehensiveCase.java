package cn.sunft.day01.reflect;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * 综合案例
 * @author sunft
 *
 */
public class ComprehensiveCase {

	public static void main(String[] args) {
		Collection list = new ArrayList();
		Collection set = new HashSet();
		
		ReflectPoint pt1 = new ReflectPoint(3, 3);
		ReflectPoint pt2 = new ReflectPoint(5, 5);
		ReflectPoint pt3 = new ReflectPoint(3, 3);
		
		list.add(pt1);
		list.add(pt2);
		list.add(pt3);
		list.add(pt1);
		
		set.add(pt1);
		set.add(pt2);
		set.add(pt3);
		set.add(pt1);
		
		//修改对象的值后,删除失败
		//修改后hash值改变,对象移除失败
		pt1.y = 7;
		set.remove(pt1);
		
		System.out.println(list.size()); 
		//HashSet默认不会保存相同的对象,因此这里打印3
		System.out.println(set.size());  
	}

}




