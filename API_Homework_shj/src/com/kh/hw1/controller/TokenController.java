package com.kh.hw1.controller;

import java.util.StringTokenizer;

public class TokenController {

	public String afterToken(String str) {
		StringTokenizer st = new StringTokenizer(str, " ");
		// 처리 후 String 담을 변수 생성
		String newStr = "";
		while(st.hasMoreTokens()) {
			newStr += st.nextToken();
		}
		return newStr;
		
	}
	
	public String firstCap(String input) {
		char[] arr = input.toCharArray();
		arr[0] = Character.toUpperCase(arr[0]);
		return new String(arr);
	}
	
	public int findChar(String input, char one) {
		int count = 0;
		char[] arr = input.toCharArray();
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == one) {
				count++;
			}
		}
		return count;
	}
}
