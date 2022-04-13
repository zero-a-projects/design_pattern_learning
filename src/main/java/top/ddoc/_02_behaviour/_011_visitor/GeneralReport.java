package top.ddoc._02_behaviour._011_visitor;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/13 11:41 下午
 */
public class GeneralReport implements Visitor
{
	private int customersNo;
	private int ordersNo;
	private int itemsNo;
	
	@Override public void visitor(final Customer customer)
	{
		System.out.println(customer.getName());
		customersNo ++;
	}

	@Override public void visitor(final Order order)
	{
		System.out.println(order.getName());
		ordersNo ++;
	}

	@Override public void visitor(final Item item)
	{
		System.out.println(item.getName());
		itemsNo ++;
	}
	
	public void displayResults()
	{
		System.out.println("Number of customers: " + customersNo);
		System.out.println("Number of orders: " + ordersNo);
		System.out.println("Number of items: " + itemsNo);
	}
}
