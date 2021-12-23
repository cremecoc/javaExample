package com.uni.chap04_field.run;

import com.uni.chap04_field.model.vo.FieldTest2;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ---------------- 1. FieldTest1
		
		//FieldTest1 f1 = new FieldTest1();
		//f1.test(20);

		// ---------------- 2. FieldTest2
		
		FieldTest2 f2 = new FieldTest2();
		
		// public --> 어디서든 접근 가능
		System.out.println(f2.pub);
		
		// protected --> 같은 패키지 내, 상속 구조에서만 접근 가능
		// System.out.println(f2.pro); 
		// --> 다른 패키지이면서, 상속 구조도 아니기 때문에 접근이 불가능
		
		System.out.println(f2.getPro());
		// getter 메소드를 통해 값을 알아올 수 있다.
		
		// default --> 같은 패키지 내에서만 접근 가능
		System.out.println(f2.getDef()); 
		// 다른 패키지이기 때문에 접근 불가
		
		// private --> 같은 클래스 내에서만 접근 가능
		System.out.println(f2.getPri());
	}

}
