package top.ddoc._03_structural._02_bridge._01_case;

/**
 * 桥接模式
 * <br> 将抽象与实现分离开来，使它们可以独立变化。
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/14 4:32 下午
 */
public class Client
{
	public static void main(String[] args)
	{
		final RemoteControl remoteControl1 = new ConcreteRemoteControl1(new RCA());
		remoteControl1.on();
		remoteControl1.off();
		remoteControl1.tuneChannel();
		final RemoteControl remoteControl2 = new ConcreteRemoteControl2(new Sony());
		remoteControl2.on();
		remoteControl2.off();
		remoteControl2.tuneChannel();
	}
}
