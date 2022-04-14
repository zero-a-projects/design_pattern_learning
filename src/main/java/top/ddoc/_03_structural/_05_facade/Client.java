package top.ddoc._03_structural._05_facade;

/**
 * 外观模式
 * <br> 提供了一个统一的接口，用来访问子系统中的一群接口，从而让子系统更容易使用
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/14 10:11 下午
 */
public class Client
{
	public static void main(String[] args)
	{
		final Facade facade = new Facade();
		facade.watchMovie();
	}
}
