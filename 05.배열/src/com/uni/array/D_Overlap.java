package com.uni.array;

import java.util.Arrays;
import java.util.Scanner;

public class D_Overlap {
	
	// 중복 제거
	
	public void method1() {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + "번째 정수값");
			
			arr[i] = sc.nextInt();
			
			for(int j = 0; j < i; j++) {
				System.out.println(i + "            " + j);
				
				if(arr[i] == arr[j]) { // 중복된 값이 있는 경우
					System.out.println("중복된 값이 존재합니다.");
					i--;
					System.out.println("i-- : " + i);
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	public void method2() {
		int[] arr = new int[5];
		// 1~10 사이의 난수를 발생시켜 중복 없이 출력
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public void method3() {
		// 배열 10칸, 난수 100, 중복 제거, 오름차순 정렬 + 내림차순 정렬
		
		int[] arr = new int[10]; // 배열 10칸 생성
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100 + 1); // 난수 1~100까지 발생시켜 배열에 삽입
			
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) { // 중복일시 제거
					i--;
					break;
				}
			}
		}
		
		Arrays.sort(arr); // 배열 오름차순 정렬해 주는 함수
		System.out.println(Arrays.toString(arr)); // 배열 출력
		
		// 배열 내림차순 정렬
		for (int i = 0; i < arr.length; i++) { // 비교 주체
			for(int j = i + 1; j < arr.length; j++) { // 비교 대상
				if(arr[i] < arr[j]) { // 주체가 대상보다 작을시에 교환
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
