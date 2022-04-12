package top.ddoc._02_behaviour._04_iterator;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/12 10:51 下午
 */
public class ConcreteIterator<T> implements Iterator<T>
{
	private T[] items;
	private int position;

	public ConcreteIterator(final T[] items)
	{
		this.items = items;
	}

	@Override public T next()
	{
		return items[position++];
	}

	@Override public boolean hasNext()
	{
		return items.length > position;
	}
}
