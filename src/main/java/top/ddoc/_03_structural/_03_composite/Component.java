package top.ddoc._03_structural._03_composite;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/14 5:44 下午
 */
public abstract class Component
{
	protected String name;

	public Component(final String name)
	{
		this.name = name;
	}
	
	public void print()
	{
		this.print(0);
	}
	
	public abstract void print(int level);
	
	public abstract void add(Component component);
	
	public abstract void remove(Component component);
}
