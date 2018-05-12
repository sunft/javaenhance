package cn.sunft.day01.reflect;

import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args) throws Exception {
		//TestArguments.main(new String[]{"111", "222", "333"});
		//ʹ�÷���ķ�ʽ����,�����args[0]��ͨ��MyEclipse���õĲ���
		String startingClassName = args[0];
		Method mainMethod = Class.forName(startingClassName)
				.getMethod("main", String[].class);
		//��Ϊmain�Ǿ�̬����,����invoke��һ��������null
		//mainMethod.invoke(null, new Object[]{new String[]{"111", "222", "333"}});
		//����һ��Ҳ����
		mainMethod.invoke(null, (Object)new String[]{"111", "222", "333"});
	}

}

class TestArguments {
	public static void main(String[] args) {
		for (String arg : args) {
			System.out.println(arg);
		}
	}
}




