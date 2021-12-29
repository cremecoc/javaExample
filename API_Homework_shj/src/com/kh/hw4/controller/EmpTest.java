package com.kh.hw4.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.kh.hw4.model.vo.Employee;

public class EmpTest {
	
	private Employee[] empArr;
	private Scanner sc = new Scanner(System.in);
	
	public EmpTest() {
		// TODO Auto-generated constructor stub
	}
	
	public void setEmp() {
		empArr = new Employee[6];
		empArr[0] = new Employee("문말똥", 24, 1500000, 1.245);
		empArr[1] = new Employee("장소똥", 40, 2500000, 1.4);
		empArr[2] = new Employee("금개똥", 22, 1780000, 1.3);
		empArr[3] = new Employee("봉쥐똥", 31, 1950000, 1.365);
		empArr[4] = new Employee("홍닭똥", 34, 1650000, 1.212);
		
		System.out.println("이름: ");
		String name = sc.nextLine();
		
		System.out.println("나이: ");
		int age = sc.nextInt();
		
		System.out.println("급여: ");
		int salary = sc.nextInt();
		
		System.out.println("세율: ");
		double taxRate = sc.nextDouble();
		
		empArr[5] = new Employee(name, age, salary, taxRate);
		
	}
	
	public void printEmp() {
		for(Employee e : empArr) {
			System.out.println(e.toString());
		}
	}
	
	public void nameSortPrint() {
		// List<Employee> list = Arrays.asList(empArr);
		for(int i = 0; i < empArr.length; i++) {
			for(int j = 1; j < i; j++) {
				if(empArr[i].getName().compareTo(empArr[j].getName()) < 0) {
					Employee temp = empArr[i];
					empArr[i] = empArr[j];
					empArr[j] = temp;
				}
			}
		}
	}

}
