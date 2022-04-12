package top.ddoc._02_behaviour._02_command;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/12 9:42 下午
 */
public class LightOffCommand implements Command
{
	Light light;

	public LightOffCommand(final Light light)
	{
		this.light = light;
	}

	@Override public void execute()
	{
		light.off();
	}
}
