package top.ddoc._03_structural._04_decorator;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/14 9:04 下午
 */
public class Mocha extends CondimentDecorator
{
	public Mocha(Beverage beverage)
	{
		this.beverage = beverage;
	}

	@Override public double cost()
	{
		return 1 + beverage.cost();
	}
}
