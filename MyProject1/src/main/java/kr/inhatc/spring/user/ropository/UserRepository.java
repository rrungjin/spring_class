package kr.inhatc.spring.user.ropository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import kr.inhatc.spring.user.entitiy.Users;

@Repository
public interface UserRepository extends CrudRepository<Users, String> {

	List<Users> findAllByOrderByIdDesc();

	
	
}
