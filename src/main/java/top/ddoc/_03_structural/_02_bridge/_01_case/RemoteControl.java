package top.ddoc._03_structural._02_bridge._01_case;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/14 4:29 下午
 */
public abstract class RemoteControl
{
	protected TV tv;

	public RemoteControl(final TV tv)
	{
		this.tv = tv;
	}

	public abstract void on();

	public abstract void off();

	public abstract void tuneChannel();
}
