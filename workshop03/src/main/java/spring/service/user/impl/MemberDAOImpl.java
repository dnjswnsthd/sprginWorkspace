package spring.service.user.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.service.domain.MemberVO;
import spring.service.user.MemberDAO;

@Repository
public class MemberDAOImpl implements MemberDAO {
	
	@Autowired
	private SqlSession sqlSession;
	public static final String MAPPER_NAME = "MemberMapper.";
	
	@Override
	public int registerMember(MemberVO member) throws Exception {
		int row = sqlSession.insert(MAPPER_NAME + "registerMember", member);
//		sqlSession.commit();
		return row;
	}

	@Override
	public int deleteMember(String id) throws Exception {
		int row = sqlSession.delete(MAPPER_NAME + "deleteMember", id);
//		sqlSession.commit();
		return row;
	}

	@Override
	public int updateMember(MemberVO member) throws Exception {
		int row = sqlSession.update(MAPPER_NAME + "updateMember", member);
//		sqlSession.commit();
		return row;
	}

	@Override
	public List<MemberVO> showAllMember() throws Exception {
		List <MemberVO> list = sqlSession.selectList(MAPPER_NAME + "showAllMember");
		if(!list.isEmpty()) {
			return list;
		}else {
			return null;
		}
	}

	@Override
	public MemberVO getMember(String id) throws Exception {
		Map <String, String> map = new HashMap<>();
		map.put("id", id);
		MemberVO member = sqlSession.selectOne(MAPPER_NAME + "getMember", map);
		return member;
	}

	@Override
	public boolean idExist(String id) throws Exception {
		Map <String, String> map = new HashMap<>();
		map.put("id", id);
		MemberVO member = sqlSession.selectOne(MAPPER_NAME + "getMember", map);
		if(member == null)
			return true;
		else
			return false;
	}

	@Override
	public boolean login(String id, String password) throws Exception {
		Map <String, String> map = new HashMap<>();
		map.put("id", id);
		map.put("password", password);
		MemberVO member = sqlSession.selectOne(MAPPER_NAME + "getMember", map);
		if(member != null)
			return true;
		else
			return false;
	}

}
