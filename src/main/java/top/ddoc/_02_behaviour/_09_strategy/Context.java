package top.ddoc._02_behaviour._09_strategy;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/13 11:13 下午
 */
public class Context
{
	private Strategy strategy;

	public Context(final Strategy strategy)
	{
		this.strategy = strategy;
	}
	
	public void  doSomething()
	{
		this.strategy.behavior();
	}

	public void setStrategy(final Strategy strategy)
	{
		this.strategy = strategy;
	}
}
