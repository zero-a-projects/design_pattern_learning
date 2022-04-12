package top.ddoc._01_create._01_singleton;

/**
 * 单例模式-饿汉式
 * <br> 线程安全
 * @author zero.wang
 * @date 2022/4/12 2:03 下午
 * @version 1.0
 */
public class _03Singleton
{
	private static _03Singleton INSTANCE = new _03Singleton();;

	private _03Singleton()
	{
	}

	public static _03Singleton getInstance()
	{
		return INSTANCE;
	}
}
