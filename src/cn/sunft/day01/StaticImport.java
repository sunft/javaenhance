package cn.sunft.day01;

//只导入max方法
//import static java.lang.Math.max;
//导入Math类下面的所有方法
import static java.lang.Math.*;

public class StaticImport {

	public static void main(String[] args) {
		int x = 1;
		try {
			x ++;
		} finally {
			System.out.println("template");
		}
		System.out.println(x);
		
		System.out.println(max(3, 6));
		System.out.println(abs(3 - 6));
		
	}

	
}


