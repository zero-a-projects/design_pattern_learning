package top.ddoc._02_behaviour._05_mediator;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/13 12:18 下午
 */
public class Sprinkler extends Colleague
{
	@Override public void onEvent(final Mediator mediator)
	{
		mediator.doEvent("sprinkler");
	}
	
	public void doSprinkler()
	{
		System.out.println("doSprinkler");
	}
}
