package top.ddoc._03_structural._06_flyweight;

/**
 * 享元模式
 * <br> 利用共享的方式来支持大量细粒度的对象，这些对象一部分内部状态是相同的
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/14 10:25 下午
 */
public class Client
{
	public static void main(String[] args)
	{
		final FlyweightFactory flyweightFactory = new FlyweightFactory();
		final Flyweight flyweight1 = flyweightFactory.getFlyweight("aa");
		final Flyweight flyweight2 = flyweightFactory.getFlyweight("aa");
		flyweight1.doOperation("x");
		flyweight2.doOperation("y");
	}
}
