package com.jnmd.liuwan.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jnmd.liuwan.domain.User;
import com.jnmd.liuwan.mapper.UserMapper;

@Service
@Transactional(propagation=Propagation.REQUIRED)
public class UserService {
	@Resource
	private UserMapper usermapper;
	
	@Transactional(propagation=Propagation.SUPPORTS)
	public List<User> getCountry(){
		return usermapper.getCountry();
	}
}
