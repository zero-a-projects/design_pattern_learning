package top.ddoc._03_structural._07_proxy._03_cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/14 11:28 下午
 */
public class Client
{
	public static void main(String[] args)
	{
		final Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(Target.class);
		enhancer.setCallback(new MethodInterceptorImpl());
		final Target proxy = (Target) enhancer.create();
		proxy.test();
	}
}
