package top.ddoc._03_structural._04_decorator;

/**
 * 适配器模式
 * <br> 为对象动态添加功能
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/14 9:06 下午
 */
public class Client
{
	public static void main(String[] args)
	{
		Beverage beverage = new HouseBlend();
		beverage = new Mocha(beverage);
		beverage = new Milk(beverage);
		System.out.println(beverage.cost());
	}
}
