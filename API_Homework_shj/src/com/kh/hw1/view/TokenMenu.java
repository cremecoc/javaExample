package com.kh.hw1.view;

import java.util.Scanner;
import java.util.StringTokenizer;

import com.kh.hw1.controller.TokenController;

public class TokenMenu {
	
	private Scanner sc = new Scanner(System.in);
	private TokenController tc = new TokenController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("1. 지정 문자열");
			System.out.println("2. 입력 문자열");
			System.out.println("9. 프로그램 끝내기");
			System.out.println("메뉴 번호: ");
			int menu = sc.nextInt();
			
			sc.nextLine();
			
			switch(menu) {
			case 1:
				tokenMenu();
				break;
			case 2:
				inputMenu();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				break;
			}
		}
		
	}
	
	public void tokenMenu() {
		String str = "J a v a P r o g r a m ";
		
		System.out.println("토큰 처리 전 글자: " + str);
		System.out.println("토큰 처리 전 개수: " + str.length());
		
		// afterToken 메소드의 인자 보낸 후 반환값 저장
		String newStr = tc.afterToken(str);
		
		// 토큰 처리 후 글자 출력
		System.out.println("토큰 처리 후 글자: " + newStr);
		// 토큰 처리 후 글자 길이 출력
		System.out.println("토큰 처리 후 개수: " + newStr.length());
		// toUpperCase()를 이용해서 대문자로 출력
		System.out.println("모두 대문자로 변환: " + newStr.toUpperCase());
		
	}
	
	public void inputMenu() {
		// 문자열 입력받은 후 저장
		System.out.println("문자열을 입력하세요: ");
		String str = sc.nextLine();
		
		System.out.println(tc.firstCap(str));
		
		System.out.println("찾을 문자 하나를 입력하세요: ");
		char c = sc.nextLine().charAt(0);
		System.out.println(c + " 문자가 들어간 개수: " + tc.findChar(str, c)); 
		
	}

}
