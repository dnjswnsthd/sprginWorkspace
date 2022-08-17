package com.service.mybatis.client;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.service.mybatis.vo.MySawon;

public class MySawonAppTest01 {
	public static void main(String[] args) throws Exception{
		// 1. 폼으로부터 받은 값을 가지고 vo생성...
		MySawon vo = new MySawon();
		vo.setId("bnk");
		vo.setPwd("1234");
		vo.setName("염미정");
		vo.setAge(30);
		
		// 2. 지금부터 ... 핵심이 되는 설정문서를 읽어들인다.
		Reader r = Resources.getResourceAsReader("config/SqlMapConfig.xml");
		
		// 3. SqlSessionFactory
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r);
		
		// 4. 
		SqlSession session = factory.openSession();
		
		// 5. session안에 쿼리문 실행하는 기능이 들어 있다.(executeUpdate(), executeQuery())
		// 이제는 insert(), delete(0, update(), selectOne(), selectList()
		session.insert("sawonMapper.sawonAdd", vo);
		session.commit();
		session.close();
		
		System.out.println(vo.getName() + "님이 등록되셨습니다.");
		
	}
}
