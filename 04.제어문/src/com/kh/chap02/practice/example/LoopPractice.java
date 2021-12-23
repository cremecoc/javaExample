package com.kh.chap02.practice.example;

import java.util.Scanner;

public class LoopPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 이상의 숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		
		if (num >= 1) {
			for(int i=1; i<=num; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		int num;
		
		while(true) { // 무한 루프
			System.out.println("1 이상의 숫자를 입력하세요: ");
			num = sc.nextInt();
			
			if(num >= 1) { // 1 이상 입력했을 경우
				for(int i=1; i<=num; i++) {
					System.out.print(i + " ");
				}
				break; // while문 종료
			} else { // 잘못 입력했을 경우 (while문 계속 진행)
				System.out.println("1 이상의 숫자를 입력해 주세요.");
			}
			
			
		}
		
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 이상의 숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		if (num >= 1) {
			for(int i = 0; i < num; i++) {
				System.out.print((num - i) + " ");
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		int num;
		do {
			System.out.println("1 이상의 숫자를 입력하세요: ");
			num = sc.nextInt();
			for(int i = 0; i < num; i++) {
				System.out.print((num - i) + " ");
			}
		} while (num < 1);
		
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 하나 입력하세요: ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			sum += i;
			System.out.print(i + " + ");
		}
		
		System.out.println(" = " + sum);
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자: ");
		int num1 = sc.nextInt();
		
		System.out.println("두 번째 숫자: ");
		int num2 = sc.nextInt();
		
		if (num1 >= 1 || num2 >= 1) {
			if(num1 > num2) {
				for(int i = num2; i <= num1; i++) {
					System.out.print(i + " ");
				}
			} else {
				for(int i = num1; i <= num2; i++) {
					System.out.print(i + " ");
				}
			}
		} else {
			System.out.println("1이상의 숫자만을 입력해 주세요.");
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		do {
			System.out.println("첫 번째 숫자: ");
			num1 = sc.nextInt();
			
			System.out.println("두 번째 숫자: ");
			num2 = sc.nextInt();
			
			if(num1 > num2) {
				for(int i = num2; i <= num1; i++) {
					System.out.print(i + " ");
				}
			} else {
				for(int i = num1; i <= num2; i++) {
					System.out.print(i + " ");
				}
			}

		} while (num1 < 1);
		
	}
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자: ");
		int dan = sc.nextInt();
		
		System.out.println("===== " + dan + "단 =====");
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
	}
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자: ");
		int dan = sc.nextInt();
		
		if (dan >= 1) {			
			for(int i = dan; i <= 9; i++) {
				System.out.println("===== " + i + "단 =====");
				for(int j = 1; j <= 9; j++) {
					System.out.println(i + " * " + j + " = " + (i * j));
				}
			}
		} else {
			System.out.println("2~9 사이의 숫자만 입력해 주세요.");
		}
		
		
	}
	public void practice10() {
		Scanner sc = new Scanner(System.in);
	}
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("시작 숫자: ");
		int num = sc.nextInt();
		
		System.out.println("공차: ");
		int gongcha = sc.nextInt();
		
		System.out.print(num + " ");
		
		for(int i = 0; i < 9; i++) {
			num += gongcha;
			System.out.print(num + " ");
		}
	}
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("연산자(+, -, *, /, %): ");
		char ch = sc.nextLine().charAt(0);
		System.out.println("정수1: ");
		int num1 = sc.nextInt();
		System.out.println("정수2: ");
		int num2 = sc.nextInt();
	}
	
	/* 
	 * 
	 * 반복문 실습 문제(ver.hard)
	 *  
	 * */
	public void practice15() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자: ");
		int num = sc.nextInt();
		
		boolean ck1 = false; // for문에서 소수인지 체크해 줄 boolean
		
		if(num < 2) { 
			System.out.println("잘못 입력하셨습니다.");
		} else {
			
			for(int i = 2; i < num; i++) { // 1과 num 외에 나누어지는 값이 있는지 확인
				if(num % i == 0) { // 1과 num 외에 나누어지는 값이 있을 경우
					ck1 = true; // boolean 값을 true로 변경해 소수가 아님을 알 수 있다
					break;
				}
			}
			if(ck1 == true) { 
				System.out.println("소수가 아닙니다.");
			} else {
				System.out.println("소수입니다.");
			}
		}
		
		
		
	}
	
	public void practice16() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("숫자: ");
			int num = sc.nextInt();
			
			boolean ck1 = false; // for문에서 소수인지 체크해 줄 boolean
			
			if(num < 2) { 
				System.out.println("잘못 입력하셨습니다.");
			} else {
				
				for(int i = 2; i < num; i++) { // 1과 num 외에 나누어지는 값이 있는지 확인
					if(num % i == 0) { // 1과 num 외에 나누어지는 값이 있을 경우
						ck1 = true; // boolean 값을 true로 변경해 소수가 아님을 알 수 있다
						break;
					}
					if(ck1 == true) { 
						System.out.println("소수가 아닙니다.");
					} else {
						System.out.println("소수입니다.");
					} break;
				} break;
			}
			
			
		}
		
	}
	
	public void practice17() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자: ");
		int num = sc.nextInt();
		
		boolean ck1; // for문에서 소수인지 체크해 줄 boolean
		int count = 0;
		
		if (num < 2) {
			System.out.println("잘못 입력하셨습니다.");
		} else {

			for (int i = 2; i <= num; i++) {
				ck1 = false;

				for (int j = 2; j < i; j++) { 
					if (i % j == 0) { 
						ck1 = true;
						break;
					}
				}
				if (ck1 == false) {
					System.out.print(i + " ");
					count++;
				}
			}
		}
		System.out.println();
		System.out.println("2부터 " + num + "까지의 소수의 개수는 " + count + "개입니다.");
		

	}
	
	public void practice18() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("자연수 하나를 입력하세요: ");
		int num = sc.nextInt();
		
		int count = 0;
		
		for(int i = 1; i <= num; i++) {
			if(i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");
				if (i % 6 == 0) {
					count++;
				}
			}
		}
		System.out.println();
		System.out.println("count: " + count);
	}
	
	public void practice19() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력: ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) { // num개의 줄 생성
			for(int j = num; j > 0; j--) {
				if (j > i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
	}
	
	public void practice20() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력: ");
		int num = sc.nextInt();
		
		// 상단 영역
		for(int i = 1; i <= num; i++) { // num개의 줄 생성
			for(int j = 1; j <= num; j++) { 
				if (j <= i) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		// 하단 영역
		for(int i = 1; i <= num; i++) { // num개의 줄 생성
			for(int j = 1; j < num; j++) { // 상단에서 num까지 줄 생성하였으니 하단에서는 num 제외 줄 생성
				if (j >= i) {
					System.out.print("*");
				} 
			}
			System.out.println();
		}
	
	}
	
	public void practice21() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력: ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) { // num개의 줄 생성
			for(int j = num; j > 0; j--) {
				if (j > i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			
			if(i > 1) {
				for(int k = 1; k < i; k++) {
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
		
	}
	
	public void practice22() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력: ");
		int num = sc.nextInt();
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= num; j++) {
				if(i == 1 || i == num) {
					System.out.print("*");
				} else if (j == 1 || j == num) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
	}
	
	/* 
	 * 다중 for문 
	 * */
	
	public void practice23() { // practice 21 활용
		int num = 0;
		// 상단 영역
		for (int i = 1; i <= 5; i++) { // num개의 줄 생성
			for (int j = 5; j > 0; j--) {
				if (j == 1) {
					System.out.print(i);
				} else if(i >= j) {
					System.out.print(++num);
					
				} else {
					System.out.print(" ");
				}
				
			}
			num = 0;
			if (i > 1) {
				for (int k = 1; k < i; k++) {
					System.out.print(i + k);
				}
			}

			System.out.println();
		}
		
		// 하단 영역
		for(int i = 1; i < 5; i++) {
			for (int j = 0; j < 5 ; j++) {
				if(j == 4) {
					System.out.print(j - i);
				} /*
					 * else if(i <= j) { System.out.print(++num); } else { System.out.print(" "); }
					 */
				num = 0;
				if (i > 1) {
					for (int k = 1; k < i; k++) {
						System.out.print(i + k);
					}
				}

			}
		}
	}
	
	public void practice24() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력: ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) { // num개의 줄 생성
			for(int j = num; j > 0; j--) {
				if (j > i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			
			if(i > 1) {
				for(int k = 1; k < i; k++) {
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
	}
	
	public void practice25() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력: ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) { // num만큼 행 만들기
			for(int j = 1; j <= (num * 2); j++) { // num * 2만큼 열 만들기
				if(i == 1 || i == num) { // 행이 첫 번째 혹은 num번째 일 때는 *를 열만큼 출력
					System.out.print("*");
				} else if (j == 1 || j == (num * 2)) { // 열이 첫 번째 혹은 마지막일 때만 * 출력
					System.out.print("*");
				} else { // 열이 첫 번째 혹은 마지막이 아닐 때는 공백
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
	}

}
