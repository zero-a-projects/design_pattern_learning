package top.ddoc._01_create._04_abstract_factory;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/12$ 5:06 下午$
 */
public class ConcreteFactory1 extends AbstractFactory
{
	@Override public AbstractProductA createProductA()
	{
		return new ProductA1();
	}

	@Override public AbstractProductB createProductB()
	{
		return new ProductB1();
	}
}
