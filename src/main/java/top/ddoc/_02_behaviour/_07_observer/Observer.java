package top.ddoc._02_behaviour._07_observer;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/13 5:38 下午
 */
public interface Observer
{
	void update(float temp, float humidity, float pressure);
}
