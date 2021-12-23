package com.uni.chap02.loop;

import java.util.Scanner;

public class B_While {

	/*
	 * * while문
	 * 
	 * [초기식]
	 * 
	 * while(조건식) {
	 * 		반복적으로 실행할 코드;
	 * 		[증감식]
	 * }
	 * 
	 * 조건식이 true일 경우 해당 실행코드 실행
	 * 
	 * 조건식 검사 --> true일 경우 실행코드 실행
	 * 조건식 검사 --> true일 경우 실행코드 실행
	 * 조건식 검사 --> false일 경우 실행코드 실행 X --> 반복문 빠져 나감
	 * 
	 * 
	 */

	public void method1() {
		int i = 1;
		while(i <= 5) {
			System.out.print("안녕하세요");
			i++;
		}
		
		
		// 1 2 3 4 5
		i = 1;
		while(i <= 5) {
			System.out.println(i + " ");
			i++;
		}
		
		System.out.println();
		
		// 5 4 3 2 1
		i = 5;
		while(i >= 1) {
			System.out.println(i + " ");
			i--;
		}
	}
	
	public void method2() {
		// 1부터 10 사이의 홀수만 출력
		int i = 1;
		while(i <= 10) {
			if(i % 2 == 1) {
				System.out.println(i + " ");
			}
			i++;
		}
		
		System.out.println();
		
		i = 1;
		while(1 <= 10) {
			System.out.println(i + " ");
			i += 2;
		}
		
	}
	
	public void method3() {
		// 1부터 어떤 랜덤값 (1~10 사이의 랜덤한 숫자)까지의 합계
		int random = (int)(Math.random() * 10 + 1);
		
		System.out.println("랜덤값" + random);
		
		int sum = 0;
		
		int i = 1;
		
		while(i <= random) {
			sum += i;
			i++;
		}
		
		System.out.println("1부터 " + random + " 까지의 합: " + sum);
	}
	
	public void method4() {
		// 사용자가 입력한 단 출력
				Scanner sc = new Scanner(System.in);
				System.out.println("단수(2~9) 입력: ");
				int dan = sc.nextInt();
				
				int i = 1;
				
				while(i <= 9) {
					System.out.printf("%d * %d = %d\n", dan, i, (dan * i));
					i++;
				}
				
			
	}
	
	public void method5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력: ");
		String str = sc.nextLine();
		
		System.out.println("문자열 길이 " + str.length());
		
		int i = 0;
		while(i < str.length()) {
			System.out.println(str.charAt(i));
			i++;
		}
	}
	
	public void method6() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("===== 메뉴 =====");
			System.out.println("1.1부터 5까지 출력");
			System.out.println("2. 1부터 10 사이의 홀수만 출력");
			System.out.println("3. 1부터 어떤 랜덤값까지의 합계");
			System.out.println("9. 프로그램 종료");
			
			System.out.println("메뉴 선택: ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				method1();
				break;
			case 2:
				method2();
				break;
			case 3:
				method3();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하였습니다.");
				break;
			}
			
		}
	}
	
	public void method7() {
		//계속 문자열을 입력 받고 그문자열을 출력 하게끔 
		//하지만 그문자열이 "exit" 가 아닐때 까지 반복

		Scanner sc = new Scanner(System.in);
		
		String str = "";
		
		while(!str.equals("exit")) {
			System.out.println("문자열을 입력해 주세요: ");
			str = sc.nextLine();
			System.out.println("str: " + str);
		}
		
		System.out.println("exit를 입력해서 종료되었습니다.");
	}
	
	public void method8() {
		// 무한 루프, break 이용
		Scanner sc = new Scanner(System.in);
		
		String str = "";
		
		while(true) {
			System.out.println("문자열을 입력해 주세요: ");
			str = sc.nextLine();
			if (str.equals("exit")) {
				break;
			}
			System.out.println("str: " + str);
			
		}
	}
}
