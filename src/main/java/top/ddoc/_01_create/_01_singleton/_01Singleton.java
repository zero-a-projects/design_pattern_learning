package top.ddoc._01_create._01_singleton;

/**
 * 单例模式-懒汉式
 * <br> 线程非安全-不推荐
 * @author zero.wang
 * @date 2022/4/12 2:03 下午
 * @version 1.0
 */
public class _01Singleton
{
	private static _01Singleton INSTANCE;

	private _01Singleton()
	{
	}

	public static _01Singleton getInstance()
	{
		if (null == INSTANCE)
		{ INSTANCE = new _01Singleton(); }
		return INSTANCE;
	}
}
