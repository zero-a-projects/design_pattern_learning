package top.ddoc._01_create._05_builder;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/12$ 9:05 下午$
 */
public class Client
{
	public static void main(String[] args)
	{
		final Builder builder = new ConcreteBuilder();
		final Director director = new Director();
		director.construct(builder);
		final Product product = builder.getResult();
	}
}
