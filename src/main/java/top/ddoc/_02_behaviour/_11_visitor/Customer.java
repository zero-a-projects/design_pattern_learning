package top.ddoc._02_behaviour._11_visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/13 11:36 下午
 */
public class Customer implements Element
{
	private String name;
	private List<Order> orders = new ArrayList<Order>();

	public Customer(final String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}
	
	public void addOrder(final Order order)
	{
		orders.add(order);
	}

	@Override public void accept(final Visitor visitor)
	{
		visitor.visitor(this);
		for (final Order order : this.orders)
		{
			order.accept(visitor);
		}
	}
}
