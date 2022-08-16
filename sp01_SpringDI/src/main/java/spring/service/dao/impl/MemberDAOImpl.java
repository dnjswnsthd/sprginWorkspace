package spring.service.dao.impl;

import spring.service.dao.MemberDAO;

public class MemberDAOImpl implements MemberDAO {

	@Override
	public void register(String id, String pass) {
		System.out.println(id + "님 회원 가입 성공");
	}

	@Override
	public void delete(String id) {
		System.out.println(id + "님 회원 탈퇴 성공");
	}

}
