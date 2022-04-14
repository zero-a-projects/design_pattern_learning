package top.ddoc._03_structural._04_decorator;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/14 9:02 下午
 */
public class Milk extends CondimentDecorator
{
	public Milk(Beverage beverage)
	{
		this.beverage = beverage;
	}

	@Override public double cost()
	{
		return 1 + beverage.cost();
	}
}
