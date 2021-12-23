package com.uni.first; // 유사한 클래스들을 묶어주는 패키지

// 한줄 컨트롤 + /
/* 영역, 전체주석 -> 글을 적고 범위를 잡아서 컨트롤 + 시프트 + / */
/*
* 클래스: 
* 최초작성자: 
* Date:
* 설명:
**/

//ctrl + z 실행 뒤로 
//ctrl + y 실행 앞으로
//ctrl + s 저장

public class HelloWorld { // 클래스
// public: 메인 메소드는 외부에서 호출할 수 있다
// static: 객체를 생성하지 않고도 실행시킬 수 있다
// void: 반환되는 값이 없다.
// String[] args: 스트링 배열로 인자를 받겠다
	public static void main(String[] args) { // 실행 메서드
		System.out.println("hi");
		// System.out.println(args[0]);
		// System.out.println(args[1]);
		
		System.out.println("안녕하세요");
		System.out.print("안녕하세요");
		System.out.print("반갑습니다\n"); // \n -> 줄 바꿈
		System.out.print("안녕하세요");
	}

}
