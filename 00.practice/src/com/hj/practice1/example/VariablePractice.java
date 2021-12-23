package com.hj.practice1.example;

import java.util.Scanner;

public class VariablePractice {

	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요: ");
		String name = sc.nextLine();
		
		System.out.println("나이를 입력하세요: ");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("성별을 입력하세요(남/여): ");
		// String gender = sc.nextLine();
		char gender = sc.nextLine().charAt(0);
		
		System.out.println("키를 입력하세요: ");
		double height = sc.nextDouble();
		
		System.out.println("키 " + height + "인 " + age + "살 " + gender + "자 " + name + "님 반가버요"); 
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 정수를 입력하세요: ");
		int i1 = sc.nextInt();
		
		System.out.println("두 번째 정수를 입력하세요: ");
		int i2 = sc.nextInt();
		
		int aNum = i1 + i2;
		int sNum = i1 - i2;
		int mNum = i1 * i2;
		int dNum = i1 / i2;
		System.out.println("더하기 결과: " + aNum);
		System.out.println("빼기 결과: " + sNum);
		System.out.println("곱하기 결과: " + mNum);
		System.out.println("나누기 몫 결과: " + dNum);
	}
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가로: ");
		double w = sc.nextDouble();
		
		System.out.println("세로: ");
		double h = sc.nextDouble();
		
		double area = w * h;
		double length = (w + h) * 2;
		
		System.out.println("면적: " + area);
		System.out.println("둘레: " + length);
		
	}
	
	public void method4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요: ");
		String s =  sc.nextLine();
		
		System.out.println("첫 번째 문자: " + s.charAt(0));
		System.out.println("두 번째 문자: " + s.charAt(1));
		System.out.println("두 번째 문자: " + s.charAt(2));
	}
}
