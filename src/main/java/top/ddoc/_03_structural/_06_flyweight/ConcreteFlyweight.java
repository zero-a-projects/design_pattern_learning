package top.ddoc._03_structural._06_flyweight;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/14 10:20 下午
 */
public class ConcreteFlyweight implements Flyweight
{
	private String intrinsicState;

	public ConcreteFlyweight(final String intrinsicState)
	{
		this.intrinsicState = intrinsicState;
	}

	@Override public void doOperation(final String extrinsicState)
	{
		System.out.println("Object address: " + System.identityHashCode(this));
		System.out.println("IntrinsicState: " + intrinsicState);
		System.out.println("ExtrinsicState: " + extrinsicState);
	}
}
