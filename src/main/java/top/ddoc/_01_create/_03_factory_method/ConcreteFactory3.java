package top.ddoc._01_create._03_factory_method;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/12$ 4:53 下午$
 */
public class ConcreteFactory3 extends Factory
{
	@Override public Product factoryMethod()
	{
		return new ConcreteProduct3();
	}
}
