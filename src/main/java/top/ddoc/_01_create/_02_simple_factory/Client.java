package top.ddoc._01_create._02_simple_factory;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/12$ 4:30 下午$
 */
public class Client
{
	public static void main(String[] args)
	{
		final SimpleFactory simpleFactory = new SimpleFactory();
		final Product product = simpleFactory.createProduct(SimpleFactory.Type.ONE);
		// 对 product 做些说明
	}
}
