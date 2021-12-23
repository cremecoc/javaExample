package com.uni.run;

import com.uni.first.A_MethodPrinter;

public class RunA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1) 실행할 메소드가 있는 클래스를 생성 (new)
		 * [표현법] 클래스명 사용할이름(참조변수) = new 클래스명();
		 */
		A_MethodPrinter a = new A_MethodPrinter(); // ctrl + space => import
		
		/* 2) 생성후 메소드 실행 (호출)
		 * [표현법] 사용할이름.실행할메소드명();
		 */
		a.methodA();

	}

}
