package top.ddoc._01_create._02_simple_factory;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/12$ 4:22 下午$
 */
public class SimpleFactory
{
	public Product createProduct(int type)
	{
		if (Type.ONE == type)
		{ return new ConcreteProduct1(); }
		else if (Type.TWO == type)
		{ return new ConcreteProduct2(); }
		else if (Type.THREE == type)
		{ return new ConcreteProduct3(); }
		return null;
	}

	public static class Type
	{
		public static final int ONE = 1;
		public static final int TWO = 2;
		public static final int THREE = 3;
	}
}
