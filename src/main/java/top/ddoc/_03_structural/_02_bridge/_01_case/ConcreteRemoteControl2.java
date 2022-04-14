package top.ddoc._03_structural._02_bridge._01_case;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/14 4:29 下午
 */
public class ConcreteRemoteControl2 extends RemoteControl
{
	public ConcreteRemoteControl2(final TV tv)
	{
		super(tv);
	}

	@Override public void on()
	{
		System.out.println("ConcreteRemoteControl2::on");
		this.tv.on();
	}

	@Override public void off()
	{
		System.out.println("ConcreteRemoteControl2::off");
		this.tv.off();
	}

	@Override public void tuneChannel()
	{
		System.out.println("ConcreteRemoteControl2::tuneChannel");
		this.tv.tuneChannel();
	}
}
