package top.ddoc._01_create._04_abstract_factory;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/12$ 5:09 下午$
 */
public class Client
{
	public static void main(String[] args)
	{
		final AbstractFactory concreteFactory1 = new ConcreteFactory1();
		final AbstractProductA productA = concreteFactory1.createProductA();
		final AbstractProductB productB = concreteFactory1.createProductB();
	}
}
