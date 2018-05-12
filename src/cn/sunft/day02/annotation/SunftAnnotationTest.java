package cn.sunft.day02.annotation;

/**
 * ��ӵ�ע��,ע���ж���ע��
 * @author sunft
 *
 */
@SunftAnnotation(annotationAttr = @MetaAnnotation("meta"), 
value = "blue", 
color = "yellow", arrayAttr = 1)
public class SunftAnnotationTest {

	public static void main(String[] args) {
		//��������Ƿ���ע��
		boolean isExist = SunftAnnotationTest.class
			.isAnnotationPresent(SunftAnnotation.class);
		
		if(isExist) {
			SunftAnnotation annotation = SunftAnnotationTest
					.class.getAnnotation(SunftAnnotation.class);
			System.out.println(annotation.color());
			System.out.println(annotation.value());
			System.out.println(annotation.arrayAttr().length);
			System.out.println(annotation.lamp().nextLamp().name());
			System.out.println(annotation.annotationAttr().value());
		}
	}

}

