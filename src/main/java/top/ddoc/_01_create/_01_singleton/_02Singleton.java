package top.ddoc._01_create._01_singleton;

/**
 * 单例模式-懒汉式
 * <br> 线程安全-不推荐
 * @author zero.wang
 * @date 2022/4/12 2:03 下午
 * @version 1.0
 */
public class _02Singleton
{
	private static _02Singleton INSTANCE;

	private _02Singleton()
	{
	}

	public static synchronized _02Singleton getInstance()
	{
		if (null == INSTANCE)
		{ INSTANCE = new _02Singleton(); }
		return INSTANCE;
	}
}
