package com.method.hw1.controller;

public class NonStaticSample {
	public void printLottoNumbers() {
		int[] arr = new int[6];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 45 + 1);
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void outputChar(int num, char c) {
		for(int i = 0; i < num; i++) {
			System.out.print(c + " ");
		}
	}
	
	public char alphabette() {
		char ch = (char)(Math.random() * 52 + 65);
		return ch;
	}
	
	public String mySubstring(String str, int index1, int index2) {
		String s = str;
		int i1 = index1;
		int i2 = index2;
		
		
		return s.substring(index1, index2);
	}

}
