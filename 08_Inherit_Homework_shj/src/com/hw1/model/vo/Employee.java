package com.hw1.model.vo;

public class Employee extends Person {
	
	private int salary;
	private String dept;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(age, height, weight);
		super.name = name;
		this.salary = salary;
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String information() {
		return "Employee [salary=" + salary + ", dept=" + dept + ", toString()=" + super.information()
				+ "]";
	}

	
	
	
	
	
	
	
	
	
	
	
}
