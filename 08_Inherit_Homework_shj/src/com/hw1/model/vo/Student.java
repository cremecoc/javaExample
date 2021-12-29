package com.hw1.model.vo;

public class Student extends Person {

	private int grade;
	private String major;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(age, height, weight);
		// 상속받은 클래스에서 name은 protected이기 때문에 직접적으로 접근한 뒤 초기화
		super.name = name;
		
		this.grade = grade;
		this.major = major;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String information() {
		return "Student [grade=" + grade + ", major=" + major + ", " + super.information()
				+ "]";
	}
	
	

	
	
	

	
	
}
