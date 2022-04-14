package top.ddoc._03_structural._02_bridge._02_case;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/14 4:56 下午
 */
public class Circle extends Shape
{
	private int x, y, radius;
	public Circle(final int x, final int y, final int radius, final DrawAPI drawAPI)
	{
		super(drawAPI);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override public void draw()
	{
		drawAPI.drawCircle(radius, x, y);
	}
}
