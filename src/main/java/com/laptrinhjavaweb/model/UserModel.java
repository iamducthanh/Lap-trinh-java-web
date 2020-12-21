package com.laptrinhjavaweb.model;

public class UserModel {
	private String username;
	private String fullname;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	
	public UserModel() {
		// TODO Auto-generated constructor stub
	}
	public UserModel(String username, String fullname) {
		super();
		this.username = username;
		this.fullname = fullname;
	}
}
