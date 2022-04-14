package top.ddoc._03_structural._03_composite;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/14 6:16 下午
 */
public class Client
{
	public static void main(String[] args)
	{
		final Composite root = new Composite("root");
		final Component node1 = new Leaf("1");
		final Component node2 = new Composite("2");
		final Component node3 = new Leaf("3");
		root.add(node1);
		root.add(node2);
		root.add(node3);

		final Component node21 = new Leaf("21");
		final Component node22 = new Composite("22");
		node2.add(node21);
		node2.add(node22);

		Component node221 = new Leaf("221");
		node22.add(node221);
		
		root.print();
	}
}
