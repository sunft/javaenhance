package cn.sunft.day01.introspector;

/**
 * 被用作测试内省的JavaBean
 * 
 * @author sunft
 * 
 */
public class JavaBean {

	private int x;
	private int y;

	public JavaBean() {
		super();
	}

	public JavaBean(int x, int y) {
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

}



