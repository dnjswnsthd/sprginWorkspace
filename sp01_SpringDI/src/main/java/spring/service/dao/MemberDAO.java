package spring.service.dao;

// 비지니스 로직의 템플릿..
public interface MemberDAO {
	void register(String id, String pass);

	void delete(String id);
}
