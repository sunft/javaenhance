package cn.sunft.day01.enume;

public class TrafficLampTest {

	public static void main(String[] args) {
		/**
		 * 虽然构造方法有参数,但是在使用时只能这么使用
		 */
		TrafficLamp red = TrafficLamp.GREEN;
		//打印YELLOW
		System.out.println(red.nextLamp());
	}

}


