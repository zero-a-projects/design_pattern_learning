package top.ddoc._01_create._03_factory_method;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/12$ 4:54 下午$
 */
public class Client
{
	public static void main(String[] args)
	{
		final ConcreteFactory1 concreteFactory1 = new ConcreteFactory1();
		final ConcreteFactory1 concreteFactory2 = new ConcreteFactory1();
		final ConcreteFactory1 concreteFactory3 = new ConcreteFactory1();

		final Product product1 = concreteFactory1.factoryMethod();
		final Product product2 = concreteFactory2.factoryMethod();
		final Product product3 = concreteFactory3.factoryMethod();
	}
}
