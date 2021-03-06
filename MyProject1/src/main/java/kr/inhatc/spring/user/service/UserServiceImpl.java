package kr.inhatc.spring.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.inhatc.spring.user.entitiy.Users;
import kr.inhatc.spring.user.ropository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public List<Users> userList() {
		List<Users> list = userRepository.findAllByOrderByIdDesc();
		
		return list;
	}

	@Override
	public void saveUsers(Users user) {
		userRepository.save(user);
		
	}

	@Override
	public Users userDtail(String id) {
		Optional<Users> optional = userRepository.findById(id);
		if(optional.isPresent()) {
			Users user = optional.get();
			return user;
		}else
		{
			throw new NullPointerException();
		}
		
	}

	@Override
	public void userDelete(String id) {
		userRepository.deleteById(id);
		
	}

}
