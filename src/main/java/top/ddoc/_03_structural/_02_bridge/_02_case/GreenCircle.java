package top.ddoc._03_structural._02_bridge._02_case;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/14 4:51 下午
 */
public class GreenCircle implements DrawAPI
{
	@Override public void drawCircle(final float radius, final float x, final float y)
	{
		System.out.println("Drawing Circle[ color: green, radius: "
				+ radius +", x: " +x+", "+ y +"]");
	}
}
