package top.ddoc._02_behaviour._04_iterator;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/12 10:48 下午
 */
public interface Iterator<T>
{
	T next();
	boolean hasNext();
}
