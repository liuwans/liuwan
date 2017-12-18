package com.jnmd.liuwan.domain;

public class User {
	private int countrycode;
	private String countryname;
	public User(int countrycode, String countryname) {
		super();
		this.countrycode = countrycode;
		this.countryname = countryname;
	}
	public User() {
		super();
	}
	public User(int countrycode) {
		super();
		this.countrycode = countrycode;
	}
	public int getCountrycode() {
		return countrycode;
	}
	public void setCountrycode(int countrycode) {
		this.countrycode = countrycode;
	}
	public String getCountryname() {
		return countryname;
	}
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	@Override
	public String toString() {
		return "User [countrycode=" + countrycode + ", countryname=" + countryname + "]";
	}
	
}
