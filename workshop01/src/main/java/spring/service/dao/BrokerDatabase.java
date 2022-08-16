package spring.service.dao;

import java.util.ArrayList;

import spring.service.vo.Customer;
import spring.service.vo.Stock;

public interface BrokerDatabase {
	void registerCustomer(Customer cust);
	
	void registerStock(Stock st);
	
	ArrayList<Customer> getAllCustomer();
	
	ArrayList<Stock> getAllStock();
}
