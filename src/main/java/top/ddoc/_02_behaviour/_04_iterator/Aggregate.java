package top.ddoc._02_behaviour._04_iterator;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/12 10:59 下午
 */
public interface Aggregate<Integer>
{
	Iterator<Integer> createIterator();
}
