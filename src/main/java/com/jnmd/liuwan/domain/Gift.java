package com.jnmd.liuwan.domain;

import java.util.List;

public class Gift {
	private int gid;
	private String giftName;
	private String giftDescribe;
	private List<Giftpic> giftpic;
	private int num;
	private int tcomment;
	public Gift() {
		super();
	}
	public Gift(String giftName, String giftDescribe, List<Giftpic> giftpic, int num, int tcomment) {
		super();
		this.giftName = giftName;
		this.giftDescribe = giftDescribe;
		this.giftpic = giftpic;
		this.num = num;
		this.tcomment = tcomment;
	}
	public Gift(int gid, String giftName, String giftDescribe, List<Giftpic> giftpic, int num, int tcomment) {
		super();
		this.gid = gid;
		this.giftName = giftName;
		this.giftDescribe = giftDescribe;
		this.giftpic = giftpic;
		this.num = num;
		this.tcomment = tcomment;
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getGiftName() {
		return giftName;
	}
	public void setGiftName(String giftName) {
		this.giftName = giftName;
	}
	public String getGiftDescribe() {
		return giftDescribe;
	}
	public void setGiftDescribe(String giftDescribe) {
		this.giftDescribe = giftDescribe;
	}
	public List<Giftpic> getGiftpic() {
		return giftpic;
	}
	public void setGiftpic(List<Giftpic> giftpic) {
		this.giftpic = giftpic;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getTcomment() {
		return tcomment;
	}
	public void setTcomment(int tcomment) {
		this.tcomment = tcomment;
	}
	@Override
	public String toString() {
		return "Gift [gid=" + gid + ", giftName=" + giftName + ", giftDescribe=" + giftDescribe + ", giftpic=" + giftpic
				+ ", num=" + num + ", tcomment=" + tcomment + "]";
	}
	
}
