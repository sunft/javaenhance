package cn.sunft.day02.annotation;

/**
 * ����ע��
 * @author sunft
 *
 */
public class AnnotationTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.runFinalizersOnExit(true);
	}
	
	/**
	 * ��ע�����Ѿ���ʱ,���ٽ���ʹ��
	 */
	@Deprecated
	public static void sayHello() {
		System.out.println("hi, HelloWorld!");
	}

}


