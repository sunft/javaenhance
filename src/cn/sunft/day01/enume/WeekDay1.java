package cn.sunft.day01.enume;

/**
 * 定义枚举
 * @author sunft
 *
 */
public enum WeekDay1 {
	//这些元素必须位于所有其他内容之前,如果列表之后又代码
	//最后必须要有分号,初始化时按照有无参数分别调用对应的构造方法
	SUN(1),MON(),TUE,WED,THU,FRI,STA;
	
	/**
	 * 构造方法必须为私有
	 */
	private  WeekDay1() {
		System.out.println("first");
	}
	
	/**
	 * 构造方法必须为私用
	 * @param day
	 */
	private WeekDay1(int day) {
		System.out.println("second");
	}
	
}






