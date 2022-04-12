package top.ddoc._02_behaviour._04_iterator;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/12 10:55 下午
 */
public class Client
{
	public static void main(String[] args)
	{
		final Aggregate<Integer> aggregate = new ConcreteAggregate();
		final Iterator<Integer> iterator = aggregate.createIterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
}
