package cn.sunft.day01;

/**
 * @author sunft
 *
 */
public class AutoBox {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer iObj = 3;//�Զ�װ��
		System.out.println(iObj + 12); //�Զ�����
		
		Integer i1 = 13;
		Integer i2 = 13;
		//����-128~127�������Զ�װ���ᱻ��������,
		//�´��ٱ��Զ�װ��ʱ��ֱ�Ӵӻ��������,�����漰����Ԫģʽ
		System.out.println(i1 == i2);//true
		
		Integer i3 = 137;
		Integer i4 = 137;
		System.out.println(i3 == i4);//false
		
		//����ض�����ķ���ͬ������
		Integer i5 = Integer.valueOf(13);
		Integer i6 = Integer.valueOf(13);
		System.out.println(i5 == i6);//true
		
		Integer i7 = Integer.valueOf(137);
		Integer i8 = Integer.valueOf(137);
		System.out.println(i7 == i8);//false
		
	}

}




