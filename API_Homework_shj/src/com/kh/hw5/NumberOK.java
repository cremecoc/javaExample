package com.kh.hw5;

import java.util.Scanner;

public class NumberOK {
	
	private int ran;
	private Scanner sc = new Scanner(System.in);
	
	public NumberOK() {
		// TODO Auto-generated constructor stub
	}
	
	public void numGame() {
		int count = 0;
		int num = 0;
		
		int random = (int)(Math.random() * 100) + 1;
		
		do {
			System.out.println("1부터 100 사이의 정수를 하나 입력하세요: ");
			num = sc.nextInt();
			
			if(num > random) {
				++count;
				System.out.println(num + "보다 큽니다." + count + "번째 실패!");
			} else if(num < random) {
				++count;
				System.out.println(num + "보다 작습니다." + count + "번째 실패!");
			}
		} while(random != num);
		
		System.out.println("정답입니다" + count + "번만에 맞혔습니다");
	}

}
