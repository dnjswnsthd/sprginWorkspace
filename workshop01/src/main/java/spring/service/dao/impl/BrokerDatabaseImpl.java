package spring.service.dao.impl;

import java.util.ArrayList;

import spring.service.dao.BrokerDatabase;
import spring.service.vo.Customer;
import spring.service.vo.Stock;

public class BrokerDatabaseImpl implements BrokerDatabase {

	@Override
	public void registerCustomer(Customer cust) {
		System.out.println(cust.getCustName() + "Customer 추가 완료...");
	}

	@Override
	public void registerStock(Stock st) {
		System.out.println(st.getSymbol() + "Stock 추가 완료...");
	}

	@Override
	public ArrayList<Customer> getAllCustomer() {
		System.out.println("전체 Customer를 반환합니다...");
		return null;
	}

	@Override
	public ArrayList<Stock> getAllStock() {
		System.out.println("전체 Stock를 반환합니다...");
		return null;
	}

}
