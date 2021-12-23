package com.method.hw1.run;

import com.method.hw1.controller.NonStaticSample;

public class Run {

	
	public static void main(String[] args) {
		NonStaticSample nss = new NonStaticSample();
		
		System.out.print("1. 랜덤값: " );
		nss.printLottoNumbers();
		
		System.out.println();
		
		System.out.print("2. a문자 5개 출력: ");
		nss.outputChar(5, 'a');

		System.out.println();
		
		System.out.print("3. 랜덤 영문자 출력: ");
		System.out.println(nss.alphabette());
		
		System.out.print("4. apple의 2번 4번 인덱스 사이의 값 출력: ");
		String str = nss.mySubstring("apple", 2, 4);
		System.out.println(str);
	}

}
