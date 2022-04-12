package top.ddoc._01_create._05_builder;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/12$ 8:53 下午$
 */
public abstract class Builder
{
	protected Product product;

	public Builder()
	{
		this.product = new Product();
	}

	public abstract void buildPart();
	public abstract Product getResult();
}
