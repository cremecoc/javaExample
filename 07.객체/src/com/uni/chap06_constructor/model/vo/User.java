package com.uni.chap06_constructor.model.vo;

public class User {
	
	private String userId;
	private String userPwd;
	private String name;
	
	public User() {
		
	}
	
	public User(String userId, String userPwd, String name) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.name = name;
	}
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

}
