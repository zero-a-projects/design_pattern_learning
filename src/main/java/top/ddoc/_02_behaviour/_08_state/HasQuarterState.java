package top.ddoc._02_behaviour._08_state;

/**
 * 投硬币的状态
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/13 9:19 下午
 */
public class HasQuarterState extends State
{
	private GumballMachine gumballMachine;

	public HasQuarterState(final GumballMachine gumballMachine)
	{
		this.gumballMachine = gumballMachine;
	}

	@Override public void insertQuarter()
	{
		System.out.println("请不要重复投币！");
		returnQuarter();
	}

	@Override public void ejectQuarter()
	{
		returnQuarter();
		gumballMachine.setState(gumballMachine.noQuarterState);
	}

	@Override public void turnCrank()
	{
		System.out.println("转动曲轴，准备发糖");
		gumballMachine.setState(gumballMachine.soldState);
	}

	@Override public void dispense()
	{
		System.out.println("请先转动曲轴！");
	}
}
