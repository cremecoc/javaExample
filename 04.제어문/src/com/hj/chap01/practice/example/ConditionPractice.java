package com.hj.chap01.practice.example;

import java.util.Scanner;

public class ConditionPractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("9. 종료");
		System.out.println("메뉴 번호를 입력하세요: ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1: 
			System.out.println("입력 메뉴입니다.");
			break;
		case 2: 
			System.out.println("수정 메뉴입니다.");
			break;
		case 3: 
			System.out.println("조회 메뉴입니다.");
			break;
		case 4: 
			System.out.println("삭제 메뉴입니다.");
			break;
		case 9: 
			System.out.println("프로그램이 종료됩니다.");
			break;
		default: 
			break;
		}
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 한 개 입력하세요.");
		int num = sc.nextInt();
		
		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println("짝수다");
			} else {
				System.out.println("홀수다");
			}
		} else {
			System.out.println("양수만 입력해 주세요");
		}
		
		
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어점수: ");
		int kor = sc.nextInt();
		
		System.out.println("수학점수: ");
		int math = sc.nextInt();
		
		System.out.println("영어점수: ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
		double avg = sum / 3.0;
		if (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) {
			System.out.println("국어: " + kor);
			System.out.println("수학: " + math);
			System.out.println("영어: " + eng);
			System.out.println("합계: " + sum);
			System.out.println("평균: " + avg);
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
		
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1~12 사이의 정수 입력: ");
		int month = sc.nextInt();
		
		String season = "";
		
		switch (month) {
		case 1: case 2: case 12:
			season = "겨울";
			break;
		case 3: case 4: case 5:
			season = "봄";
			break;
		case 6: case 7: case 8:
			season = "여름";
			break;
		case 9: case 10: case 11:
			season = "가을";
			break;
		default:
			System.out.println("해당하는 계절이 없습니다.");
			break;
		}
		
		System.out.println(month + "월은 " + season + "입니다.");

	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아이디: ");
		String id = sc.nextLine();
		
		System.out.println("비밀번호: ");
		String pwd = sc.nextLine();
		
		if(id.equals("user1") && pwd.equals("1234")) {
			System.out.println("로그인 성공");
		} else if(!id.equals("user1")) {
			System.out.println("아이디가 틀렸습니다.");
		} else {
			System.out.println("비밀번호가 틀렸습니다.");
		}
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("권한을 확인하고자 하는 회원 등급: ");
		String s = sc.nextLine();
		
		if(s.equals("관리자")) {
			System.out.println("회원관리, 게시글 관리");
			System.out.println("게시글 작성, 댓글 작성");
			System.out.println("게시글 조회");
		} else if(s.equals("회원")) {
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
		} else if(s.equals("비회원")) {
			System.out.println("게시글 조회");
		} else {
			System.out.println("잘못 입력했습니다.");
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키(m)를 입력해 주세요: ");
		double height = sc.nextDouble();
		
		System.out.println("몸무게(kg)를 입력해 주세요: ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		System.out.println("BMI 지수: " + bmi);
		
		if(bmi < 18.5) {
			System.out.println("저체중"); 
		} else if(bmi >= 18.5 && bmi < 23) {
			System.out.println("정상체중");
		} else if(23 <= bmi && bmi < 25) {
			System.out.println("과체중");
		} else if(25 <= bmi && bmi <30) {
			System.out.println("비만");
		} else {
			System.out.println("고도 비만");
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("피연산자1 입력: ");
		int num1 = sc.nextInt();
		
		System.out.println("피연산자2 입력: ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("연산자를 입력(+,-,*,/,%): ");
		char s = sc.nextLine().charAt(0);
		
		if(0 > num1 || 0 > num2 ) {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		} else {
			switch(s) {
			case '+':
				System.out.printf("%d + %d = %d", num1, num2, (num1 + num2));
				break;
			case '-':
				System.out.printf("%d - %d = %d", num1, num2, (num1 - num2));
				break;
			case '*':
				System.out.printf("%d * %d = %d", num1, num2, (num1 * num2));
				break;
			case '/':
				System.out.printf("%d / %d = %d", num1, num2, (num1 / num2));
				break;
			case '%':
				System.out.printf("%d % %d = %d", num1, num2, (num1 % num2));
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
				break;
			}
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("중간 고사 점수: ");
		double score1 = sc.nextDouble();
		
		System.out.println("기말 고사 점수: ");
		double score2 = sc.nextDouble();
		
		System.out.println("과제 점수: ");
		double score3 = sc.nextDouble();
		
		System.out.println("출석 회수: ");
		double score4 = sc.nextDouble();
		
		score1 *= 0.2;
		score2 *= 0.3;
		score3 *= 0.3;
		
		double sum = score1 + score2 + score3 + score4;
		
		System.out.println("====== 결과 ======");
		
		if (score4 <= (20 * 0.7)) {
			System.out.println("FAIL [출석 횟수 부족] (" + (int)score4 + "/20)");
			if (sum < 71) {
				System.out.println("FAIL [점수 미달] (총점 " + sum + ")");
			}
		} else if (sum < 71) {
			System.out.println("FAIL [점수 미달] (총점 " + sum + ")");
		} else {
			System.out.println("중간 고사 점수(20): " + score1);
			System.out.println("기말 고사 점수(30): " + score2);
			System.out.println("과제 점수(30): " + score3);
			System.out.println("출석 점수(30): " + score4);
			System.out.println("총점: " + sum);
			System.out.println("PASS");
		}
		
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. Pass/Fail");
		System.out.println("선택: ");
		int selection = sc.nextInt();
		
		switch(selection) {
		case 1:
			practice1();
			break;
		case 2:
			practice2();
			break;
		case 3:
			practice3();
			break;
		case 4:
			practice4();
			break;
		case 5:
			practice5();
			break;
		case 6:
			practice6();
			break;
		case 7: 
			practice7();
			break;
		case 8:
			practice8();
			break;
		case 9:
			practice9();
			break;
		default:
			break;
		}
		
	}
}
