package inheritance;

import java.util.Iterator;

public class CustomerManager {
	public void add(Customer customer) {
		System.out.println(customer.customerNamber + " kaydedildi.");
	}
	public void addMultiple(Customer[] customers) {
		for(Customer customer : customers) {
			add(customer);
		}
	}
}
