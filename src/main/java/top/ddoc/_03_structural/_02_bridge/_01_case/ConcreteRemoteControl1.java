package top.ddoc._03_structural._02_bridge._01_case;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/14 4:29 下午
 */
public class ConcreteRemoteControl1 extends RemoteControl
{
	public ConcreteRemoteControl1(final TV tv)
	{
		super(tv);
	}

	@Override public void on()
	{
		System.out.println("ConcreteRemoteControl1::on");
		this.tv.on();
	}

	@Override public void off()
	{
		System.out.println("ConcreteRemoteControl1::off");
		this.tv.off();
	}

	@Override public void tuneChannel()
	{
		System.out.println("ConcreteRemoteControl1::tuneChannel");
		this.tv.tuneChannel();
	}
}
