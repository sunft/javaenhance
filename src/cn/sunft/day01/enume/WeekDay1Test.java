package cn.sunft.day01.enume;


public class WeekDay1Test {

	public static void main(String[] args) {
		WeekDay1 weekDay1 = WeekDay1.FRI;
		//枚举自动实现toString方法,打印FRI
		System.out.println(weekDay1);//FRI
		//打印FRI
		System.out.println(weekDay1.name());//FRI
		//打印排名,默认下标从0开始,所以这里打印5
		System.out.println(weekDay1.ordinal());//5
		//静态方法,valueOf会生成对应的对象,最后调用了toString方法
		System.out.println(WeekDay1.valueOf("SUN"));//SUN
		System.out.println(WeekDay1.valueOf(WeekDay1.class, "FRI"));
		//values方法打印数组
		System.out.println(WeekDay1.values().length);//7
	}

}
