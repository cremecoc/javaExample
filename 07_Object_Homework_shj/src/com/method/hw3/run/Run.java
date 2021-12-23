package com.method.hw3.run;

import com.method.hw3.controller.StaticSample;

public class Run {
	public static void main(String[] args) {
		StaticSample test = new StaticSample();
		
		test.setValue("Java"); // value를 Java로 초기화
		
		System.out.println("value: " + test.getValue());
		
		test.toUpper();
		
		System.out.println("대문자로: " + test.getValue());
		
		System.out.println("길이: " + test.valueLength());
		
		System.out.println("PROGRAMMING 붙여서: " + test.valueConcat("PROGRAMMING"));
		
		test.setChar(0, 'C');
		System.out.print("J => C: " + test.getValue());
	}
}
