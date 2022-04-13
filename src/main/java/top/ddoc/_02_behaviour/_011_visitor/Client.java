package top.ddoc._02_behaviour._011_visitor;

/**
 * 访问者模式
 * <br> 为一个对象结构（比如组合结构）增加新能力。
 * <br> Visitor：访问者，为每一个 ConcreteElement 声明一个 visit 操作
 * <br> ConcreteVisitor：具体访问者，存储遍历过程中的累计结果
 * <br> ObjectStructure：对象结构，可以是组合结构，或者是一个集合。
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/13 11:53 下午
 */
public class Client
{
	public static void main(String[] args)
	{
		final Customer customer1 = new Customer("customer1");
		customer1.addOrder(new Order("order1", "item1"));
		customer1.addOrder(new Order("order2", "item1"));
		customer1.addOrder(new Order("order3", "item1"));
		
		final Order order1 = new Order("order");
		order1.addItem(new Item("item_a"));
		order1.addItem(new Item("item_b"));
		order1.addItem(new Item("item_c"));
		final Customer customer2 = new Customer("customer1");
		customer2.addOrder(order1);

		final CustomerGroup cg = new CustomerGroup();
		cg.addCustomer(customer1);
		cg.addCustomer(customer2);
		
		final GeneralReport visitor = new GeneralReport();
		cg.accept(visitor);
		visitor.displayResults();
		
		
		
		
		

	}
}
