package top.ddoc._03_structural._05_facade;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/14 10:11 下午
 */
public class SubSystem
{
	public void turnOnTV()
	{
		System.out.println("turnOnTV()");
	}

	public void setCD(String cd)
	{
		System.out.println("setCD( " + cd + " )");
	}

	public void startWatching()
	{
		System.out.println("startWatching()");
	}
}
