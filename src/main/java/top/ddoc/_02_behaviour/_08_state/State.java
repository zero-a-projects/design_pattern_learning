package top.ddoc._02_behaviour._08_state;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/13 7:24 下午
 */
public abstract class State
{
	/** 投币 */
	public abstract void insertQuarter();

	/** 退币 */
	public abstract void ejectQuarter();

	/** 转动出糖曲轴 */
	public abstract void turnCrank();

	/** 发糖 */
	public abstract void dispense();

	/** 退还硬币 */
	public void returnQuarter()
	{
		System.out.println("退币.....");
	}
}
