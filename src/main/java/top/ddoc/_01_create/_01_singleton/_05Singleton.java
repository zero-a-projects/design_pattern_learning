package top.ddoc._01_create._01_singleton;

/**
 * 单例模式-饿汉式-内部静态类
 * <br> 线程安全
 * @author zero.wang
 * @date 2022/4/12 2:03 下午
 * @version 1.0
 */
public class _05Singleton
{
	private _05Singleton() {
	}

	private static class SingletonHolder {
		private static final _05Singleton INSTANCE = new _05Singleton();
	}

	public static _05Singleton getInstance() {
		return SingletonHolder.INSTANCE;
	}
}
