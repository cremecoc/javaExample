package com.hw2.run;

import com.hw2.model.vo.Circle;
import com.hw2.model.vo.Rectangle;

public class Run {

	public static void main(String[] args) {

		// circle, rectangle 객체 배열 생성
		Circle[] cArr = new Circle[2];
		Rectangle[] rArr = new Rectangle[2];
		
		// 객체 초기화
		cArr[0] = new Circle(1, 2, 3);
		cArr[1] = new Circle(3, 3, 4);
		
		rArr[0] = new Rectangle(-1, -2, 5, 2);
		rArr[1] = new Rectangle(-2, 5, 2, 8);
		
		// 값 출력
		System.out.println("=== circle ===");
		for(int i = 0; i < cArr.length; i++) {
			cArr[i].draw();
		}
		
		// for each문
		for(Circle c : cArr) {
			c.draw();
		}
		
		System.out.println("=== rectangle ===");
		for(int i = 0; i < rArr.length; i++) {
			rArr[i].draw();
		}
		
		// for each문
		for(Rectangle r : rArr) {
			r.draw();
		}

	}

}
