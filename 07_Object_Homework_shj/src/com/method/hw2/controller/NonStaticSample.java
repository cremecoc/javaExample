package com.method.hw2.controller;

public class NonStaticSample {
	
	public int[] intArrayAllocation(int length) {
		int[] arr = new int[length];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100 + 1);
		}
		return arr;
	}
	
	public void display(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void swap(int[] arr, int idx1, int idx2) {

			int temp = arr[idx1];
			arr[idx1] = arr[idx2];
			arr[idx2] = temp;

	}
	
	public void sortDescending(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) { // 값 비교 arr[i]가 크다면
					swap(arr, i, j); // swap 호출
				}
			}
		}
		display(arr); // display 메서드 호출
	}
	
	public void sortAscending(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) { // arr[i]가 더 작다면
				if(arr[i] < arr[j]) {
					swap(arr, i, j); // swap 메서드 호출
				}
			}
		}
		display(arr); // display 메서드 호출
	}
	
	public int countChar(String str, char c) {
		int count = 0; // str와 c가 같은 개수 출력
		for(int i = 0; i < str.length(); i++) { // str의 길이까지 도는 for문 생성
			if(str.charAt(i) == c) { // str의 i번째와 c가 같다면
				count++; // count에 1 추가
			}
		}
		return count; // count값 반환
	}
	
	public int totalValue(int num1, int num2) {
		int sum = 0;
		for(int i = num2 + 1; i < num1; i++) {
			sum += i;
		}
		return sum;
	}
	
	public char pCharAt(String str, int index) {
		return str.charAt(index);
	}
	
	public String pConcat(String str1, String str2) {
		return str1 + str2;
	}

}
