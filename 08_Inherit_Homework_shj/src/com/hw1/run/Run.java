package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1. 학생 정보 저장할 객체 배열 생성
		Student[] sArr = new Student[3];
		
		// 2. 값 초기화
		sArr[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		sArr[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		sArr[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신학과");
		
		// 3. 배열 출력
		for(int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i].information());
		}

		// 1. 사원 정보를 저장할 객체 배열 생성
		Employee[] eArr = new Employee[10];
		
		// 1_1. 사원 수 기록할 변수 생성
		int count = 0;
		
		// 2. 사원들의 정보 입력받기
		while(true) {
			System.out.println("이름: ");
			String name = sc.nextLine();
			
			System.out.println("나이: ");
			int age = sc.nextInt();
			
			System.out.println("키: ");
			double height = sc.nextDouble();
			
			System.out.println("몸무게: ");
			double weight = sc.nextDouble();
			
			System.out.println("월급: ");
			int salary = sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("부서: ");
			String dept = sc.nextLine();
			
			// 객체 생성
			eArr[count++] = new Employee(name, age, height, weight, salary, dept);
			
			// y/n 묻기
			System.out.println("계속 추가하시겠습니까? (y/n)");
			char chk = sc.nextLine().charAt(0);
			
			if(chk == 'n') {
				System.out.println("종료하겠습니다.");
				for(int j = 0; j < count; j++) {
					System.out.println(eArr[j].information());
				}
				return;
			}
			
		}
		
		
		
		
	}

}
