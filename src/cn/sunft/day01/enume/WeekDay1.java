package cn.sunft.day01.enume;

/**
 * ����ö��
 * @author sunft
 *
 */
public enum WeekDay1 {
	//��ЩԪ�ر���λ��������������֮ǰ,����б�֮���ִ���
	//������Ҫ�зֺ�,��ʼ��ʱ�������޲����ֱ���ö�Ӧ�Ĺ��췽��
	SUN(1),MON(),TUE,WED,THU,FRI,STA;
	
	/**
	 * ���췽������Ϊ˽��
	 */
	private  WeekDay1() {
		System.out.println("first");
	}
	
	/**
	 * ���췽������Ϊ˽��
	 * @param day
	 */
	private WeekDay1(int day) {
		System.out.println("second");
	}
	
}






