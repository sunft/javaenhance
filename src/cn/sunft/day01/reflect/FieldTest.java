package cn.sunft.day01.reflect;

import java.lang.reflect.Field;

/**
 * ���Է����е�Field
 * @author sunft
 *
 */
public class FieldTest {

	public static void main(String[] args) throws Exception {
		ReflectPoint pt1 = new ReflectPoint(3, 5);
		//���ַ�ʽֻ�ܻ�ȡpublic���ε�����
		Field fieldY = pt1.getClass().getField("y");
		//fieldY��ֵ�Ƕ��٣���5,��!fieldY���Ƕ������ϵı���,
		//��������,Ҫ����ȥȡĳ�������϶�Ӧ��ֵ
		System.out.println(fieldY.get(pt1));
		
		//˽�е�����
		Field fieldX = pt1.getClass().getDeclaredField("x");
		fieldX.setAccessible(true);//���÷���Ϊtrue
		System.out.println(fieldX.get(pt1));
		
		//�޸�ֵ
		changeStringValue(pt1);
		//��ӡ�µ�ֵ
		System.out.println(pt1);
	}

	/**
	 * �����������е�����Ϊ�ַ����������е�����b��ĸ�滻��a
	 * @param obj
	 * @throws Exception
	 */
	private static void changeStringValue(Object obj) throws Exception {
		Field[] fields = obj.getClass().getFields();
		for(Field field : fields) {
			//if(field.getType().equals(String.class)) {
			//�ֽ������ڴ���ֻ��һ��,��˿���ʹ��==�Ƚ�;
			//ֻҪ�Ƚ��ֽ���,��ֻ��Ҫʹ��==�Ƚϼ���
			if(field.getType() == String.class) {
				String oldValue = (String)field.get(obj);
				//����ֵ�����е�b�滻��a
				String newValue = oldValue.replace('b', 'a');
				//��obj�����field��������newValue��ֵ
				field.set(obj, newValue);
			}
			
		}
	}

}




