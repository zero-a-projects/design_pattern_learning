package top.ddoc._02_behaviour._07_observer;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/13 5:46 下午
 */
public class StatisticsDisplay implements Observer
{
	public StatisticsDisplay(Subject subject)
	{ subject.registerObserver(this); }

	@Override public void update(final float temp, final float humidity, final float pressure)
	{
		System.out.println("StatisticsDisplay.update: " + temp + " " + humidity + " " + pressure);
	}
}
