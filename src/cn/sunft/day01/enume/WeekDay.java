package cn.sunft.day01.enume;

/**
 * 使用普通的类模拟枚举,这里假定星期只有两个
 * @author sunft
 *
 */
public abstract class WeekDay {
	
	private WeekDay(){}
	
	/**
	 * 采用匿名内部类的方式构造对象
	 */
	public final static WeekDay SUN = new WeekDay(){
		
		@Override
		public WeekDay nextDay() {
			return MON;
		}
		
	};
	
	/**
	 * 采用匿名内部类的方式构造对象
	 */
	public final static WeekDay MON = new WeekDay(){
		
		@Override
		public WeekDay nextDay() {
			return SUN;
		}
		
	};
	
	/**
	 * 实现枚举的方法
	 * @return
	 */
	/*public WeekDay nextDay() {
		//注意：这里比较的是对象的引用
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




