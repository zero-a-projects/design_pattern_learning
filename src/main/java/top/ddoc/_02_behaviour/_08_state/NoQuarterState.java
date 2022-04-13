package top.ddoc._02_behaviour._08_state;

/**
 * 没有硬币的状态
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/13 8:33 下午
 */
public class NoQuarterState extends State
{
	private GumballMachine gumballMachine;

	public NoQuarterState(final GumballMachine gumballMachine)
	{
		this.gumballMachine = gumballMachine;
	}

	@Override public void insertQuarter()
	{
		System.out.println("你投入了一个硬币");
		// 转换为有硬币状态
		this.gumballMachine.setState(gumballMachine.hasQuarterState);
	}

	@Override public void ejectQuarter()
	{
		System.out.println("没有硬币，无法弹出");
	}

	@Override public void turnCrank()
	{
		System.out.println("请先投币");
	}

	@Override public void dispense()
	{
		System.out.println("没有投币，无法发放糖果");
	}
}
