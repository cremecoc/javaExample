package com.hw1.view;

import java.util.Scanner;

import com.hw1.model.vo.Employee;

public class EmpMenu {
	Scanner sc = new Scanner(System.in);
	
	public EmpMenu() {}
	
	// 메뉴 화면 출력
	public void mainMenu() {
		Employee emp = null;
		
		while(true) {
			System.out.println(" === 사원 정보 관리 프로그램 ===");
			System.out.println("1. 새 사원 정보 입력");
			System.out.println("2. 사원 정보 수정");
			System.out.println("3. 사원 정보 삭제");
			System.out.println("4. 사원 정보 출력");
			System.out.println("9. 프로그램 종료");
			System.out.println("메뉴 번호 선택: ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				emp = inputEmployee();
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				System.out.println(emp.information());
				break;
			case 9:
				return;
			default:
				break;
			}
		}
		
	}
	
	public Employee inputEmployee() {
		Employee emp = new Employee();
		
		System.out.println("사원명: ");
		String empName = sc.nextLine();
		emp.setEmpName(empName);
		
		sc.nextLine();
		
		System.out.println("부서명: ");
		String dept = sc.nextLine();
		emp.setDept(dept);
		
		System.out.println("직급: ");
		String job = sc.nextLine();
		emp.setJob(job);
		
		System.out.println("나이: ");
		int age = sc.nextInt();
		emp.setAge(age);
		
		sc.nextLine();
		
		System.out.println("성별: ");
		char gender = sc.nextLine().charAt(0);
		emp.setGender(gender);
		
		System.out.println("급여: ");
		int salary = sc.nextInt();
		emp.setSalary(salary);
		
		System.out.println("보너스포인트: ");
		double bonusPoint = sc.nextDouble();
		emp.setBonusPoint(bonusPoint);
		
		sc.nextLine();
		
		System.out.println("전화번호: ");
		String phone = sc.nextLine();
		emp.setPhone(phone);
		
		System.out.println("주소: ");
		String address = sc.nextLine();
		emp.setAddress(address);
		
		return emp;
		
	}
	
	public void modifyEmployee() {
		
	}

}
