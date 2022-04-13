package top.ddoc._02_behaviour._11_visitor;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/13 11:34 下午
 */
public interface Visitor
{
	void visitor(Customer customer);
	void visitor(Order order);
	void visitor(Item item);
}
