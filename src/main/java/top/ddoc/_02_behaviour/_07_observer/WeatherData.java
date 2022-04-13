package top.ddoc._02_behaviour._07_observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/13 5:40 下午
 */
public class WeatherData implements Subject
{
	private List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData()
	{
		this.observers = new ArrayList<Observer>();
	}

	public void setMeasurements(float temperature, float humidity, float pressure)
	{
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		notifyObserver();
	}
	
	@Override public void registerObserver(final Observer observer)
	{
		observers.add(observer);
	}

	@Override public void removeObserver(final Observer observer)
	{
		observers.remove(observer);
	}

	@Override public void notifyObserver()
	{
		for (final Observer observer : observers)
		{ observer.update(this.temperature, this.humidity, this.pressure); }
	}
}
