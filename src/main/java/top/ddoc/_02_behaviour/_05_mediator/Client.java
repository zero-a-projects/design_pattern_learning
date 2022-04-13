package top.ddoc._02_behaviour._05_mediator;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/13 12:23 下午
 */
public class Client
{
	public static void main(String[] args)
	{
		Alarm alarm = new Alarm();
		CoffeePot coffeePot = new CoffeePot();
		Calender calender = new Calender();
		Sprinkler sprinkler = new Sprinkler();
		Mediator mediator = new ConcreteMediator(alarm, coffeePot, calender, sprinkler);
		// 闹钟事件到达，调用中介者就可以操作相关对象
		alarm.onEvent(mediator);
	}
}
