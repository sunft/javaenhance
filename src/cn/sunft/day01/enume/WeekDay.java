package cn.sunft.day01.enume;

/**
 * ʹ����ͨ����ģ��ö��,����ٶ�����ֻ������
 * @author sunft
 *
 */
public abstract class WeekDay {
	
	private WeekDay(){}
	
	/**
	 * ���������ڲ���ķ�ʽ�������
	 */
	public final static WeekDay SUN = new WeekDay(){
		
		@Override
		public WeekDay nextDay() {
			return MON;
		}
		
	};
	
	/**
	 * ���������ڲ���ķ�ʽ�������
	 */
	public final static WeekDay MON = new WeekDay(){
		
		@Override
		public WeekDay nextDay() {
			return SUN;
		}
		
	};
	
	/**
	 * ʵ��ö�ٵķ���
	 * @return
	 */
	/*public WeekDay nextDay() {
		//ע�⣺����Ƚϵ��Ƕ��������
		if(this == SUN) {
			return MON;
		} else {
			return SUN;
		}
	}*/
	
	public abstract WeekDay nextDay();
	
	@Override
	public String toString() {
		return this == SUN?"SUN":"MON";
	}
}




