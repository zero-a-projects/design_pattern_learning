package top.ddoc._03_structural._01_adapter;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/14 10:43 上午
 */
public class Adaptee extends Target
{
	private Adapter adapter;

	public Adaptee(final Adapter adapter)
	{
		this.adapter = adapter;
	}

	@Override public void request()
	{
		this.adapter.specificRequest();
	}
}
