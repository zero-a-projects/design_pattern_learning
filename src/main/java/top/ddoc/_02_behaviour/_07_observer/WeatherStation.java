package top.ddoc._02_behaviour._07_observer;

/**
 * 观察者模式
 * <br>定义对象之间的一对多依赖，当一个对象状态改变时，它的所有依赖都会收到通知并且自动更新状态。
 * <br> 主题（Subject）是被观察的对象，而其所有依赖者（Observer）称为观察者。
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/13 5:48 下午
 */
public class WeatherStation
{
	public static void main(String[] args)
	{
		final WeatherData weatherData = new WeatherData();
		final Observer statisticsDisplay = new StatisticsDisplay(weatherData);
		final Observer currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

		weatherData.setMeasurements(0, 0, 0);
		weatherData.setMeasurements(1, 1, 1);
	}
}
