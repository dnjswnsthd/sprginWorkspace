package com.service.mybatis.client;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.service.mybatis.vo.MySawon;

import util.FactoryService;

public class MySawonAppTest03 {
	public static void main(String[] args) throws Exception{
		SqlSessionFactory factory = FactoryService.getFactory();
			
		SqlSession session = factory.openSession();
		
		// 4. session안에 쿼리문 실행하는 기능이 들어 있다.(executeUpdate(), executeQuery())
		// 이제는 insert(), delete(0, update(), selectOne(), selectList()
		List <MySawon> list = session.selectList("sawonMapper.sawonList");
		for(MySawon vo : list) {
			System.out.println(vo.toString());
		}
		session.commit();
		session.close();

		
	}
}
