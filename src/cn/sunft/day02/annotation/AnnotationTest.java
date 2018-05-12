package cn.sunft.day02.annotation;

/**
 * 测试注解
 * @author sunft
 *
 */
public class AnnotationTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.runFinalizersOnExit(true);
	}
	
	/**
	 * 标注方法已经过时,不再建议使用
	 */
	@Deprecated
	public static void sayHello() {
		System.out.println("hi, HelloWorld!");
	}

}


