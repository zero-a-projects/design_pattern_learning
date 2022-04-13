package top.ddoc._02_behaviour._08_state;

/**
 * 状态模式
 * <br> 允许对象在内部状态改变时改变它的行为，对象看起来好像修改了它所属的类。
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/13 10:48 下午
 */
public class Client
{
	public static void main(String[] args)
	{
		final GumballMachine gm = new GumballMachine(10);
		
		// 投币 =》 退币
		gm.insertQuarter();
		gm.ejectQuarter();
		gm.ejectQuarter();
		gm.insertQuarter();
		gm.turnCrank();
		gm.dispense();
		
	}
}
