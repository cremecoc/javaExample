package com.method.hw3.controller;

import java.util.Arrays;

public class StaticSample {

	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public void toUpper() {
		char[] arr = new char[4];
		String str = "";
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = value.charAt(i);
		}
		
		for(int i = 0; i < arr.length; i++) {
			if((int)(value.charAt(i)) > 90) {
				arr[i] = (char)(value.charAt(i) - 32);
				str += arr[i];
			} else {
				str += arr[i];
			}
		}
		setValue(str);
		
	}
	
	public void setChar(int index, char c) {
		char[] arr = value.toCharArray();
		arr[index] = c;
		String str = "";
		
		for(int i = 0; i < arr.length; i++) {
			str += arr[i];
		}
		setValue(str);
		
	}
	
	public int valueLength() {
		return value.length();
	}
	
	public String valueConcat(String str) {
		return value + str;
	}
	
}
