package cn.sunft.day01.reflect;

import java.util.Date;

/**
 * 定义一个点的类,供反射测试用
 * @author sunft
 *
 */
public class ReflectPoint {
	
	private int x;
	public int y;
	private Date birthday = new Date();
	public String str1 = "ball";
	public String str2 = "basketball";
	public String str3 = "itcast";
	
	
	public ReflectPoint(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReflectPoint other = (ReflectPoint) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return str1 + ":" + str2 + ":" + str3;
	}
	
}



