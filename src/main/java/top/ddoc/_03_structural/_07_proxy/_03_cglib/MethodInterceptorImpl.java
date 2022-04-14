package top.ddoc._03_structural._07_proxy._03_cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/14 11:29 下午
 */
public class MethodInterceptorImpl implements MethodInterceptor
{
	@Override public Object intercept(final Object o, final Method method, final Object[] objects,
			final MethodProxy methodProxy) throws Throwable
	{
		System.out.println("Before operation does something");
		final Object result = methodProxy.invokeSuper(o, objects);
		System.out.println("After operation does something");
		return result;
	}
}
