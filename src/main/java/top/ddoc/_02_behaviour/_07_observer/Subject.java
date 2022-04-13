package top.ddoc._02_behaviour._07_observer;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/13 5:37 下午
 */
public interface Subject
{
	void registerObserver(Observer observer);
	
	void removeObserver(Observer observer);
	
	void notifyObserver();
}
