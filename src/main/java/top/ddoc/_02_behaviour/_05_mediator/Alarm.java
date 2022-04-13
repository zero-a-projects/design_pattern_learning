package top.ddoc._02_behaviour._05_mediator;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/13 12:17 下午
 */
public class Alarm extends Colleague
{
	@Override public void onEvent(final Mediator mediator)
	{
		mediator.doEvent("alarm");
	}
	
	public void doAlarm()
	{
		System.out.println("doAlarm");
	}
}
