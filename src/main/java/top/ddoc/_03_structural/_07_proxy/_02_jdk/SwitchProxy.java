package top.ddoc._03_structural._07_proxy._02_jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/14 10:45 下午
 */
public class SwitchProxy implements InvocationHandler
{
	private Switch switch_;

	public SwitchProxy(final Switch switch_)
	{
		this.switch_ = switch_;
	}

	@Override public Object invoke(final Object proxy, final Method method, final Object[] args) throws Throwable
	{
		System.out.println("Before operation does something");
		final Object result = method.invoke(this.switch_, args);
		System.out.println("After operation does something");
		return result;
	}
	
	public Switch getProxy()
	{
		return (Switch) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), switch_.getClass().getInterfaces(),
				this);
	}
}
