package cn.sunft.day02.generic;

import java.util.ArrayList;

public class GenericTest {

	public static void main(String[] args) throws Exception {
		ArrayList<String> collection2 = new ArrayList<String>();
		collection2.add("abc");
		
		ArrayList<Integer> collection3 = new ArrayList<Integer>();
		//�����ӡtrue,��ʾ��ͬһ���ֽ���,������֮�������Զ�����
		System.out.println(collection2.getClass() == collection3.getClass());
		//���÷���ͻ�Ʒ��͵���������
		collection3.getClass().getMethod("add", Object.class)
			.invoke(collection3, "abc");
		System.out.println(collection3.get(0));
	}

}






