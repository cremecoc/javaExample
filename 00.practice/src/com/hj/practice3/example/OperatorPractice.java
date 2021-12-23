package com.hj.practice3.example;

import java.util.Scanner;

public class OperatorPractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수: ");
		int num = sc.nextInt();
		
		String result = num > 0 ? "양수다" : "양수가 아니다";
		
		System.out.println(result);
		
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수: ");
		int num = sc.nextInt();
		
		String result = num == 0 ? "0이다" : num > 0 ? "양수다" : "음수다";
		
		System.out.println(result);
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수: ");
		int num = sc.nextInt();
		
		String result = num % 2 == 0 ? "짝수다" : "홀수다";
		
		System.out.println(result);
	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("인원 수: ");
		int pNum = sc.nextInt();
		
		System.out.println("사탕 개수: ");
		int cNum = sc.nextInt();
		
		int result = cNum / pNum;
		int result2 = cNum % pNum;
		
		System.out.println("1인당 사탕 개수: " + result);
		System.out.println("남는 사탕 개수: " + result2);
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름: ");
		String name = sc.nextLine();
		
		System.out.println("학년(숫자만): ");
		int grade = sc.nextInt();
		
		System.out.println("반(숫자만): ");
		int num1 = sc.nextInt();
		
		System.out.println("번호(숫자만): ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("성별(M/F): ");
		char ch = sc.nextLine().charAt(0);
		String gender = (ch == 'M') ? "남학생" : "여학생";
		
		System.out.println("성적(소수점 아래 둘째 자리까지): ");
		double score = sc.nextDouble();
		
		System.out.println(grade + "학년 " + num1 + "반 " + num2 + "번 " + name + " " + gender + "의 성적은 " + score + "이다.");
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이: ");
		int age = sc.nextInt();
		
		String result = age <= 13 ? "어린이" : age > 19 ? "성인" : "청소년";
		
		System.out.println(result);
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어: ");
		int score = sc.nextInt();
		
		System.out.println("수학: ");
		int score2 = sc.nextInt();
		
		System.out.println("영어: ");
		int score3 = sc.nextInt();
		
		int sum = score + score2 + score3;
		double avg = sum / 3.0;
		
		String result = score >= 40 && score2 >= 40 && score3 >= 40 && avg >= 60 ? "합격" : "불합격";
		
		System.out.println("합계: " + sum);
		System.out.println("평균: " + avg);
		System.out.println(result);
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민번호를 입력하세요(- 포함): ");
		char ch = sc.nextLine().charAt(7);
		
		String result = ch % 2 == 0 ? "여자" : "남자";
		
		System.out.println(result);
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수1: ");
		int num1 = sc.nextInt();
		
		System.out.println("정수2: ");
		int num2 = sc.nextInt();
		
		System.out.println("입력: ");
		int num3 = sc.nextInt();
				
		System.out.println(num3 <= num1 || num3 > num2);
		
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력1: ");
		int num1 = sc.nextInt();
		
		System.out.println("입력2: ");
		int num2 = sc.nextInt();
		
		System.out.println("입력3: ");
		int num3 = sc.nextInt();
		
		System.out.println(num1 == num2 && num2 == num3);
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A사원의 연봉: ");
		int num1 = sc.nextInt();
		
		System.out.println("B사원의 연봉: ");
		int num2 = sc.nextInt();
		
		System.out.println("C사원의 연봉: ");
		int num3 = sc.nextInt();
		
		double salary1 = num1 * 1.4;
		double salary2 = num2;
		double salary3 = num3 * 1.15;
		
		
		
		System.out.println("A사원의 인센티브포함 연봉: " + salary1);
		System.out.println(salary1 >= 3000 ? "3000 이상" : "3000 미만");
		
		System.out.println("B사원의 인센티브포함 연봉: " + salary2);
		System.out.println(salary2 >= 3000 ? "3000 이상" : "3000 미만");
		
		System.out.println("C사원의 인센티브포함 연봉: " + salary3);
		System.out.println(salary3 >= 3000 ? "3000 이상" : "3000 미만");
	}
}
