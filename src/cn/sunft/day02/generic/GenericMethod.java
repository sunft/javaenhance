package cn.sunft.day02.generic;

public class GenericMethod {

	public static void main(String[] args) {
		//������������ȡ����
		add(3, 5);
		//��������ֻ����Number,������Double
		Number x1 = add(3.5, 3);
		//�����ƶϳ�����������Object
		Object x2 = add(3, "abc");
		
		//���������е�Ԫ��
		swap(new String[]{"abc", "xyz", "itcast"}, 1, 2);
		//����,���͵�ʵ������ֻ������������
		//swap(new int[]{1, 2, 3, 4, 5}, 3, 4);
	}
	
	private static <T> void swap(T[] a, int i, int j) {
		T tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	
	public static <T> T add(T x, T y) {
		return null;
	}
	
	/**
	 * ���巺���쳣
	 * @throws T
	 */
	public static <T extends Exception, K> void sayHello() throws T {
		try{
			
		}catch(Exception e) {
			throw (T)e;
		}
	}

}



