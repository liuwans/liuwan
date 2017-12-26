package com.jnmd.liuwan.domain;

public class Giftpic {
	private int gpid;
	private String picpath;
	@Override
	public String toString() {
		return "Giftpic [gpid=" + gpid + ", picpath=" + picpath + "]";
	}
	public Giftpic() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Giftpic(int gpid, String picpath) {
		super();
		this.gpid = gpid;
		this.picpath = picpath;
	}
	public int getGpid() {
		return gpid;
	}
	public void setGpid(int gpid) {
		this.gpid = gpid;
	}
	public String getPicpath() {
		return picpath;
	}
	public void setPicpath(String picpath) {
		this.picpath = picpath;
	}
	
	
}	
