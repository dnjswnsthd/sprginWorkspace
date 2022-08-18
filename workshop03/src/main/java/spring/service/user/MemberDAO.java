package spring.service.user;

import java.util.List;

import spring.service.domain.MemberVO;

public interface MemberDAO {
	int registerMember(MemberVO member) throws Exception;
	
	int deleteMember(String id) throws Exception;
	
	int updateMember(MemberVO member) throws Exception;
	
	List<MemberVO> showAllMember() throws Exception;
	
	MemberVO getMember(String id) throws Exception;
	
	boolean idExist(String id) throws Exception;
	
	boolean login(String id, String password) throws Exception;
}
