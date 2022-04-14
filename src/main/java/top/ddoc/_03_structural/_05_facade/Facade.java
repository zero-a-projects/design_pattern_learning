package top.ddoc._03_structural._05_facade;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/14 10:11 下午
 */
public class Facade
{
	private SubSystem subSystem = new SubSystem();

	public void watchMovie() 
	{
		subSystem.turnOnTV();
		subSystem.setCD("a movie");
		subSystem.startWatching();
	}
}
