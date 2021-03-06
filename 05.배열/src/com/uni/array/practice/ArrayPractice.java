package com.uni.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1() {
		int[] arr = new int[10];
		
		for(int i = 0; i < 10; i++) {
			arr[i] = i + 1; 
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice2() {
		int[] arr = new int[10];
		for(int i = 0; i < 10; i++) {
			arr[i] = i + 1; 
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i = 0; i < 10; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("양의 정수: ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i = 0; i < num; i++) {
			arr[i] = i + 1; 
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice4() {
		String[] arr = {"사과", "귤", "포도", "복숭아", "참외"};
		
		System.out.println(arr[1]);
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);

		int count = 0;

		System.out.println("문자열: ");
		String s = sc.nextLine();

		char[] arr = new char[s.length()];

		System.out.println("문자: ");
		char ch = sc.nextLine().charAt(0);

		System.out.print(s + "에 " + ch + "가 존재하는 위치(인덱스) : ");
		for (int i = 0; i < s.length(); i++) {
			arr[i] = s.charAt(i);
			if (arr[i] == ch) {
				System.out.print(i + " ");
				count++;
			}
		}

		System.out.println("\ni 개수: " + count);
		
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		String[] arr = {"월", "화", "수", "목", "금"};
		
		System.out.println("0 ~ 6 사이 숫자 입력: ");
		int num = sc.nextInt();
		
		if (num >= 0 && num < 7) {
			System.out.println(arr[num] + "요일");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수: "); 
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("배열 " + i + "번째 인덱스에 넣을 값: ");
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		
		System.out.println("\n총합: " + sum);
		
	}
	
	public void practice8() {
		/*
		 * 3이상인 홀수 정수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 
		 * 오름차순으로 값을 넣고, 
		 * 중간 이후부터 끝까지는 1씩 감소하여
		 * 내림차순으로 값을 넣어 출력하세요.
		 *  단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 
		 *  “다시 입력하세요”를 출력하고 다시 정수를 받도록 하세요.
		 */

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("정수: "); 
			int num = sc.nextInt();
			int[] arr = new int[num];
			
			if(num >= 3 || num % 2 == 1) { // 올바르게 입력했을시
				for(int i = 0; i < num; i++) {
				//	for()
				}
			}
			if(num < 3 || num % 2 == 1) {
				System.out.println("다시 입력하세요.");
				 break;
			}
		}
		
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		String[] arr = {"양념", "뿌링클", "간장"};
		
		System.out.println("치킨 이름을 입력하세요: ");
		String s = sc.nextLine();
		
		boolean ck = false;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals(s)) {
				System.out.println(arr[i] + "치킨 배달 가능");
				ck = true;
			}
		}
		
		if(ck == false) {
			System.out.println(s + "치킨은 없는 메뉴입니다.");
		}
	}
	
	public void practice10() {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			int random = (int)(Math.random() * 10 + 1);
			arr[i] = random;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice11() {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			int random = (int)(Math.random() * 10 + 1);
			arr[i] = random;
			System.out.print(arr[i] + " ");
		}
		
		int max = 0;
		int min = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.println("\n최대값: " + max);
		System.out.println("최소값: " + min);
	}
	
	public void practice12() {
		int[] arr = new int[10];
		
		// 1~10 사이의 난수 발생 후 배열에 저장
		for(int i = 0; i < arr.length; i++) {
			int random = (int)(Math.random() * 10 + 1);  // 1~10 사이의 난수 생성
			arr[i] = random;
			
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) { // 중복된 값이 있는 경우
					i--;
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민등록번호(-포함): ");
		String num = sc.nextLine();
		char[] arr = new char[num.length()];
		
		for(int i = 0; i < num.length(); i++) {
			arr[i] = num.charAt(i);
			if(i > 7) { // arr[8]부터는 * 처리
				arr[i] = '*';
			}
			System.out.print(arr[i]);
		}
	}
	
	public void practice14() {
		int[] arr = new int[6];
		
		for(int i = 0; i < arr.length; i++) {
			int random = (int)(Math.random() * 50 + 1);
			arr[i] = random;
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) { // 중복된 값이 있는 경우
					i--;
					break;
				}
			}
			
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
