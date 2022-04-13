package top.ddoc._02_behaviour._08_state;

/**
 * 糖果机
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/13 9:16 下午
 */
public class GumballMachine extends State
{
	public State noQuarterState = new NoQuarterState(this);
	public State hasQuarterState = new HasQuarterState(this);
	public State soldState = new SoldState(this);
	public State soldOutState = new SoldOutState(this);

	/** 糖果机状态 */
	private State state = soldOutState;
	/** 糖果数量 */
	private int candyCount = 0;

	public GumballMachine(int candyCount)
	{
		this.candyCount = candyCount;
		if (this.candyCount > 0)
		{ this.setState(noQuarterState); }
	}

	@Override public void insertQuarter()
	{
		state.insertQuarter();
	}

	@Override public void ejectQuarter()
	{
		state.ejectQuarter();
	}

	@Override public void turnCrank()
	{
		state.turnCrank();
	}

	@Override public void dispense()
	{
		state.dispense();
	}

	public State getState()
	{
		return state;
	}

	public void setState(final State state)
	{
		this.state = state;
	}

	public int getCandyCount()
	{
		return candyCount;
	}

	public void setCandyCount(final int candyCount)
	{
		this.candyCount = candyCount;
	}
}
