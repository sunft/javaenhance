package cn.sunft.day01.introspector;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

public class BeanInfoTest {

	public static void main(String[] args) throws Exception {
		JavaBean jb1 = new JavaBean(3, 5);

		String propertyName = "x";
		// 1������:"x" --> "X" --> "getX" --> MethodGetX --> ��ȡ����
		// 2��ͨ����ʡ��ʽ:MethodGetX --> ��ȡ����
		// ������
		PropertyDescriptor pd = new PropertyDescriptor(propertyName,
				jb1.getClass());
		Method methodGetX = pd.getReadMethod();
		Object retVal = methodGetX.invoke(jb1);
		System.out.println(retVal);

		// д����
		//Method methodSetX = pd.getWriteMethod();
		//methodSetX.invoke(jb1, 7);
		//System.out.println(jb1.getX());
		
		//------ʹ��BeanInfo�ķ�ʽʵ��
		
		//��ȡBean����Ϣ
		BeanInfo beanInfo = Introspector.getBeanInfo(jb1.getClass());
		//��ȡ���е���������
		PropertyDescriptor[] pds = beanInfo.getPropertyDescriptors();
		for(PropertyDescriptor pde : pds) {
			if(propertyName.equals(pd.getName())) {
				Method methodGetX1 = pde.getReadMethod();
				retVal = methodGetX1.invoke(jb1);
				break;
			}
		}
		
		System.out.println(jb1.getX());
	}

}
