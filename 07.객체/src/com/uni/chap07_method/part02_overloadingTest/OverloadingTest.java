package com.uni.chap07_method.part02_overloadingTest;

public class OverloadingTest {

	// 오버로딩: 한 클래스 내에서 같은 메소드명으로 정의할 수 있는 방법
	public void test() {}
	
	public void test(int a) {}
	
	public void test(int a, String s) {}
	
	public void test(String s, int a) {} // 순서가 다르기 때문에 가능
	
	public void test(int a, int b) {}
	
	// public void test(int c, int d) {} --> 에러 발생
	// 매개변수 명과는 상관없다
	
	public void test(int a, int b, String str) {}
	
	// public int test(int a, int b, String str) {} --> 에러 발생
	// 반환형과는 상관이 없다. 위와 매개변수가 같기 때문에 에러가 발생한다
	
	// private void test(int a, int b, String str) {} --> 에러 발생
	// 접근제한자와 상관이 없다
	
	/* 
	 * 결론
	 * 오버로딩: 동일한 메소드 명을 사용하는 것, 매개변수의 자료형과 갯수, 순서가 다르게 작성되어야 한다.
	 * (접근제한자, 반환형은 상관없음
	 * */
}
