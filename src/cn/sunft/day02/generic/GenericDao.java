package cn.sunft.day02.generic;

import java.util.Set;

/**
 * 定义泛型类
 * @author sunft
 *
 * @param <E>
 */
public class GenericDao<E> {
	
	public void add(E x){}
	
	public E findById(int id){
		return null;
	}
	
	public void delete(E obj){}
	
	public void delete(int id){}
	
	public void update(E obj){}
	
	//编译错误
	/*public static void update2(E obj) {
		
	}*/
	
	/**
	 * 静态的方法单独声明泛型类型
	 * @param obj
	 */
	public static <E> void update2(E obj) {}
	
	public E findByUserName(String name) {
		return null;
	}
	
	public Set<E> findByConditions(String where) {
		return null;
	}

}


