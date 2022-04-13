package top.ddoc._02_behaviour._05_mediator;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/13 12:21 下午
 */
public class ConcreteMediator extends Mediator
{
	private Alarm alarm;
	private CoffeePot coffeePot;
	private Calender calender;
	private Sprinkler sprinkler;

	public ConcreteMediator(final Alarm alarm, final CoffeePot coffeePot, final Calender calender,
			final Sprinkler sprinkler)
	{
		this.alarm = alarm;
		this.coffeePot = coffeePot;
		this.calender = calender;
		this.sprinkler = sprinkler;
	}

	@Override public void doEvent(final String eventType)
	{
		switch (eventType) {
		case "alarm":
			doAlarmEvent();
			break;
		case "coffeePot":
			doCoffeePotEvent();
			break;
		case "calender":
			doCalenderEvent();
			break;
		default:
			doSprinklerEvent();
		}
	}

	public void doAlarmEvent() {
		alarm.doAlarm();
		coffeePot.doCoffeePot();
		calender.doCalender();
		sprinkler.doSprinkler();
	}

	public void doCoffeePotEvent() {
		// ...
	}

	public void doCalenderEvent() {
		// ...
	}

	public void doSprinklerEvent() {
		// ...
	}
}
