package top.ddoc._03_structural._03_composite;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/14 5:59 下午
 */
public class Leaf extends Component
{
	public Leaf(final String name)
	{
		super(name);
	}

	@Override public void print(final int level)
	{
		for (int i = 0; i < level; i++)
		{
			System.out.print("--");
		}
		System.out.println("left:" + name);
	}

	@Override public void add(final Component component)
	{
		throw new UnsupportedOperationException();
	}

	@Override public void remove(final Component component)
	{
		throw new UnsupportedOperationException();
	}
}
