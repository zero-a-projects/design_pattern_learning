package top.ddoc._03_structural._02_bridge._02_case;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/14 4:52 下午
 */
public abstract class Shape
{
	protected DrawAPI drawAPI;

	protected Shape(final DrawAPI drawAPI)
	{
		this.drawAPI = drawAPI;
	}
	
	public abstract void draw();
}
