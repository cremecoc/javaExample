package com.uni.chap02.loop;

import java.util.Scanner;

public class C_DoWhile {
	/*
	 * * do-while문
	 * 
	 * [초기식]
	 * 
	 * do{
	 * 		반복적으로 실행할 코드;
	 * 
	 * 		[증감식]
	 * 
	 * }while(조건식); 
	 * 
	 * 
	 * 초기식  --> 무조건 한번은 실행 --> 증감식 
	 * 조건식 --> true일 경우 실행 --> 증감식
	 * 조건식 --> true일 경우 실행 --> 증감식
	 * 조건식 --> false일 경우 빠져나감
	 * 
	 * while문과 다른 점은 while문은 처음 수행될때도 조건식을 검사하고 나서 조건식이 true일 경우 실행되는데
	 * do while문은 첫 실행은 조건식없이 무조건 수행된다는 점
	 * 
	 */
	
	public void method1() {
		int num = 1;
		
		do {
			System.out.println(num);
		} while(num == 0);
	}
	
	public void method2() {
		// 1부터 5까지
		int i = 1;
		do {
			/*
			 * System.out.println(i + " "); i++;
			 */
			
			System.out.print(i++ + " ");
		} while(i<=5);
		
	}
	
	public void method3() {
		int random = (int)(Math.random() * 10 + 1);
		
		System.out.println("랜덤값" + random);
		
		int sum = 0;
		
		int i = 1;
		
		do {
			sum += i;
			i++;
		} while(i <= random);
		
		System.out.println("1부터 " + random + " 까지의 합: " + sum);
	}
	
	public void method4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("단수(2~9) 입력: ");
		int dan = sc.nextInt();
		
		int i = 1;
		
		do { 
			System.out.printf("%d * %d = %d\n", dan, i, (dan * i));
			i++;
		}while(i <= 9);
	}
	
	public void method5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력: ");
		String str = sc.nextLine();
		System.out.println("문자열 길이 " + str.length());
		
		int i = 0;
		do {
			System.out.println(str.charAt(i));
			i++;
		} while(i < str.length());
	}
	
	public void method6() {
		Scanner sc = new Scanner(System.in);
		
		String str = "";
		
		do {
			System.out.println("문자열을 입력해 주세요: ");
			str = sc.nextLine();
			System.out.println("str: " + str);
		} while(!str.equals("exit"));
	}
	
	public void method7() {
		Scanner sc = new Scanner(System.in);
		
		
		String str = "";
		
		do {
			System.out.println("문자열을 입력해 주세요: ");
			str = sc.nextLine();
			if (str.equals("exit")) {
				break;
			}
		} while(true);
		
		
		System.out.println("str: " + str);
	}
	

}
