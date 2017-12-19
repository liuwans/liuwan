package com.jnmd.liuwan.domain;

public class User {
	private int uid;
	private String uname;
	private String password;
	private int sex;
	public User() {
		super();
	}
	public User(int uid) {
		super();
		this.uid = uid;
	}
	public User(String uname, String password) {
		super();
		this.uname = uname;
		this.password = password;
	}
	public User(int uid, String uname, String password) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", password=" + password + "]";
	}
	
}
