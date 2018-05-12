package cn.sunft.day01;

public class VariableParameter {

	public static void main(String[] args) {
		System.out.println(add(2, 3));
		System.out.println(add(2, 3, 5));
	}
	
	/**
	 * ...ǰ�����޿ո񶼿���
	 * @param x
	 * @param args
	 * @return
	 */
	public static int add(int x, int ... args) {
		int sum = x;
		/*for(int i = 0; i < args.length; i ++) {
			sum += args[i];
		}*/
		for(final int arg : args) {
			sum += arg;
		}
		
		return sum;
	}
}





