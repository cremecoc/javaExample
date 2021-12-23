package com.kh.test;

import java.util.Scanner;

public class Test {

	public void count() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("문자열을 입력해 주세요: ");
			String str = sc.nextLine();
			if(str.equals("exit")) {
				break;
			} else {
				System.out.println(str.length() + "글자입니다.");
			}
			
		}
	}
}
