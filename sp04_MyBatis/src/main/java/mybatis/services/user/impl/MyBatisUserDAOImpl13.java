/*
 * 					Layer
 * Presentation					Business Logic
 * 		|							  |
 * 	Controller				Service	 	 	 	 Persistance
 * 		|					   |					  |
 * 	~Controller			  UserService		       UserDAO
 * 							   |					  |
 * 				MyBatisUserServiceImpl13	MyBatisUserDAOImpl13
 * 
 */
package mybatis.services.user.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import mybatis.services.domain.User;
import mybatis.services.user.UserDAO;

@Repository
public class MyBatisUserDAOImpl13 implements UserDAO {
	
	@Autowired
	private SqlSession sqlSession;
	public static final String MAPPER_NAME = "UserMapper10.";

	@Override
	public int addUser(User user) throws Exception {
		int row = sqlSession.insert(MAPPER_NAME + "addUser", user);
		return row;
	}

	@Override
	public int updateUser(User user) throws Exception {
		int row = sqlSession.update(MAPPER_NAME + "updateUser", user);
		return row;
	}

	@Override
	public int removeUser(String userId) throws Exception {
		int row = sqlSession.delete(MAPPER_NAME + "removeUser", userId);
		return row;
	}

	@Override
	public User getUser(String userId) throws Exception {
		User user = sqlSession.selectOne(MAPPER_NAME + "getUser", userId);
		return user;
	}

	@Override
	public List<User> getUserList(User user) throws Exception {
		List<User> list = sqlSession.selectList(MAPPER_NAME + "getUserList", user);
		return list;
	}

}
