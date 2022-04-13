package top.ddoc._02_behaviour._08_state;

/**
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
