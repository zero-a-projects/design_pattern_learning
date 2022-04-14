package top.ddoc._03_structural._02_bridge._02_case;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/14 5:00 下午
 */
public class BridgePatternDemo
{
	public static void main(String[] args)
	{
		final Circle readCircle = new Circle(100, 100, 10, new RedCircle());
		readCircle.draw();
		
		final Circle greenCircle = new Circle(100, 100, 10, new GreenCircle());
		greenCircle.draw();
	}
}
