package com.jnmd.liuwan.mapper;


import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.jnmd.liuwan.domain.Gift;
@Repository
public interface GiftMapper {
	
	public List<Gift> getGift();
	
	public int getCount();
	
	public List<Gift> getGifts(Map<String , Object> map);
	
}
