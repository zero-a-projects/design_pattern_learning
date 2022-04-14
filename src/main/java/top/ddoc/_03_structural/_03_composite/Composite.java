package top.ddoc._03_structural._03_composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/14 5:56 下午
 */
public class Composite extends Component
{
	private List<Component> child;
	
	public Composite(final String name)
	{
		super(name);
		child = new ArrayList<Component>();
	}

	@Override public void print(final int level)
	{
		for (int i = 0; i < level; i++)
		{
			System.out.print("--");
		}
		System.out.println("Composite:" + name);
		for (final Component component : child)
		{
			component.print(level + 1);
		}
	}

	@Override public void add(final Component component)
	{
		child.add(component);
	}

	@Override public void remove(final Component component)
	{
		child.remove(component);
	}
}
