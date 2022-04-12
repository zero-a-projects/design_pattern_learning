package top.ddoc._01_create._01_singleton;

/**
 * 单例模式-懒汉式-双检锁
 * <br> 线程安全
 * @author zero.wang
 * @date 2022/4/12 2:03 下午
 * @version 1.0
 */
public class _04Singleton
{
	private volatile static _04Singleton INSTANCE;

	private _04Singleton()
	{
	}

	public static _04Singleton getInstance()
	{
		if (null == INSTANCE)
		{
			synchronized(_04Singleton.class)
			{
				if (null == INSTANCE)
				{ INSTANCE = new _04Singleton(); }
			}
		}
		return INSTANCE;
	}
}
