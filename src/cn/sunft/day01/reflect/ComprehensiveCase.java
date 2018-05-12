package cn.sunft.day01.reflect;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * �ۺϰ���
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
		
		//�޸Ķ����ֵ��,ɾ��ʧ��
		//�޸ĺ�hashֵ�ı�,�����Ƴ�ʧ��
		pt1.y = 7;
		set.remove(pt1);
		
		System.out.println(list.size()); 
		//HashSetĬ�ϲ��ᱣ����ͬ�Ķ���,��������ӡ3
		System.out.println(set.size());  
	}

}




