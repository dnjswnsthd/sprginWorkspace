package spring.service.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import spring.service.domain.MemberVO;

public class MyBatisUnitTest {
	/// Main method
	public static void main(String[] args) throws Exception {

		SqlSession session = null;
		SqlSessionFactory factory = TestUtil.getSqlSessionFactory();
		session = factory.openSession();

		// ==> Test 용 User instance 생성
		MemberVO member = new MemberVO("bnk1234", "bnk1234", "구자명", "서울");

		// 1. registerMember
		System.out.println(":: 1. registerMember(INSERT)  ? " + session.insert("MemberMapper.registerMember", member)); // 1
		session.commit();
		
		// 2. deleteMember
		System.out.println(":: 2. deleteMember(DELETE)  ? ");
		System.out.println(" :: " + session.delete("MemberMapper.deleteMember", member.getId()));

		// 3. updateMember
		member.setName("변경됨");
		System.out.println(":: 3. updateMember(UPDATE) :" + session.update("MemberMapper.updateMember", member));
		session.commit();

		// 4. showAllMember
		System.out.println(":: 4. showAllMember(SELECT)  ? ");
		TestUtil.printList((List) session.selectList("MemberMapper.getMember"));

		// 5. getMember
		System.out.println("5. getMember(SELECT ONE)" + session.selectOne("MemberMapper.getMember", member.getId()));
		session.commit();
		
		
		// 6. UserMapper10.getUserList Test :: Dynamic Query 확인 id=user04/name=온달 검색
		System.out.println("6. isExist  ? ");
		System.out.println("" + session.selectOne("MemberMapper.getMember", member.getId()));

		// 7. login 
		/*System.out.println("7. LOGIN (아이디 && 패스워드 존재 확인) ");
		Map <String, String> map = new HashMap<>();
		map.put("id", member.getId());
		map.put("password", member.getPassword());
		System.out.println("" + session.selectOne("MemberMapper.login", map));*/

	}
}
