package cn.sunft.day01.enume;


public class WeekDay1Test {

	public static void main(String[] args) {
		WeekDay1 weekDay1 = WeekDay1.FRI;
		//ö���Զ�ʵ��toString����,��ӡFRI
		System.out.println(weekDay1);//FRI
		//��ӡFRI
		System.out.println(weekDay1.name());//FRI
		//��ӡ����,Ĭ���±��0��ʼ,���������ӡ5
		System.out.println(weekDay1.ordinal());//5
		//��̬����,valueOf�����ɶ�Ӧ�Ķ���,��������toString����
		System.out.println(WeekDay1.valueOf("SUN"));//SUN
		System.out.println(WeekDay1.valueOf(WeekDay1.class, "FRI"));
		//values������ӡ����
		System.out.println(WeekDay1.values().length);//7
	}

}
