package spring.service.test;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.service.domain.MemberVO;
import spring.service.user.MemberDAO;
import spring.service.user.MemberService;

public class MyBatisMemberTestApp {
	///Main method
		public static void main(String[] args) throws Exception{
			SqlSessionFactory factory = TestUtil.getSqlSessionFactory();
			
			ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "/bean/memberservice.xml" });
			
			MemberService memberService = (MemberService) context.getBean("memberServiceImpl");
			MemberDAO memberDAO = (MemberDAO) context.getBean("memberDAOImpl");
			MemberVO member = new MemberVO("bnk1234","bnk1234","구자명", "서울");
			
			// 1. registerMember
			if(memberService.registerMember(member) == 1)
				System.out.println("1. registerMember(INSERT) : 1건 등록");
			else
				System.out.println("등록 실패");
			
			// 2. deleteMember
			/*if(memberDAO.deleteMember(member.getId()) == 1) 
				System.out.println("2. deleteMember(DELETE) : 1건 삭제");
			else
				System.out.println("삭제 실패");
			*/
			
			// 3. updateMember
			member.setName("변경됨");
			if(memberService.updateMember(member) == 1)
				System.out.println("3. updateMember(UPDATE) : 1건 수정");
			else {
				System.out.println("수정 실패");
			}
			
			// 4. showAllMember
			System.out.println("4. showAllMember(SELECT LIST)");
			TestUtil.printList(memberService.showAllMember());
			
			// 5. getMember
			System.out.println("5. getMember(SELECT ONE)");
			System.out.println(memberService.getMember(member.getId()));
			
			// 6. isExist
			System.out.println("6. isExist (아이디 중복체크)");
			if(memberService.idExist(member.getId()))
				System.out.println("가입가능한 아이디입니다.");
			else
				System.out.println("이미 있는 아이디입니다.");
				
			// 7. login
			System.out.println("7. LOGIN (아이디 && 패스워드 존재 확인) ");
			if(memberService.login(member.getId(), member.getPassword()))
				System.out.println("로그인 되었습니다.");
			else
				System.out.println("로그인 실패 다시 한 번 입력해주세요");
			
		}//end of main
}
