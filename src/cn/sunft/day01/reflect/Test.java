package cn.sunft.day01.reflect;

import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args) throws Exception {
		//TestArguments.main(new String[]{"111", "222", "333"});
		//使用反射的方式调用,这里的args[0]是通过MyEclipse配置的参数
		String startingClassName = args[0];
		Method mainMethod = Class.forName(startingClassName)
				.getMethod("main", String[].class);
		//因为main是静态方法,所以invoke第一个参数是null
		//mainMethod.invoke(null, new Object[]{new String[]{"111", "222", "333"}});
		//上面一行也可以
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




