package com.jnmd.liuwan.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jnmd.liuwan.domain.User;

@Repository
public interface UserMapper {
	
	public List<User> getCountry();
}
