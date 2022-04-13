package top.ddoc._02_behaviour._011_visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zero.wang
 * @version 1.0
 * @date 2022/4/13 11:36 下午
 */
public class CustomerGroup
{
	private List<Customer> customers = new ArrayList<>();

	void accept(Visitor visitor) {
		for (Customer customer : customers) {
			customer.accept(visitor);
		}
	}

	void addCustomer(Customer customer) {
		customers.add(customer);
	}
}
