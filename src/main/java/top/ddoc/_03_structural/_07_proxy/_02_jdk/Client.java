package top.ddoc._03_structural._07_proxy._02_jdk;

import java.lang.reflect.Proxy;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/14 10:55 下午
 */
public class Client
{
	public static void main(String[] args)
	{
		final Switch aSwitch = new ButtonSwitch();
		final SwitchProxy switchProxy = new SwitchProxy(aSwitch);
		final Switch proxy = switchProxy.getProxy();
		proxy.on();
	}
}
