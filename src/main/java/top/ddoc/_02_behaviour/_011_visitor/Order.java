package top.ddoc._02_behaviour._011_visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/13 11:37 下午
 */
public class Order implements Element
{
	private String name;
	private List<Item> items = new ArrayList<Item>();

	public Order(final String name)
	{
		this.name = name;
	}

	public Order(final String name, final String itemName)
	{
		this.name = name;
		this.items.add(new Item(itemName));
	}

	public String getName()
	{
		return name;
	}

	public void addItem(final Item item)
	{
		items.add(item);
	}
	
	@Override public void accept(final Visitor visitor)
	{
		visitor.visitor(this);
		for (final Item item : this.items)
		{
			item.accept(visitor);
		}
	}
}
