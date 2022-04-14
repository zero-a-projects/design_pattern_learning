package top.ddoc._03_structural._01_adapter;

/**
 * 适配器模式
 * <br> 把一个类接口转换成另一个用户需要的接口
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/14 10:47 上午
 */
public class Client
{
	public static void main(String[] args)
	{
		final Adapter adapter = new Adapter();
		final Target target = new Adaptee(adapter);
		target.request();
	}
}
