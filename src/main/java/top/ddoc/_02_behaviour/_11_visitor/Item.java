package top.ddoc._02_behaviour._11_visitor;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/13 11:37 下午
 */
public class Item implements Element
{
	private String name;

	public Item(final String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	@Override public void accept(final Visitor visitor)
	{
		visitor.visitor(this);
	}
}
