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
		Integer iObj = 3;//自动装箱
		System.out.println(iObj + 12); //自动拆箱
		
		Integer i1 = 13;
		Integer i2 = 13;
		//处于-128~127的整数自动装箱后会被缓存起来,
		//下次再被自动装箱时会直接从缓存池中拿,这里涉及到享元模式
		System.out.println(i1 == i2);//true
		
		Integer i3 = 137;
		Integer i4 = 137;
		System.out.println(i3 == i4);//false
		
		//缓存池对下面的方法同样适用
		Integer i5 = Integer.valueOf(13);
		Integer i6 = Integer.valueOf(13);
		System.out.println(i5 == i6);//true
		
		Integer i7 = Integer.valueOf(137);
		Integer i8 = Integer.valueOf(137);
		System.out.println(i7 == i8);//false
		
	}

}




