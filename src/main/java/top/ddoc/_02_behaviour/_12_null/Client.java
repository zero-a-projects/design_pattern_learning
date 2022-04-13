package top.ddoc._02_behaviour._12_null;

/**
 * "空"对象
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/14 12:20 上午
 */
public class Client
{
	public static void main(String[] args)
	{
		final AbstractOperation abstractOperation = fun(1);
		abstractOperation.request();
	}
	
	private static AbstractOperation fun(int para)
	{
		if (para < 0)
		{ return new NullOperation(); }
		return new RealOperation();
	}
}
