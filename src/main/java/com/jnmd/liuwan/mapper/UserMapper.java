package com.jnmd.liuwan.mapper;


import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.jnmd.liuwan.domain.User;
@Repository
public interface UserMapper {
	
	public List<User> getCountry(Map<String, Object> map);
	
	public void saveUser(User user);
}
