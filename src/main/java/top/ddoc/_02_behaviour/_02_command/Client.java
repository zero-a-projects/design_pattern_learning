package top.ddoc._02_behaviour._02_command;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/12 9:54 下午
 */
public class Client
{
	public static void main(String[] args)
	{
		Invoker invoker = new Invoker();
		Light light = new Light();
		Command lightOnCommand = new LightOnCommand(light);
		Command lightOffCommand = new LightOffCommand(light);
		invoker.setOnCommand(lightOnCommand, 0);
		invoker.setOffCommand(lightOffCommand, 0);
		invoker.onButtonWasPushed(0);
		invoker.offButtonWasPushed(0);
	}
}
