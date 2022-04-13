package top.ddoc._02_behaviour._11_visitor;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/13 11:33 下午
 */
public interface Element
{
	void accept(Visitor visitor);
}
