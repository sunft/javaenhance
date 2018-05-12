package cn.sunft.day02.generic;

import cn.sunft.day01.reflect.ReflectPoint;

/**
 * ≤‚ ‘Dao
 * @author sunft
 *
 */
public class GenericDaoTest {

	public static void main(String[] args) {
		GenericDao<ReflectPoint> dao = new GenericDao<ReflectPoint>();
		dao.add(new ReflectPoint(3, 3));
		//
		GenericDao.update2(new ReflectPoint(3, 3));
	}

}


