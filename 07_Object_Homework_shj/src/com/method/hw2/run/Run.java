package com.method.hw2.run;

import com.method.hw2.controller.NonStaticSample;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStaticSample test = new NonStaticSample();
		
		System.out.print("- 크기가 5인 배열의 랜덤값: ");
		int[] result = test.intArrayAllocation(5);
		// result에 메소드 호출로 생성한 배열 넣기
		test.display(result); 
		
		System.out.println();
		
		System.out.print("- 내림차순 출력: ");
		test.sortAscending(result);
		
		System.out.println();
		
		System.out.print("- 오름차순 출력: ");
		test.sortDescending(result); // 
		
		System.out.println();
		
		System.out.println("- apple 문자열에 p의 갯수: " + test.countChar("apple", 'p'));
		
		System.out.println("- 13과 7 사이 정수들의 합계: " + test.totalValue(13, 7));
		
		System.out.println("- programming 문자열의 3번 인덱스 문자: " + test.pCharAt("programming", 3));
		
		System.out.println("- JAVA와 programming을 합친 문자열: " + test.pConcat("JAVA", "programming"));

	}

}
