package com.uni.array;

import java.util.Arrays;

public class C_ArraySort {
	
	// 배열 정렬
	
	public void method1() {
		int num1 = 20;
		int num2 = 10;
		
		System.out.println("변경 전");
		System.out.println(num1);
		System.out.println(num2);
		
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("변경 후");
		System.out.println(num1);
		System.out.println(num2);
	}
	
	public void method2() {
		// 인덱스 0번째와 인덱스 1번째 위치를 바꿔 보자
		int[] arr = {2, 1, 3};
		
		System.out.println("변경 전");
		
		
		
		int temp = arr[0]; // 2
		arr[0] = arr[1]; // 1
		arr[1] = temp; // 2
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
		
	}
	
	/*
	 * public void method3() { // 2. 비교 대상을 정하는 for문 System.out.println("i: " + i +
	 * "---->" + arr[i]); System.out.println("i: " + j + "---->" + arr[j]);
	 * if(arr[i] < arr[j]) { System.out.println("=== 교환 발생 === "); int temp =
	 * arr[i]; arr[i] = arr[j]; arr[j] = temp;
	 * 
	 * for (int m = 0; m < arr.length; m++) { System.out.println(arr[m] + " "); }
	 * 
	 * System.out.println(); }
	 * 
	 * System.out.println("최종: "); for(int i = 0; i < arr.length; i++) {
	 * 
	 * } }
	 */
	
	public void method4() {
		int[] arr = {2, 5, 4, 1, 3};
		// 선택정렬 (selection sort)
		// 배열을 전부 탐색하여 최소값을 고르고 왼쪽부터 채워나가는 방식의 정렬
		// 데이터의 양이 적을 때 좋은 성능을 띄는 정렬(교환 횟수가 적음)
		// 하지만 배열을 전부 탐색하여 최소값을 찾아야 하기 때문에 100개 이상의 자료에서는 급격하게 속도 저하
		// 배열의 n번 인덱스 값을 n+1번 ~ 마지막 인덱스까지 비교
		
		// 비교주체 		비교대상
		// i = 0일 때	 	j = 1~5
		// i = 1일 때	 	j = 2~5
		// i = 2일 때	 	j = 3~5
		// i = 3일 때	 	j = 4~5
		// i = 4일 때	 	j = 5~5
		
		// i=0부터 마지막까지 반복할 때
		// j = i+1부터 마지막까지 반복
		
		// 오름차순 정렬
		// 1. 비교 주체를 정하는 for문
		for (int i = 0; i < arr.length; i++) {
			// 2. 비교 대상을 정하는 for문
			for (int j = i + 1; j < arr.length; j++) {
					System.out.println("i: " + i + "---->" + arr[i]); // 
					System.out.println("i: " + j + "---->" + arr[j]); // 5
					if(arr[i] < arr[j]) {
						System.out.println("=== 교환 발생 === ");
						int temp = arr[i]; //2
						arr[i] = arr[j]; // 5
						arr[j] = temp;
						for(int m = 0; m < arr.length; m++) {
							System.out.print(arr[m] + " ");
						}
						System.out.println();
					}
				}
			}
		
		
		System.out.println("최종: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void method5() {
		int[] arr = {2, 5, 4, 1, 3};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
