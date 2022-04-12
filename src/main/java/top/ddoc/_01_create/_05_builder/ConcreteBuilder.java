package top.ddoc._01_create._05_builder;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/12$ 8:55 下午$
 */
public class ConcreteBuilder extends Builder
{
	@Override public void buildPart()
	{
		super.product.setName("project name");
		super.product.setSize(10);
	}

	@Override public Product getResult()
	{
		return super.product;
	}
}
