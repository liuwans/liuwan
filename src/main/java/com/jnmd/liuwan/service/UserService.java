package com.jnmd.liuwan.service;

import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.jnmd.liuwan.domain.User;
import com.jnmd.liuwan.exception.UserException;
import com.jnmd.liuwan.mapper.UserMapper;


@Service
@Transactional(propagation=Propagation.REQUIRED)
public class UserService {
	@Resource
	private UserMapper usermapper;
	
	@Transactional(propagation=Propagation.SUPPORTS)
	public List<User> getCountry(Map<String, Object> map){
		return usermapper.getCountry(map);
	}
	
	@Transactional(propagation=Propagation.REQUIRED, rollbackFor=UserException.class)
	public void saveUser(User user){
		usermapper.saveUser(user);
	}
}
