package top.ddoc._03_structural._07_proxy._02_jdk;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/14 10:44 下午
 */
public class ButtonSwitch implements Switch
{
	@Override public void on()
	{
		System.out.println("Open the button switch");
	}

	@Override public void off()
	{
		System.out.println("Close the button switch");
	}
}
