package spring.service.hello.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import spring.service.hello.Greet;

public class GreetTestApp04UseSpring {

	/// main method
	public static void main(String[] args) {
		
		//1. BeanFactory(Spring Container(?))을 이용 xml 에 선언적으로 기술된 instance 정보 획득
		BeanFactory factory =
				new XmlBeanFactory( new FileSystemResource
				("./src/main/resources/config/greet.xml") );

		//2. Container 로 부터 hello 의 name 을 갖는 instance return 받기  
//		Greet greet = (Greet)factory.getBean("greet1");
//		greet.sayMessage();
		////////////////////
//		Greet greet = (Greet)factory.getBean("greet2");
//		greet.sayMessage();
		
//		Greet greet = (Greet)factory.getBean("greet3");
//		greet.sayMessage();
		
//		Greet greet = (Greet)factory.getBean("greet4");
//		greet.sayMessage();
		
//		Greet greet = (Greet)factory.getBean("greet5");
//		greet.sayMessage();
		
		Greet greet = (Greet)factory.getBean("greet6");
		greet.sayMessage();
	}
	
}//end of class