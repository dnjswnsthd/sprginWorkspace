package spring.service.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.service.dao.impl.BrokerDatabaseImpl;
import spring.service.vo.Customer;
import spring.service.vo.Stock;

public class BrokerDISpringTest {
	public static void main(String[] args) {
		 ApplicationContext factory = new ClassPathXmlApplicationContext("/config/brokerservice.xml");
		 BrokerDatabaseImpl broker01 = (BrokerDatabaseImpl)factory.getBean("broker");
		 
		 Customer cust01 = (Customer) factory.getBean("customer01");
		 System.out.println(cust01);
		 
		 Customer cust02 = (Customer) factory.getBean("customer02");
		 System.out.println(cust02);
		 
		 broker01.registerCustomer(new Customer("333", "SpringDI", "대구"));
		 
		 Stock st01 = (Stock) factory.getBean("stock01");
		 System.out.println(st01);
		 
		 Stock st02 = (Stock) factory.getBean("stock02");
		 System.out.println(st02);
		 
		 broker01.registerStock(new Stock("샤오미", 533333.0));
		 
		 broker01.getAllCustomer();
		 
		 broker01.getAllStock();
		 
	}
}