package top.ddoc._03_structural._02_bridge._01_case;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/14 4:27 下午
 */
public class RCA extends TV
{
	@Override public void on()
	{
		System.out.println("RCA::on");
	}

	@Override public void off()
	{
		System.out.println("RCA::off");
	}

	@Override public void tuneChannel()
	{
		System.out.println("RCA::tuneChannel");
	}
}
