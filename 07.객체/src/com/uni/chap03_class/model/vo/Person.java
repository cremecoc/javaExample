package com.uni.chap03_class.model.vo;

public class Person {
	
	private String id;
	private String pwd;
	private String name;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	// 매개 변수가 있는 생성자
		/*
		 * public Person(String id, String pwd) {
		 * 
		 * }
		 * 
		 */
	
	// 기본 생성자
	public Person() {
		// TODO Auto-generated constructor stub
	}

	// 자동으로 getter, setter 생성: alt + shft + s
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String information() {
		return id + " " + pwd + " " + name + " " + age + " " + gender + " " + phone + " " + email;

	}
	
	
	
	
}
