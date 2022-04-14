package top.ddoc._03_structural._07_proxy._01_static;

/**
 * 代理模式（静态）
 * <br> 控制对其它对象的访问
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/14 10:36 下午
 */
public class Client
{
	public static void main(String[] args)
	{
		final RealSubject realSubject = new RealSubject();
		final ProxySubject proxySubject = new ProxySubject(realSubject);
		proxySubject.doOperation();
	}
}
