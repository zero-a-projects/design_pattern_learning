package top.ddoc._02_behaviour._04_iterator;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/12 10:59 下午
 */
public class ConcreteAggregate implements Aggregate<Integer>
{
	private Integer[] items;

	public ConcreteAggregate() {
		items = new Integer[10];
		for (int i = 0; i < items.length; i++) {
			items[i] = i;
		}
	}

	@Override
	public Iterator<Integer> createIterator() {
		return new ConcreteIterator<Integer>(items);
	}
}
