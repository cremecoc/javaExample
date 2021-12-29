package com.hw1.run;

import com.hw1.model.vo.Guests;
import com.hw1.model.vo.RollerCoaster;

public class Run {

	public static void main(String[] args) {
		Guests[] gs = new Guests[4];
		
		gs[0] = new Guests("홍길동", 17, 'M', 120.2);
		gs[1] = new Guests("김놀부", 20, 'F', 102.3);
		gs[2] = new Guests("김유신", 23, 'M', 110.4);
		gs[3] = new Guests("김흥부", 21, 'M', 112.5);
		
		Guests[] onBoard = new Guests[2];
		
		int count = 0;
		
		try {
			for(int i = 0; i < gs.length; i++) {
				if(gs[i].getHeight() >= RollerCoaster.getCUTHEIGHT()) {
					onBoard[count++] = gs[i];
				}
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("인원이 가득 찼습니다. 다음 차례를 기다리세요");
			System.out.println("=== 이번 차례 탑승 명단 ===");
			System.out.println("이름: " + onBoard[0].getName() + ", 키: " + onBoard[0].getHeight());
			System.out.println("이름: " + onBoard[1].getName() + ", 키: " + onBoard[1].getHeight());
		}

	}

}
