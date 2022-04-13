package top.ddoc._02_behaviour._08_state;

/**
 * 出售的状态
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/13 9:20 下午
 */
public class SoldState extends State
{
	private GumballMachine gumballMachine;

	public SoldState(final GumballMachine gumballMachine)
	{
		this.gumballMachine = gumballMachine;
	}

	@Override public void insertQuarter()
	{
		System.out.println("已投币，请等待糖果发放");
		returnQuarter();
	}

	@Override public void ejectQuarter()
	{
		System.out.println("无法退币，正在发放糖果，请稍后");
	}

	@Override public void turnCrank()
	{
		System.out.println("已按过曲轴，请等待");
	}

	@Override public void dispense()
	{
		int candyCount = gumballMachine.getCandyCount();
		if (candyCount > 0)
		{
			System.out.println("分发一颗糖果");
			gumballMachine.setCandyCount(--candyCount);
			if (candyCount > 0)
			{
				gumballMachine.setState(gumballMachine.noQuarterState);
				return;
			}
		}
		
		System.out.println("非常抱歉糖果已售尽");
		gumballMachine.setState(gumballMachine.soldState);
	}
}
