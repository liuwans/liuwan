package com.jnmd.liuwan.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jnmd.liuwan.domain.Gift;
import com.jnmd.liuwan.mapper.GiftMapper;


@Service
@Transactional(propagation=Propagation.REQUIRED)
public class GiftService {
	@Resource
	private GiftMapper giftmapper;
	
	@Transactional(propagation=Propagation.SUPPORTS)
	public List<Gift> getGift(){
		return giftmapper.getGift();
	}
	
	@Transactional(propagation=Propagation.SUPPORTS)
	public List<Gift> findGift(Map<String , Object> map){
		return giftmapper.getGifts(map);
	}
	
	@Transactional(propagation=Propagation.SUPPORTS)
	public int getCount(){
		return giftmapper.getCount();
	}
}
