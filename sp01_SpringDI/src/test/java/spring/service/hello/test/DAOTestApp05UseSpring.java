package spring.service.hello.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import spring.service.dao.MemberDAO;

public class DAOTestApp05UseSpring {

	/// main method
	public static void main(String[] args) {
		
		//1. BeanFactory(Spring Container(?))을 이용 xml 에 선언적으로 기술된 instance 정보 획득
		BeanFactory factory =
				new XmlBeanFactory( new FileSystemResource
				("./src/main/resources/config/dao.xml") );
		
		// 2. 빈을 얻어와서
		MemberDAO member = (MemberDAO)factory.getBean("dao");
		
		// 3. 비지니스 로직을 호출.. 값은 여기서 주입
		member.register("bnk", "1234");
		
		member.delete("bnk");
		
	}
	
}//end of class