package top.ddoc._02_behaviour._08_state;

/**
 * 售尽的状态
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/13 9:21 下午
 */
public class SoldOutState extends State
{
	private GumballMachine gumballMachine;

	public SoldOutState(final GumballMachine gumballMachine)
	{
		this.gumballMachine = gumballMachine;
	}

	@Override public void insertQuarter()
	{
		System.out.println("糖果已售尽，无法进行投币");
		returnQuarter();
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
