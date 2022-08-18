package mybatis.services.user;

import java.util.List;

import mybatis.services.domain.User;

/*
 * Service Layer ::
 * "데이타 가공레이어"
 * 게신판의 페이징 생각하면 된다.
 * 
 * 디비에서 가지고온 데이타를 조작하는 레이어를 서비스 레이어라고 한다.
 * Persistance Layer에 DAO가 DI(주입)
 */
public interface UserService {
	void addUser(User user) throws Exception;

	void updateUser(User user) throws Exception;

	User getUser(String userId) throws Exception;

	List<User> getUserList(User user) throws Exception; // 동적 쿼리를 위한 인자값 User가 들어간다.
}
