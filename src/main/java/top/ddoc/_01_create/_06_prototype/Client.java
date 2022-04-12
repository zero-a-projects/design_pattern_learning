package top.ddoc._01_create._06_prototype;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/12$ 9:12 下午$
 */
public class Client
{
	public static void main(String[] args)
	{
		final ConcretePrototype1 concretePrototype1 = new ConcretePrototype1();
		final Prototype clone = concretePrototype1.clone();

	}
}
